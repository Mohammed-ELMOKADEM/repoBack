package com.project.GestionRessources.Model;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Fournisseur")
public class Fournisseur extends Utilisateur{
	
	@Column(name = "nomSociete")
	String nomSociete;
	
	@Column(name = "isBlocked")
	Boolean isBlocked;
	
	@ManyToMany(fetch = FetchType.LAZY,
		      cascade = {
		          CascadeType.PERSIST,
		          CascadeType.MERGE
		      })
	@JoinTable(name = "Propositions",
	        joinColumns = { @JoinColumn(name= "fournisseur_id") },
	        inverseJoinColumns = { @JoinColumn(name = "appelOffre_id") })
	Set<AppelDOffre> AppelDOffres;
	
	public String getNomSociete() {
		return nomSociete;
	}
	public void setNomSociete(String nomSociete) {
		this.nomSociete = nomSociete;
	}
	public Boolean getIsBlocked() {
		return isBlocked;
	}
	public void setIsBlocked(Boolean isBlocked) {
		this.isBlocked = isBlocked;
	}
	
	

}
