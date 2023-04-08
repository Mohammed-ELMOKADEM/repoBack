package com.project.GestionRessources.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Inheritance(strategy = InheritanceType.JOINED)
@Entity
@Table(name="Materiel")
public class Materiel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="materiel_id")
	int id;
	
	@Column(name = "marque")
	String marque;
	
	@OneToOne(mappedBy = "materiel")
	Besoin besoin;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public Besoin getBesoin() {
		return besoin;
	}

	public void setBesoin(Besoin besoin) {
		this.besoin = besoin;
	}
	
	
}
