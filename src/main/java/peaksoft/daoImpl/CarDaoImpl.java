package peaksoft.daoImpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import peaksoft.dao.CarDao;
import peaksoft.entity.Car;
import peaksoft.entity.Garage;
import peaksoft.entity.Person;
import peaksoft.util.Util;



public class CarDaoImpl implements CarDao {
    SessionFactory sessionFactory = Util.getSessionFactory();

    @Override
    public void createCarTable() {

    }

    @Override
    public void saveCar(Car car,Long garage_id,Long person_id) {
        try {
            Session session = sessionFactory.openSession();
            session.beginTransaction();
            Garage garage = session.get(Garage.class,garage_id);
            Person person = session.get(Person.class,person_id);
            car.setGarage(garage);
            car.setPersons(person);
            session.persist(car);
            session.getTransaction().commit();
            session.close();
        }catch (Exception e){
            System.out.println("exception save car");
        }

    }

    @Override
    public void deleteCarById(Long id) {
        try( Session session = sessionFactory.openSession()) {
            session.beginTransaction();

            Car car = session.get(Car.class,id);

            session.remove(car);
            session.getTransaction().commit();

        }catch (Exception e){
            System.out.println("exception delete car by id");
        }

    }
}
