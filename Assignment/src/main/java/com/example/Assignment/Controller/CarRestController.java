package com.example.Assignment.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Assignment.DTO.CarDTO;
import com.example.Assignment.Service.CarService;

@RestController
public class CarRestController {

	@Autowired
	CarService carService;

	@PostMapping(path = "/car/create")
	public CarDTO createCar(@RequestBody CarDTO cardto) {
		return carService.saveData(cardto);
	}

	@GetMapping(path = "/car/retrieve/{id}")
	public CarDTO retrieveData(@PathVariable("id") Long id) {
		CarDTO cardto = carService.findData(id);
		return cardto;
	}

	@PutMapping(path = "/car/update")
	public CarDTO updateCar(@RequestBody CarDTO cardto) {
		return carService.updateData(cardto);
	}

	@DeleteMapping(path = "/car/delete/{id}")
	public void deleteData(@PathVariable("id") Long id) {
		carService.deleteData(id);
	}

	@GetMapping(path = "/car/retrieve")
	public List<CarDTO> retrieveAllData() {
		List<CarDTO> findAllData = carService.findAllData();
		return findAllData;
	}

	@GetMapping(path = "/car/retrieveName/{name}")
	public CarDTO retrieveByName(@PathVariable("name") String name) {
		CarDTO findByName = carService.findByName(name);
		return findByName;
	}
}
