package peaksoft.service;

import peaksoft.entity.Car;

public interface CarService {
    void createCar();



    void saveCar(Car car,Long garage_id,Long person_id);

    void deleteCarById(Long id);
}
