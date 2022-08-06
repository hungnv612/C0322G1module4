package com.example.casestudy.repository.employee;

import com.example.casestudy.model.employeeModel.Position;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPositionRepository extends JpaRepository<Position,Integer> {
}
