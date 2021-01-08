package com.sedgwickc.ArborWeb;

import java.util.List;

import arbordata.Soil;

public interface ISoilService {
	
	List<Soil> getSoilsByDrainage(String name);
	List<Soil> getSoils();
	void addSoil(String name, String description, String drainage);
	void saveSoil(Soil s);
	

}
