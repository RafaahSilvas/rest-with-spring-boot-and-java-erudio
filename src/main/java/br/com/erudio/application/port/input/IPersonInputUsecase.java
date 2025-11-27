package br.com.erudio.application.port.input;

import br.com.erudio.infrastructure.adapter.input.rest.dto.person.PersonRequestDTO;
import br.com.erudio.infrastructure.adapter.input.rest.dto.person.PersonResponseDTO;

public interface IPersonInputUsecase {
    PersonResponseDTO register(PersonRequestDTO personRequestDTO);
}
