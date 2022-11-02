package peaksoft.daoImpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import peaksoft.dao.CarDao;
import peaksoft.dao.SocialMediaDao;
import peaksoft.entity.Car;
import peaksoft.entity.SocialMedia;
import peaksoft.util.Util;

public class SocialMediaDaoImpl implements SocialMediaDao {
    SessionFactory sessionFactory = Util.getSessionFactory();


    @Override
    public void createSocialMedia() {

    }

    @Override
    public void saveSocialMedia(SocialMedia socialMedia) {
        try {
            Session session = sessionFactory.openSession();
            session.beginTransaction();
            session.persist(socialMedia);
            session.getTransaction().commit();
            session.close();
        }catch (Exception e){
            System.out.println("Exception save SocialMedia");
        }

    }

    @Override
    public void deleteSocialMediaById(Long id) {
        try {
            Session session =  sessionFactory.openSession();
            session.beginTransaction();
            SocialMediaDao socialMediaDao = session.get(SocialMediaDao.class,id);
            session.remove(id);
            session.getTransaction().commit();
            session.close();
        }catch (Exception e){
            System.out.println("Exception delete Social Media!!");
        }

    }
}
