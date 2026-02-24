package com.robert.taskservice.dto;

import jakarta.validation.constraints.NotBlank;

public record TaskRequestDTO(@NotBlank String title, String description) {
}

