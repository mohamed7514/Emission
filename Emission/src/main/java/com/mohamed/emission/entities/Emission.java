package com.mohamed.emission.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Emission {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idEmission ; 
	private String nomEmission ; 
	private String jourEmission;
	@ManyToOne
	@JsonIgnore
	private Chaine chaine ;
	
	public Emission() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emission(Long id, String nomEmission, String jourEmission) {
		super();
		this.idEmission = id ;
		this.nomEmission = nomEmission;
		this.jourEmission = jourEmission;
	}
	public Long getIdEmission() {
		return idEmission;
	}
	public void setIdEmission(Long idEmission) {
		this.idEmission = idEmission;
	}
	public String getNomEmission() {
		return nomEmission;
	}
	public void setNomEmission(String nomEmission) {
		this.nomEmission = nomEmission;
	}

	public String getJourEmission() {
		return jourEmission;
	}
	public void setJourEmission(String jourEmission) {
		this.jourEmission = jourEmission;
	}
	public Chaine getChaine() {
		return chaine;
	}
	public void setChaine(Chaine chaine) {
		this.chaine = chaine;
	}
	@Override
	public String toString() {
		return "Emission [idEmission=" + idEmission + ", nomEmission=" + nomEmission + ", jourEmission=" + jourEmission
				+ ", chaine=" + chaine + "]";
	}
	
	
	
	
	
	
	
	
	

}
