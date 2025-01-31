package com.web.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.models.Commande;
import com.web.repository.CommandeRepository;

@Service
public class CommandeService {
	@Autowired
	CommandeRepository commandeRepository;
	
	public Commande add(Commande commande) {
		return commandeRepository.save(commande);
	}
	
	public List<Commande> getAll(){
		return commandeRepository.findAll();
	}
}
