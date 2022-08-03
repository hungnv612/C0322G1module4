package com.example.casestudy.service.Facility;

import com.example.casestudy.model.CustomerModel.Customer;
import com.example.casestudy.model.FacilityMode.Facility;

import java.util.List;
import java.util.Optional;

public interface IFacilityService {
    List<Facility> findAll();

    Optional<Facility> findById(Integer id);

    void remove(Integer id);

    void save(Facility facility);

    void update(Facility facility);

    List<Facility> findByName(String name);
}
