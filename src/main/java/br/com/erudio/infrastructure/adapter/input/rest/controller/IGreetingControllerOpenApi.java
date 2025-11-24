package br.com.erudio.infrastructure.adapter.input.rest.controller;

import br.com.erudio.infrastructure.adapter.input.rest.dto.GreetingResponseDTO;
import org.springframework.web.bind.annotation.PathVariable;

public interface IGreetingControllerOpenApi {

    GreetingResponseDTO getById(@PathVariable(name = "id") long id);
}
