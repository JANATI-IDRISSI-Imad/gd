package com.web.models;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import org.springframework.web.multipart.MultipartFile;

public class OfferMaping {
	private int id;
	private String nom;
	private MultipartFile img;
	private String  prix;
	private String description;
	public OfferMaping(int id, String nom, MultipartFile img, String prix, String description) {
		super();
		this.id = id;
		this.nom = nom;
		this.img = img;
		this.prix = prix;
		this.description = description;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public MultipartFile getImg() {
		return img;
	}
	public void setImg(MultipartFile img) {
		this.img = img;
	}
	public String getPrix() {
		return prix;
	}
	public void setPrix(String prix) {
		this.prix = prix;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public OfferMaping(Offer offer) {
		this.id=offer.getId();
		this.nom=offer.getNom();
		//this.img.getBytes()=offer.get
	}
	
}
