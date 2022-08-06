package com.example.casestudy.service.Facility;

import com.example.casestudy.model.FacilityModel.RentType;
import com.example.casestudy.repository.Facility.IRentTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RentTypeService implements IRentTypeService{

    @Autowired
    IRentTypeRepository iRentTypeRepository;

    @Override
    public List<RentType> findAll() {
        return iRentTypeRepository.findAll();
    }
}
