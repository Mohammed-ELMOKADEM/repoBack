package com.project.GestionRessources.Model;

import java.sql.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;


@Entity
@Table(name = "Besoin")
public class Besoin {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="besoin_id")
	int id;
	
	
	@Column(name = "date_demande")
	Date dateDemande;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "materiel_id", referencedColumnName = "materiel_id")
	Materiel materiel;
	
	@ManyToOne
	AppelDOffre appelDOffre;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public Date getDateDemande() {
		return dateDemande;
	}
	public void setDateDemande(Date dateDemande) {
		this.dateDemande = dateDemande;
	}
	
	
}
