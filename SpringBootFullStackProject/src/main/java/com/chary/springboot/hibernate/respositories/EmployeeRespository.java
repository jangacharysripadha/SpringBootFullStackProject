package com.chary.springboot.hibernate.respositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chary.springboot.hibernate.entities.Employee;

@Repository
public interface EmployeeRespository extends JpaRepository<Employee,Long>{

}
