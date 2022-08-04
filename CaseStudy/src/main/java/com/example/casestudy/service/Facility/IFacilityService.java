package com.example.casestudy.service.Facility;

import com.example.casestudy.model.CustomerModel.Customer;
import com.example.casestudy.model.FacilityMode.Facility;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface IFacilityService {
    Page<Facility> findAll(Pageable pageable);

    Optional<Facility> findById(Integer id);

    void remove(Integer id);

    void save(Facility facility);

    void update(Facility facility);

    Page<Facility> findByName(String name, Pageable pageable);
}
