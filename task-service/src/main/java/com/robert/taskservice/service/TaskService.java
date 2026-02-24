package com.robert.taskservice.service;

import com.robert.taskservice.dto.TaskRequestDTO;
import com.robert.taskservice.dto.TaskResponseDTO;

import java.util.List;
import java.util.UUID;

public interface TaskService {

    TaskResponseDTO create(TaskRequestDTO request);

    TaskResponseDTO update(UUID id, TaskRequestDTO request);

    void delete(UUID id);

    TaskResponseDTO findById(UUID id);

    List<TaskResponseDTO> findAll();
}

