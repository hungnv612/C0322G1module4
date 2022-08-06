package com.example.casestudy.service.Facility;


import com.example.casestudy.model.FacilityModel.FacilityType;
import com.example.casestudy.repository.Facility.IFacilityTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacilityTypeService implements IFacilityTypeService{

    @Autowired
    IFacilityTypeRepository iFacilityTypeRepository;

    @Override
    public List<FacilityType> findAll() {
        return iFacilityTypeRepository.findAll();
    }
}
