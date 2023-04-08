package com.project.GestionRessources.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "details_proposition")
public class detailsPropositions {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="detail_id")
	int id;
	
	@Column(name = "prix_materiel")
	float prixMateriel;
	
	@Column(name = "id_proposition")
	int id_proposition;
	
	@ManyToOne
	Materiel materiel;
	

	public float getPrixMateriel() {
		return prixMateriel;
	}

	public void setPrixMateriel(float prixMateriel) {
		this.prixMateriel = prixMateriel;
	}


	public Materiel getMateriel() {
		return materiel;
	}

	public void setMateriel(Materiel materiel) {
		this.materiel = materiel;
	}
	
	
}
