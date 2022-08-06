package com.example.casestudy.service.Facility;

import com.example.casestudy.model.FacilityModel.Facility;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface IFacilityService {
    Page<Facility> findAll(Pageable pageable);

    Optional<Facility> findById(Integer id);

    void remove(Integer id);

    void save(Facility facility);

    void update(Facility facility);

    Page<Facility> findByName(String name, Pageable pageable);
}
