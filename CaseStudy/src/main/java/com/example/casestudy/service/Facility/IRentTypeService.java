package com.example.casestudy.service.Facility;


import com.example.casestudy.model.FacilityMode.RentType;

import java.util.List;

public interface IRentTypeService {
    List<RentType> findAll();
}
