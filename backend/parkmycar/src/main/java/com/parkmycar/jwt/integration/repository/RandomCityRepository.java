package com.parkmycar.jwt.integration.repository;

import org.springframework.data.repository.CrudRepository;

import com.parkmycar.jwt.integration.domain.RandomCity;
/**
 * Created by Siddesh on 05/Nov/18.
 */
public interface RandomCityRepository extends CrudRepository<RandomCity, Long> {
}
