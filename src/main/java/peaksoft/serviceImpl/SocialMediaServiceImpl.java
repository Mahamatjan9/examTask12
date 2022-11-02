package peaksoft.serviceImpl;

import peaksoft.dao.SocialMediaDao;
import peaksoft.daoImpl.SocialMediaDaoImpl;
import peaksoft.entity.SocialMedia;
import peaksoft.service.SocialMediaService;

public class SocialMediaServiceImpl implements SocialMediaService {
    SocialMediaDao socialMediaDao = new SocialMediaDaoImpl();

    @Override
    public void createSocialMedai() {
        socialMediaDao.createSocialMedia();

    }

    @Override
    public void saveSocialMedia(SocialMedia socialMedia) {
        socialMediaDao.saveSocialMedia(socialMedia);

    }

    @Override
    public void deleteSocialMediaById(Long id) {
        socialMediaDao.deleteSocialMediaById(id);

    }
}
