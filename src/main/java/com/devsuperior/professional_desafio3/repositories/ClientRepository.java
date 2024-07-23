package com.devsuperior.professional_desafio3.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.professional_desafio3.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{
}
