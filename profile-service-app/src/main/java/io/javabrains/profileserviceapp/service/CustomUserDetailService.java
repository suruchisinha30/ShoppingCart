//package io.javabrains.profileserviceapp.service;
//
//import io.javabrains.profileserviceapp.model.Profile;
//import io.javabrains.profileserviceapp.repository.ProfileRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//
//@Service
//public class CustomUserDetailService implements UserDetailsService {
//    @Autowired
//    private ProfileRepository profileRepository;
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        Profile profile = profileRepository.findByUserName(username);
//        return new org.springframework.security.core.userdetails.User(profile.getEmailId(), profile.getPassword(),
//                new ArrayList<>());
//    }
//}
