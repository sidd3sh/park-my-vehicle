package com.parkmycar.jwt.integration.service;

import java.util.List;

import com.parkmycar.jwt.integration.domain.RandomCity;
import com.parkmycar.jwt.integration.domain.User;

/**
 * Created by Siddesh on 05/Nov/18.
 */
public interface GenericService {
    User findByUsername(String username);

    List<User> findAllUsers();

    List<RandomCity> findAllRandomCities();
}
