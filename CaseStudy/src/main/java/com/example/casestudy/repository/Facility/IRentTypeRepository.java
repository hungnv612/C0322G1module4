package com.example.casestudy.repository.Facility;


import com.example.casestudy.model.FacilityMode.RentType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRentTypeRepository extends JpaRepository<RentType,Integer> {
}
