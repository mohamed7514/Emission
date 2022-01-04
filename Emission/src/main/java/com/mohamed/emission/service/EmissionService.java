package com.mohamed.emission.service;

import java.util.List;

import com.mohamed.emission.entities.Chaine;
import com.mohamed.emission.entities.Emission;

public interface EmissionService {

	Emission saveEmission(Emission e);
	Emission updateEmission(Emission e);
	void deleteEmission(Emission e);
	void deleteEmissionById(Long id);
	Emission getEmission(Long id);
	List<Emission> getAllEmissions();
	List<Emission> findByNomEmission(String nom);
	List<Emission> findByNomEmissionContains(String nom);
	//List<Emission> findByNomJour (String nom, String jour);
	List<Emission> findByChaine (Chaine ch);
	List<Emission> findByChaineIdChaine(Long id);
	List<Emission> findByOrderByNomEmissionAsc();
  //	List<Emission> trierEmissionsNomsJour();

}