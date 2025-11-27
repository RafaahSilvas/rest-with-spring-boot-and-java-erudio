package br.com.erudio.infrastructure.adapter.input.rest.controller;

import br.com.erudio.infrastructure.adapter.input.rest.dto.person.PersonRequestDTO;
import br.com.erudio.infrastructure.adapter.input.rest.dto.person.PersonResponseDTO;
import org.springframework.web.bind.annotation.RequestBody;

public interface IPersonControllerOpenApi {

    PersonResponseDTO register(@RequestBody PersonRequestDTO personRequestDTO);
}
