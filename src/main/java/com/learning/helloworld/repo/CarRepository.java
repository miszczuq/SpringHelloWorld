package com.learning.helloworld.repo;

import com.learning.helloworld.model.Car;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CarRepository extends CrudRepository<Car, Long> {
    List<Car> findAll();
}
