package com.example.casestudy.service.Facility;

import com.example.casestudy.model.FacilityMode.Facility;
import com.example.casestudy.repository.Facility.IFacilityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FacilityService implements IFacilityService {

    @Autowired
    IFacilityRepository iFacilityRepository;

    @Override
    public List<Facility> findAll() {
        return iFacilityRepository.findAll();
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
    public List<Facility> findByName(String name) {
        return iFacilityRepository.findByFacilityNameContaining(name);
    }
}
