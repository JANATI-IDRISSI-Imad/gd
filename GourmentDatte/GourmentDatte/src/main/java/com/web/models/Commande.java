package com.web.models;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "commandes")
public class Commande {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;	
	private int nbr;
	@OneToOne
	private Offer offer;
	
	public Commande() {}

	public Commande(int nbr, Offer offer) {
		super();
		this.nbr = nbr;
		this.offer = offer;
	}
	
	
	public Commande(int id, int nbr, Offer offer) {
		super();
		this.id = id;
		this.nbr = nbr;
		this.offer = offer;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNbr() {
		return nbr;
	}

	public void setNbr(int nbr) {
		this.nbr = nbr;
	}

	public Offer getOffer() {
		return offer;
	}

	public void setOffer(Offer offer) {
		this.offer = offer;
	}
	
	
	
}
