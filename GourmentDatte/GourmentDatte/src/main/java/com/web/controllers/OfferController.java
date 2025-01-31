package com.web.controllers;

import java.io.IOException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.web.models.Offer;
import com.web.services.OfferService;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class OfferController {
	@Autowired
	private OfferService offerService;
	
	@PostMapping("/offer")
	public void addOffer( @RequestParam("imageFile")MultipartFile file,
			@RequestParam("nom")String nom,
			@RequestParam("prix")String prix,
			@RequestParam("description")String description){	
		//System.out.println("#################"+offer.getNom());
		
		offerService.add(file,nom,prix,description);
	    //return offerService.getAll();
	}
	

	
	@GetMapping("/offer")
	public List<Offer> getAllOffer(){
		
		return offerService.getAll();
	}

	@PutMapping("/offer/{id}")
	public Offer edit(@PathVariable int id,@RequestParam("imageFile")MultipartFile file,
			@RequestParam("nom")String nom,
			@RequestParam("prix")String prix,
			@RequestParam("description")String description){		
		return offerService.edit(id,file,nom,prix,description);
	}
	
	@DeleteMapping("/offer/{id}")
	public void delete(@PathVariable int id){	
		offerService.delete(id);
	}
}
