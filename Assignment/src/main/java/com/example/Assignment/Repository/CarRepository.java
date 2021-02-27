package com.example.Assignment.Repository;




import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.Assignment.Entity.Car;

public interface CarRepository extends JpaRepository<Car, Long> {
	
	@Query("from Car where name=:name")
	List<Car> findCarByName(@Param("name") String name);
	
	Car findByName(String name);
}
