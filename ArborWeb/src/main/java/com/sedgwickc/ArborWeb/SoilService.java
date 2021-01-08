package com.sedgwickc.ArborWeb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import arbordata.Soil;

@Service
public class SoilService implements ISoilService{
	
	@Autowired
	private ISoilRepository soilRepo;

	@Override
	public List<Soil> getSoilsByDrainage(String name) {
		return soilRepo.findByDrainage(name);
	}

	@Override
	public List<Soil> getSoils() {
		return soilRepo.findAll(Sort.by(Direction.ASC, "name"));
	}

	@Override
	public void addSoil(String name, String description, String drainage) {
		soilRepo.save(new Soil(name,description,drainage));
	}

	@Override
	public void saveSoil(Soil s) {
		soilRepo.save(s);
	}

}
