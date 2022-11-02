package peaksoft.daoImpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import peaksoft.dao.CompanyDao;
import peaksoft.entity.Company;
import peaksoft.util.Util;

public class CompanyDaoImpl implements CompanyDao {
    SessionFactory sessionFactory = Util.getSessionFactory();


    @Override
    public void createCompanyTable() {
        try(Session session = sessionFactory.openSession()){
            session.beginTransaction();
//            session.createSelectionQuery("create table if not exists Company(" +
//                    "id serial primary key," +
//                    "companyName varchar(30) unique not null," +
//                    "locaition varchar not null)").();
            session.getTransaction().commit();
        }
    }



    @Override
    public void saveCompany(Company company) {
        try {
            Session session = sessionFactory.openSession();
            session.beginTransaction();
            session.persist(company);
            session.getTransaction().commit();
            session.close();

        }catch (Exception e){
            System.out.println("Exception save campany!!!");
        }

    }

    @Override
    public void deleteCompanyById(Long id) {
        try {
            Session session = sessionFactory.openSession();
            session.beginTransaction();
            Company company = session.get(Company.class,id);
            session.remove(company);
            session.getTransaction().commit();
            session.close();
        }catch (Exception e){
            System.out.println("Exception delete company by id");
        }

    }
}
