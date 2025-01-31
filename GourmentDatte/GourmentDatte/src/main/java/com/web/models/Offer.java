package com.web.models;




import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import org.springframework.web.multipart.MultipartFile;


@Entity
@Table(name = "offer")
public class Offer {

	
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int id;
	@Column(name = "nom")
	private String nom;
	@Column(name = "img", length = 1000000000)
	private byte[] img;
	@Column(name = "prix")
	private String  prix;
	@Column(name = "description")
	private String description;
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

	public byte[] getImg() {
		return img;
	}
	public void setImg(byte[] img) {
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


	public Offer(String nom,  String prix, String description) {
		super();
		this.nom = nom;
		this.prix = prix;
		this.description = description;
	}
	public Offer(String nom ,MultipartFile file, String prix, String description) {
		try {
			this.setImg(file.getBytes());
			this.nom = nom;
			this.prix = prix;
			this.description = description;
		} catch (Exception e) {
			
		}
		
	}
	
	public Offer() {
		super();
	}
	public Offer(String nom, byte[] img, String prix, String description) {
		super();
		this.nom = nom;
		this.img = img;
		this.prix = prix;
		this.description = description;
	}


	
	
	
	
	
}


