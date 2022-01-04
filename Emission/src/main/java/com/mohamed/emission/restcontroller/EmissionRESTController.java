package com.mohamed.emission.restcontroller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.mohamed.emission.entities.Emission;
import com.mohamed.emission.service.EmissionService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class EmissionRESTController {

	@Autowired
	EmissionService emissionService;

	@RequestMapping(method = RequestMethod.GET)
	public List<Emission> getAllProduits() {
		return emissionService.getAllEmissions();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Emission getEmissionById(@PathVariable("id") Long id) {
		return emissionService.getEmission(id);
	}

	@RequestMapping(method = RequestMethod.POST)
	public Emission createEmission(@RequestBody Emission emission) {
		return emissionService.saveEmission(emission);
	}

	@RequestMapping(method = RequestMethod.PUT)
	public Emission updateEmission(@RequestBody Emission emission) {
		return emissionService.updateEmission(emission);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deleteEmission(@PathVariable("id") Long id) {
		emissionService.deleteEmissionById(id);
	}
	/*
	@RequestMapping(value="/prodscat/{idCat}",method = RequestMethod.GET)
	public List<Emission> getEmissionByChaineId(@PathVariable("idChaine") Long idChaine) {
	return emissionService.findByChaineIdChaine(idChaine);
	}*/



}