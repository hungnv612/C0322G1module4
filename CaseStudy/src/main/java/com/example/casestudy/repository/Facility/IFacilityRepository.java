package com.example.casestudy.repository.Facility;

import com.example.casestudy.model.FacilityMode.Facility;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFacilityRepository extends JpaRepository<Facility,Integer> {
}
