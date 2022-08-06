package com.example.casestudy.repository.employee;

import com.example.casestudy.model.employeeModel.Division;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDivisionRepository extends JpaRepository<Division,Integer> {
}
