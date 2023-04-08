package com.project.GestionRessources.Model;

import java.sql.Date;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "appel_offre")
public class AppelDOffre {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="appelDOffre_id")
	int id;
	
	@Column(name = "date_lance")
	Date dateLance;
	
	@Column(name = "date_livraison")
	Date dateLivraison;
	
	@Column(name = "livré")
	boolean livré;
	
	@ManyToMany(fetch = FetchType.LAZY,
		      cascade = {
		          CascadeType.PERSIST,
		          CascadeType.MERGE
		      })
	@JoinTable(name = "Propositions",
	        joinColumns = { @JoinColumn(name= "appelOffre_id") },
	        inverseJoinColumns = { @JoinColumn(name = "fournisseur_id") })
	Set<Fournisseur> fournisseurs;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDateLance() {
		return dateLance;
	}

	public void setDateLance(Date dateLance) {
		this.dateLance = dateLance;
	}

	public Date getDateLivraison() {
		return dateLivraison;
	}

	public void setDateLivraison(Date dateLivraison) {
		this.dateLivraison = dateLivraison;
	}

	public boolean isLivré() {
		return livré;
	}

	public void setLivré(boolean livré) {
		this.livré = livré;
	}

	
	
}
