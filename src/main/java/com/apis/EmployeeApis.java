package com.apis;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeApis {
	
	@Autowired
	private DbHandler dbHandler;
	
	public DbHandler getDbHandler() {
		return dbHandler;
	}

	public void setDbHandler(DbHandler dbHandler) {
		this.dbHandler = dbHandler;
	}

	@RequestMapping("/allemployees")
	public List<Employee> getAllEmployee(){
		List<Employee> list = new ArrayList<Employee>();
		
		dbHandler.findAll().forEach(list::add);
		return list;
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/addEmployee")
	public void addEmployee(@RequestBody Employee emp) {
		dbHandler.save(emp);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/updateEmployee")
	public void deleteEmployee(@RequestBody Employee emp) {
		dbHandler.save(emp);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/deleteEmployee/{id}")
	public void deleteEmployee(@RequestBody Employee emp,@PathVariable int id) {
		dbHandler.delete(emp);
	}
}
