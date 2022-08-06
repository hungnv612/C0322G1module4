package com.example.casestudy.repository.Facility;

import com.example.casestudy.model.FacilityModel.FacilityType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFacilityTypeRepository extends JpaRepository<FacilityType,Integer> {
}
