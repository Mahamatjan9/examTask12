package peaksoft.service;

import peaksoft.dao.GarageDao;
import peaksoft.entity.Garage;

public interface GarageService {
    void createGarage();



    void saveGarage(Garage garage,Long car_id);

    void deleteGarageById(Long id);
}
