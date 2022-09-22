package io.javabrains.profileserviceapp.repository;

import io.javabrains.profileserviceapp.model.Profile;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProfileRepository extends MongoRepository<Profile, Integer> {
//    Profile findByUserName(String username);
}
