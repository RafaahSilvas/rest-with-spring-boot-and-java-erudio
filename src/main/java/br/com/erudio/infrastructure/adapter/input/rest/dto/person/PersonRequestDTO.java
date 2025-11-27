package br.com.erudio.infrastructure.adapter.input.rest.dto.person;

import lombok.Getter;

@Getter
public class PersonRequestDTO {
    private String firstName;
    private String lastName;
    private String cpf;
}
