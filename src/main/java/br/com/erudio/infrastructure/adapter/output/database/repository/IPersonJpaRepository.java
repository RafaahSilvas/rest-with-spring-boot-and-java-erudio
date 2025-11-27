package br.com.erudio.infrastructure.adapter.output.database.repository;

import br.com.erudio.domain.entity.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface IPersonJpaRepository extends JpaRepository<PersonEntity, BigInteger> {

}
