package peaksoft.dao;

import peaksoft.entity.Garage;

public interface GarageDao {

    void createGarageTable();

    void saveGarage(Garage garage,Long car_id);

    void deleteGarageById(Long id);
}
