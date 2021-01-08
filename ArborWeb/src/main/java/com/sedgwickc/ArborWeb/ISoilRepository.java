package com.sedgwickc.ArborWeb;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import arbordata.Soil;

public interface ISoilRepository extends JpaRepository <Soil, String>{
	
	List<Soil> findByDrainage(String drainage);

}
