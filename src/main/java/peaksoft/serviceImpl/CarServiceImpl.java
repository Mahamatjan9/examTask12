package peaksoft.serviceImpl;

import peaksoft.dao.CarDao;
import peaksoft.daoImpl.CarDaoImpl;
import peaksoft.entity.Car;
import peaksoft.service.CarService;

public class CarServiceImpl implements CarService {
    CarDao carDao = new CarDaoImpl();


    @Override
    public void createCar() {
        carDao.createCarTable();
    }

    @Override
    public void saveCar(Car car,Long garage_id,Long person_id) {
        carDao.saveCar(car,garage_id,person_id);

    }

    @Override
    public void deleteCarById(Long id) {
        carDao.deleteCarById(id);

    }
}
