package mainFile.repository;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class VehicleRepository implements IVehicleRepository{
    private static final List<String> vehicleList;

    static {
        vehicleList = new ArrayList<>();
        vehicleList.add("Tàu bay");
        vehicleList.add("Tàu thuyền");
        vehicleList.add("ô tô");
        vehicleList.add("khác");
    }
    @Override
    public List<String> findAll() {
        return vehicleList;
    }
}
