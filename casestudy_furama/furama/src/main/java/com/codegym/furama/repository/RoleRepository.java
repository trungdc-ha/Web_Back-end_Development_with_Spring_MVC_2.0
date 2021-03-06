package com.codegym.furama.repository;

import com.codegym.furama.entity.Role;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository<Role, Integer> {

    Role findByName(String name);

}
