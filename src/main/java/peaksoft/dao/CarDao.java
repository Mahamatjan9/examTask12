package peaksoft.dao;

import peaksoft.entity.Car;

public interface CarDao {

    void createCarTable();
    void saveCar(Car car,Long garage_id,Long person_id);

    void deleteCarById(Long id);
}
