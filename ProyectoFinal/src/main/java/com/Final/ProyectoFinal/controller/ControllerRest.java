package com.Final.ProyectoFinal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Final.ProyectoFinal.dto.CropsDto;
import com.Final.ProyectoFinal.repository.CropsRepository;


@RestController
public class ControllerRest {

	@Autowired
	CropsRepository cropsRepository;
	
	@GetMapping("/prueba")
	public List<CropsDto> getAllCrops(){
		
		return cropsRepository.getAllCrops();
	}
	
}
