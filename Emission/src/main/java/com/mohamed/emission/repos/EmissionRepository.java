package com.mohamed.emission.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mohamed.emission.entities.Chaine;
import com.mohamed.emission.entities.Emission;

@Repository
public interface EmissionRepository extends JpaRepository<Emission, Long>{
	List<Emission> findByNomEmission(String nom);
	List<Emission> findByNomEmissionContains(String nom);
	
	/*@Query("select emission from Emission e where e.nomEmission like %?1 and e.JourEmission > ?2")
	List<Emission> findByNomJour (String nom, String jour );
	*/

	@Query("select e from Emission e where e.chaine = ?1")
	List<Emission> findByChaine (Chaine chaine);
	
	List<Emission> findByChaineIdChaine(Long id);
		
	List<Emission> findByOrderByNomEmissionAsc();
	/*
	@Query("select e from Emission e order by e.nomEmission ASC, e.JourEmission DESC")
	List<Emission> trierEmissionsNomsJour ();

	*/

}