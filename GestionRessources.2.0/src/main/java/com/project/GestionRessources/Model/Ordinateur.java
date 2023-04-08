package com.project.GestionRessources.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "Ordinateur")
public class Ordinateur extends Materiel{
	
	@Column(name = "CPU")
	String CPU;
	
	@Column(name = "RAM")
	String RAM;
	
	@Column(name = "Ecran")
	String ecran;
	
	@Column(name = "Stockage")
	String stockage;
	
	
	public String getCPU() {
		return CPU;
	}
	public void setCPU(String cPU) {
		CPU = cPU;
	}
	public String getRAM() {
		return RAM;
	}
	public void setRAM(String rAM) {
		RAM = rAM;
	}
	public String getEcran() {
		return ecran;
	}
	public void setEcran(String ecran) {
		this.ecran = ecran;
	}
	public String getStockage() {
		return stockage;
	}
	public void setStockage(String stockage) {
		this.stockage = stockage;
	}
	
	
	
}
