package com.example.Assignment.Service;

import java.util.List;

import com.example.Assignment.DTO.CarDTO;

public interface CarService {


	CarDTO saveData(CarDTO cardto);

	CarDTO findData(Long id);

	CarDTO updateData(CarDTO cardto);

	void deleteData(Long id);

	List<CarDTO> findAllData();

	CarDTO findByName(String name);



	
	

	

	

}
