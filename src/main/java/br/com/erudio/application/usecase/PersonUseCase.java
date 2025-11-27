package br.com.erudio.application.usecase;

import br.com.erudio.application.port.input.IPersonInputUsecase;
import br.com.erudio.domain.entity.PersonEntity;
import br.com.erudio.infrastructure.adapter.input.rest.dto.person.PersonRequestDTO;
import br.com.erudio.infrastructure.adapter.input.rest.dto.person.PersonResponseDTO;
import br.com.erudio.infrastructure.adapter.output.database.repository.IPersonJpaRepository;
import br.com.erudio.infrastructure.adapter.output.database.repository.impl.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
* As usecase na arquitetura hexagonal são para validar fluxos de aplicação, portanto não podem ter regras de dominio
* */
@Service
public class PersonUseCase implements IPersonInputUsecase {

    @Autowired
    private PersonRepository personRepository;

    public PersonResponseDTO register(PersonRequestDTO personRequestDTO) {
        PersonEntity personEntity = new PersonEntity(null, personRequestDTO.getFirstName(), personRequestDTO.getLastName(), personRequestDTO.getCpf());
        PersonEntity save = personRepository.register(personEntity);
        return new PersonResponseDTO(save.getFirstName(), save.getLastName(), save.getCpf());
    }
}
