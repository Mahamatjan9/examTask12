package peaksoft.daoImpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import peaksoft.dao.GarageDao;
import peaksoft.entity.Car;
import peaksoft.entity.Garage;
import peaksoft.util.Util;

public class GarageDaoImpl implements GarageDao {
    SessionFactory sessionFactory = Util.getSessionFactory();

    @Override
    public void createGarageTable() {

    }

    @Override
    public void saveGarage(Garage garage,Long car_id) {
        try {
            Session session = sessionFactory.openSession();
            session.beginTransaction();
            Car car = session.get(Car.class,car_id);
            garage.setCars(car);
            session.save(garage);
            session.getTransaction().commit();
            session.close();
        }catch (Exception e){
            System.out.println("Exception save garage!!!");
        }
    }

    @Override
    public void deleteGarageById(Long id) {
        try {
            Session session = sessionFactory.openSession();
            session.beginTransaction();
            peaksoft.entity.Garage garage = session.get(peaksoft.entity.Garage.class,id);
            session.remove(id);
            session.getTransaction().commit();
            session.close();
        }catch (Exception e){
            System.out.println("Exception delete garage!!!");
        }

    }
}
