package com.example.casestudy.repository.Facility;

import com.example.casestudy.model.CustomerModel.Customer;
import com.example.casestudy.model.FacilityMode.Facility;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IFacilityRepository extends JpaRepository<Facility,Integer> {

    Page<Facility> findByFacilityNameContaining(String name, Pageable pageable);
}
