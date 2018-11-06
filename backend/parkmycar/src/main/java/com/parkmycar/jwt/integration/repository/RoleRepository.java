package com.parkmycar.jwt.integration.repository;

import org.springframework.data.repository.CrudRepository;

import com.parkmycar.jwt.integration.domain.Role;

/**
 * Created by Siddesh on 05/Nov/18.
 */
public interface RoleRepository extends CrudRepository<Role, Long> {
}
