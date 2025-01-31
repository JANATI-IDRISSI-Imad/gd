package com.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web.models.Commande;

@Repository
public interface CommandeRepository extends JpaRepository<Commande, Integer>{

}
