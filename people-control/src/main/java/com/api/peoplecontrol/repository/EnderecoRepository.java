package com.api.peoplecontrol.repository;


import com.api.peoplecontrol.entity.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
}