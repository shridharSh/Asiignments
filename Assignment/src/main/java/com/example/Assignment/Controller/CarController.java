package com.example.Assignment.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.Assignment.Entity.Car;
import com.example.Assignment.Repository.CarRepository;

@Controller
public class CarController {	
	
	@Autowired
	CarRepository carRepo;
	
	@RequestMapping("/createCar")
	public String createCar() {
		return "CreateCar";
	}
	
	@RequestMapping("/saveCar")
	public String saveCar(@ModelAttribute("car") Car car) {
		carRepo.save(car);
		return "CreateCar";
	}
	
	@RequestMapping("/showCar")
	public String showCar(ModelMap modelMap) {
		List<Car> findAll = carRepo.findAll();
		modelMap.addAttribute("car", findAll);
		return "ShowCar";
	}
	
	@RequestMapping("/deleteCar")
	public String deleteCar(@RequestParam("id") Long id,ModelMap modelMap) {
		carRepo.deleteById(id);
		List<Car> findAll = carRepo.findAll();
		modelMap.addAttribute("car", findAll);
		return "ShowCar";
	}
	
	@RequestMapping("/updateCar")
	public String updateCar(@RequestParam("id") Long id, ModelMap modelMap) {
		Optional<Car> findById = carRepo.findById(id);
		Car car = findById.get();
		modelMap.addAttribute("car", car);
		return"EditCar";
	}
	
	
	@PutMapping("/editCar")
	public String editCar(@ModelAttribute("car") Car car,ModelMap modelMap) {
		carRepo.save(car);
		List<Car> findAll = carRepo.findAll();
		modelMap.addAttribute("car", findAll);
		return "ShowCar";
	}
	
	@RequestMapping("/searchCar")
	public String searchCar() {
		return "SearchCar";
	}
	
	@RequestMapping("/findCar")
	public String findCar(@ModelAttribute("car") Car car,ModelMap modelMap) {
		List<Car> findCars=carRepo.findCarByName(car.getName());
		modelMap.addAttribute("car", findCars);
		return "FindCars";
	
}
	
}
