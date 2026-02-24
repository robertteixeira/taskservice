package com.robert.taskservice.exception;

import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

public record ErrorResponse(LocalDateTime now, HttpStatus status, String reasonPhrase, String message, String requestURI) {
}

