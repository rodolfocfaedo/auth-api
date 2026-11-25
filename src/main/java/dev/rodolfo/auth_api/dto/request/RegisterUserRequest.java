package dev.rodolfo.auth_api.dto.request;

import jakarta.validation.constraints.NotEmpty;

public record RegisterUserRequest(@NotEmpty(message = "Username is required ") String username,
                                  @NotEmpty(message = "Email is required ") String email,
                                  @NotEmpty(message = "Password is required ") String password) {
}
