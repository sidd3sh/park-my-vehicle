package com.parkmycar.jwt.integration.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.parkmycar.jwt.integration.domain.User;

/**
 * Created by Siddesh on 05/Nov/18.
 */
public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}
