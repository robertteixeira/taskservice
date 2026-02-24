package com.robert.taskservice.service;

import com.robert.taskservice.domain.Task;
import com.robert.taskservice.dto.TaskRequestDTO;
import com.robert.taskservice.dto.TaskResponseDTO;
import com.robert.taskservice.exception.TaskNotFoundException;
import com.robert.taskservice.mapper.TaskMapper;
import com.robert.taskservice.repository.TaskRepository;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
@Transactional
public class TaskServiceImpl implements TaskService {

    private final TaskRepository repository;
    private final TaskMapper mapper;

    @Override
    @PrePersist
    public TaskResponseDTO create(TaskRequestDTO request) {
        Task task = mapper.toEntity(request);
        Task saved = repository.save(task);
        return mapper.toResponse(saved);
    }

    @Override
    @PreUpdate
    public TaskResponseDTO update(UUID id, TaskRequestDTO request) {
        Task task = repository.findById(id).orElseThrow(() -> new TaskNotFoundException(id));

        task.setTitle(request.title());
        task.setDescription(request.description());
        // task.setUpdatedAt(LocalDateTime.now());
        // No need to call repository.save() because the entity is managed by EntityManager (state = MANAGED).
        // This method is transactional, which allows the Hibernate to apply the dirty checking to execute the UPDATE
        // when commited.
        return mapper.toResponse(task);
    }

    @Override
    public void delete(UUID id) {
        Task task = repository.findById(id).orElseThrow(() -> new TaskNotFoundException(id));
        repository.delete(task);
    }

    @Override
    @Transactional(readOnly = true)
    public TaskResponseDTO findById(UUID id) {
        Task task = repository.findById(id).orElseThrow(() -> new TaskNotFoundException(id));

        return mapper.toResponse(task);
    }

    @Override
    @Transactional(readOnly = true)
    public List<TaskResponseDTO> findAll() {
        return repository.findAll().stream().map(mapper::toResponse).toList();
    }
}
