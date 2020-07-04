package com.web.services;

import java.io.File;
import java.io.IOException;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.web.models.Offer;
import com.web.repository.OffersRepository;

@Service
public class OfferService {
	@Autowired
	private OffersRepository offerRepository;
	
	public Offer add(MultipartFile  file,String nom,String prix,String description){
		Offer offer=new Offer(nom,prix,description);
		try {			
			offer.setImg(file.getBytes());
			return offerRepository.save(offer);
		} catch (Exception e) {
			System.out.println(file.toString());
			return offer;
		}
		
	}

	public List<Offer> getAll() {
		
		return offerRepository.findAll();
	}
	
	public void delete(int id) {
		offerRepository.deleteById(id);
	}
	
	public Offer edit(int id,Offer offer) {
		offerRepository.deleteById(id);
		return offerRepository.save(offer);
	}
}
