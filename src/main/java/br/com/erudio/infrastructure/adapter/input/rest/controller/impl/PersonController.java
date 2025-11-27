package br.com.erudio.infrastructure.adapter.input.rest.controller.impl;

import br.com.erudio.application.port.input.IPersonInputUsecase;
import br.com.erudio.infrastructure.adapter.input.rest.controller.IPersonControllerOpenApi;
import br.com.erudio.infrastructure.adapter.input.rest.dto.person.PersonRequestDTO;
import br.com.erudio.infrastructure.adapter.input.rest.dto.person.PersonResponseDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(path = "/barber-shop-person")
public class PersonController implements IPersonControllerOpenApi {

    @Autowired
    private IPersonInputUsecase iPersonInputUsecase;

    @Override
    @PostMapping(value = "/register", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public PersonResponseDTO register(PersonRequestDTO personRequestDTO) {
        log.info("register() - INICIO: Iniciando registro de pessoa, nome: {} - cpf: {}", personRequestDTO.getFirstName(), personRequestDTO.getCpf());
        PersonResponseDTO registerResponse = iPersonInputUsecase.register(personRequestDTO);

        return registerResponse;
    }
}
