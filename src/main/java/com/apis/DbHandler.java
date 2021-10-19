package com.apis;

import org.springframework.data.repository.CrudRepository;

public interface DbHandler extends CrudRepository<Employee, Integer> {

}
