package org.example.crudbackend.controller;

import org.example.crudbackend.exception.ResourceNotFoundException;
import org.example.crudbackend.model.Employee;
import org.example.crudbackend.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

  @PostMapping("/employees")
  public Employee createEmployee(@RequestBody Employee employee)
  {
    return employeeRepository.save(employee);
  }

  @GetMapping("employees/{id}")
  public ResponseEntity<Employee> getEmployeeById( @PathVariable Long id)
  {
    Employee employee = employeeRepository.findById( id ).orElseThrow(
            () -> new ResourceNotFoundException( "Employee not found with id: " + id ) );

    return ResponseEntity.ok( employee );
  }
}
