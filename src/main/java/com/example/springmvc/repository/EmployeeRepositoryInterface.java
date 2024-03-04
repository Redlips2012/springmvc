package com.example.springmvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springmvc.entity.Employee;

public interface EmployeeRepositoryInterface extends JpaRepository<Employee,long> {

}
