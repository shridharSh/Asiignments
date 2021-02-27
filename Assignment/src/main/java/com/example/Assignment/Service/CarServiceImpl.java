package com.example.Assignment.Service;

import java.util.*;

import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Assignment.DTO.CarDTO;
import com.example.Assignment.Entity.Car;
import com.example.Assignment.Exception.RecordNotFoundException;
import com.example.Assignment.Repository.CarRepository;

@Service
public class CarServiceImpl implements CarService {
	@Autowired
	CarRepository carRepo;

	@Override
	public CarDTO saveData(CarDTO cardto) {
		Car car = new Car();
		BeanUtils.copyProperties(cardto, car);
		carRepo.save(car);
		BeanUtils.copyProperties(car, cardto);
		return cardto;
	}

	@Override
	public CarDTO findData(Long id) {
		Car car = carRepo.findById(id)
				.orElseThrow(() -> new RecordNotFoundException("Car id '" + id + "' does no exist"));
		CarDTO cardto = new CarDTO();
		BeanUtils.copyProperties(car, cardto);
		return cardto;
	}

	@Override
	public CarDTO updateData(CarDTO cardto) {
		Optional<Car> findById = carRepo.findById(cardto.getId());
		Car car = new Car();
		if (findById.isPresent()) {
			BeanUtils.copyProperties(cardto, car);
			car = carRepo.save(car);
			BeanUtils.copyProperties(car, cardto);
		} else {
			throw new RecordNotFoundException("Car Resource does no exist");
		}
		return cardto;
	}

	@Override
	public void deleteData(Long id) {
		Optional<Car> findById = carRepo.findById(id);
		if (findById.isPresent()) {
			carRepo.deleteById(id);
		} else {
			throw new RecordNotFoundException("Car id '" + id + "' does no exist");
		}
	}

	@Override
	public List<CarDTO> findAllData() {
		Iterable<Car> findAll = carRepo.findAll();
		List<CarDTO> cars = StreamSupport.stream(findAll.spliterator(), false).map(car -> {
			CarDTO cardto = new CarDTO();
			BeanUtils.copyProperties(car, cardto);
			return cardto;
		}).collect(Collectors.toList());
		return cars;
	}

	@Override
	public CarDTO findByName(String name) {
		Car findByName = carRepo.findByName(name);
		CarDTO cardto = new CarDTO();
		BeanUtils.copyProperties(findByName, cardto);
		return cardto;
	}

}
