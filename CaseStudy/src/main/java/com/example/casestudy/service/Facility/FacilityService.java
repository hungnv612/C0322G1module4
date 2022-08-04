package com.example.casestudy.service.Facility;

import com.example.casestudy.model.FacilityMode.Facility;
import com.example.casestudy.repository.Facility.IFacilityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FacilityService implements IFacilityService {

    @Autowired
    IFacilityRepository iFacilityRepository;


    @Override
    public Page<Facility> findAll(Pageable pageable) {
        return iFacilityRepository.findAll(pageable);
    }

    @Override
    public Optional<Facility> findById(Integer id) {
        return iFacilityRepository.findById(id);
    }

    @Override
    public void remove(Integer id) {
        iFacilityRepository.deleteById(id);
    }

    @Override
    public void save(Facility facility) {
        iFacilityRepository.save(facility);
    }

    @Override
    public void update(Facility facility) {

    }

    @Override
    public Page<Facility> findByName(String name, Pageable pageable) {
        return iFacilityRepository.findByFacilityNameContaining(name,pageable);
    }


}
