package com.mohamed.emission.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Chaine {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idChaine;
	private String nomChaine;
	private String frequenceChaine;
	
	@OneToMany(mappedBy = "chaine")
	@JsonIgnore
	private List<Emission> ListEmission;

	public Chaine() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Chaine(String nomChaine, String frequenceChaine) {
		super();
		this.nomChaine = nomChaine;
		this.frequenceChaine = frequenceChaine;
		
	}

	@Override
	public String toString() {
		return "Chaine [idChaine=" + idChaine + ", nomChaine=" + nomChaine + ", frequenceChaine=" + frequenceChaine
				+ ", ListEmission=" + ListEmission + "]";
	}

	public Long getIdChaine() {
		return idChaine;
	}

	public void setIdChaine(Long idChaine) {
		this.idChaine = idChaine;
	}

	public String getNomChaine() {
		return nomChaine;
	}

	public void setNomChaine(String nomChaine) {
		this.nomChaine = nomChaine;
	}

	public String getFrequenceChaine() {
		return frequenceChaine;
	}

	public void setFrequenceChaine(String frequenceChaine) {
		this.frequenceChaine = frequenceChaine;
	}

	public List<Emission> getListEmission() {
		return ListEmission;
	}

	public void setListEmission(List<Emission> listEmission) {
		ListEmission = listEmission;
	}
	
	
}
