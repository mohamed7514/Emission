package com.mohamed.emission;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.mohamed.emission.repos.EmissionRepository;
import com.mohamed.emission.entities.Chaine;
import com.mohamed.emission.entities.Emission;

@SpringBootTest
class EmissionApplicationTests {

	@Autowired
	private  EmissionRepository EmissionRepository;
	@Test
	public void testCreateEmission() {
	Emission Emi = new Emission(null, "Jeudi tout","Jeudi");
	EmissionRepository.save(Emi);
}
	@Test
	public void testFindEmission()
	{
	Emission e = EmissionRepository.findById(1L).get();

	System.out.println(e);
	}
	@Test
	public void testUpdateEmission()
	{
	Emission e = EmissionRepository.findById(2L).get();
	e.setJourEmission("Vendredi");
	EmissionRepository.save(e);
	}
	@Test
	public void testDeleteEmission()
	{
	EmissionRepository.deleteById(1L);;
	}
	@Test
	public void testListerTousEmissions()
	{
	List<Emission> emis = EmissionRepository.findAll();
	for (Emission e : emis)
	{
	System.out.println(e);
	}

	}
	@Test
	public void testFindByNomEmission()
	{
	List<Emission> emis = EmissionRepository.findByNomEmission("jeudi tout");

	for (Emission e : emis)
	{
	System.out.println(e);
	}

	}
	@Test
	public void testFindByNomEmissionContains ()
	{
	List<Emission> emis=EmissionRepository.findByNomEmissionContains("jeudi ");

	for (Emission e : emis)
	{
	System.out.println(e);
	} }
	
	
	/*
	@Test
	public void testfindByNomEmissionJour()
	{List<Emission> emis = EmissionRepository.findByNomEmissionJourEmission("jeudi tout", "vendredi");
	for (Emission e : emis)
	{
	System.out.println(e);
	}

	}*/
	
	/*
	@Test
	public void testfindByChaine()
	{
	Chaine ch = new Chaine();
	ch.setIdChaine(1L);
	List<Emission> emis = EmissionRepository.findByChaine(ch);
	for (Emission e : emis)
	{
	System.out.println(e);
	}

	}*/
}
