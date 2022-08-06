package com.example.casestudy.repository.Facility;


import com.example.casestudy.model.FacilityModel.RentType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRentTypeRepository extends JpaRepository<RentType,Integer> {
}
