package br.com.erudio.domain.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigInteger;

@Getter
@Entity
@ToString
@Table(name = "PERSON")
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class PersonEntity {

    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigInteger id;

    @Column(name = "FIRST_NAME", nullable = false, length = 100)
    private String firstName;

    @Column(name = "LAST_NAME", length = 100)
    private String lastName;

    @Column(name = "CPF", nullable = false, length = 11, unique = true)
    private String cpf;
}

