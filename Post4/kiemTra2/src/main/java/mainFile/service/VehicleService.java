package mainFile.service;

import mainFile.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class VehicleService implements IVehicleService{

    @Autowired
    VehicleRepository vehicleRepository;



    @Override
    public List<String> findAll() {
        return vehicleRepository.findAll();
    }
}
