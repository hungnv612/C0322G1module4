package com.example.casestudy.repository.Facility;

import com.example.casestudy.model.FacilityModel.Facility;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFacilityRepository extends JpaRepository<Facility,Integer> {

    Page<Facility> findByFacilityNameContaining(String name, Pageable pageable);
}
