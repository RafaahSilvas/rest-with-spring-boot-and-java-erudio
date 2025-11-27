package br.com.erudio.domain.entity;

import br.com.erudio.domain.model.enumerator.ERole;
import jakarta.persistence.*;

import java.math.BigInteger;

@Entity
@Table(name = "USER")
public class UserEntity {

    @Id
    @Column(name = "ID",  nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigInteger id;

    @Column(name = "EMAIL", nullable = false, length = 255, unique = true)
    private String email;

    @JoinColumn(name = "ID_PERSON", nullable = false)
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private PersonEntity personEntity;

    @Enumerated(EnumType.STRING)
    @Column(name = "ROLE", nullable = false)
    private ERole role;
}
