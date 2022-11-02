package peaksoft.daoImpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import peaksoft.dao.PersonDao;
import peaksoft.entity.Company;
import peaksoft.entity.Person;
import peaksoft.util.Util;

public class PersonDaoImpl implements PersonDao {
    SessionFactory sessionFactory = Util.getSessionFactory();

    @Override
    public void createPersonTaable() {

    }

    @Override
    public void savePerson(Person person,Long compnanies_id) {
        try {
            Session session = sessionFactory.openSession();
            session.beginTransaction();
            Company company = session.get(Company.class,compnanies_id);
            person.setCompnanies(company);
            session.persist(person);
            session.getTransaction().commit();
            session.close();
        }catch (Exception e){
            System.out.println("Exception save person");
        }
    }

    @Override
    public void deletePersonById(Long id) {
        try {
            Session session  = sessionFactory.openSession();
            session.beginTransaction();
            peaksoft.entity.Person person = session.get(peaksoft.entity.Person.class,id);
            session.remove(id);
            session.getTransaction().commit();
            session.close();
        }catch (Exception e){
            System.out.println("Exception delete person");
        }

    }
}
