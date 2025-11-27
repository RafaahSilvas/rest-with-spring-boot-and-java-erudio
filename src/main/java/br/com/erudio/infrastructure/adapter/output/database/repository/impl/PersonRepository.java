package br.com.erudio.infrastructure.adapter.output.database.repository.impl;

import br.com.erudio.domain.entity.PersonEntity;
import br.com.erudio.infrastructure.adapter.output.database.repository.IPersonJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonRepository {

    @Autowired
    private IPersonJpaRepository repository;

    public PersonEntity register(PersonEntity personEntity) {
        return repository.save(personEntity);
    }
}
