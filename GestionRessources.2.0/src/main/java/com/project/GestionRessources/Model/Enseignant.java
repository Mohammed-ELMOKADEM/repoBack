package com.project.GestionRessources.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Enseignant")
public class Enseignant extends Utilisateur {
	
	@Column(name = "estChef")
	Boolean chef;
	
	@ManyToOne
	Departement Departement;
	

	public Boolean getChef() {
		return chef;
	}

	public void setChef(Boolean chef) {
		this.chef = chef;
	}

	public Departement getDepartement() {
		return Departement;
	}

	public void setDepartement(Departement departement) {
		Departement = departement;
	}

	
	
	
	

}
