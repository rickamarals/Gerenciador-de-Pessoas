package com.api.peoplecontrol.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "tb_endereco")
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 150, nullable = false)
    private String logradouro;

    @Column(length = 8, nullable = false)
    private String cep;

    private int numero;

    @Column(length = 30, nullable = false)
    private String cidade;

    @Column(name = "endereco_principal", nullable = false)
    private boolean enderecoPrincipal;
}