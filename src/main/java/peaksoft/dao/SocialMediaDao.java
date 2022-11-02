package peaksoft.dao;

import peaksoft.entity.SocialMedia;

public interface SocialMediaDao {
    void createSocialMedia();

    void saveSocialMedia(SocialMedia socialMedia);

    void deleteSocialMediaById(Long id);
}
