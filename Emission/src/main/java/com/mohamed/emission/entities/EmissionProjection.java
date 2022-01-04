package com.mohamed.emission.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name="nomEmission", types = {Emission.class})
public interface EmissionProjection {

	public String getnomEmission();
}
