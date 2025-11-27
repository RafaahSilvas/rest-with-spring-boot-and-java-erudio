package br.com.erudio.infrastructure.adapter.input.rest.dto.person;

import io.swagger.v3.oas.annotations.media.Schema;

public record PersonResponseDTO(
        @Schema(name = "Primeiro nome")
        String firstName,
        @Schema(name = "Sobrenome")
        String lastName,
        @Schema(name = "CPF")
        String cpf
) { }
