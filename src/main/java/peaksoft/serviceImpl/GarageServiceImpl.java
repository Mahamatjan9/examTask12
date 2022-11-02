package peaksoft.serviceImpl;

import peaksoft.dao.GarageDao;
import peaksoft.daoImpl.GarageDaoImpl;
import peaksoft.entity.Garage;
import peaksoft.service.GarageService;

public class GarageServiceImpl implements GarageService {
    GarageDao garageDao = new GarageDaoImpl();


    @Override
    public void createGarage() {
        garageDao.createGarageTable();
    }



    @Override
    public void saveGarage(Garage garage,Long car_id) {
        garageDao.saveGarage(garage,car_id);

    }

    @Override
    public void deleteGarageById(Long id) {
        garageDao.deleteGarageById(id);

    }
}
