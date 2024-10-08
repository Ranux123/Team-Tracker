package org.example.crudbackend.controller;

import org.example.crudbackend.model.Employee;
import org.example.crudbackend.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/manager")
public class EmployeeController
{
  @Autowired
  private EmployeeRepository employeeRepository;

  @GetMapping( "/employees" )
  public List<Employee> getAllEmployees()
  {
    return employeeRepository.findAll();
  }
}
