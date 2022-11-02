package peaksoft.service;

import peaksoft.entity.SocialMedia;

public interface SocialMediaService {
    void createSocialMedai();
    void saveSocialMedia(SocialMedia socialMedia);

    void deleteSocialMediaById(Long id);
}
