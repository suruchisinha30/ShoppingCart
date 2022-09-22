package io.javabrains.profileserviceapp.service;

import io.javabrains.profileserviceapp.model.Profile;
import io.javabrains.profileserviceapp.repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Service
public class ProfileService {

    @Autowired
    private ProfileRepository profileRepository;

    public Profile saveOrUpdate(Profile profile) {
        return profileRepository.save(profile);
    }

    public List<Profile> findAll() {
        return profileRepository.findAll();
    }

    public void delete(Profile profile) {
        profileRepository.delete(profile);
    }
}
