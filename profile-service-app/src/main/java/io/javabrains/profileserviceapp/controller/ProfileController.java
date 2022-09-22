package io.javabrains.profileserviceapp.controller;

//import io.javabrains.profileserviceapp.model.AuthRequest;
import io.javabrains.profileserviceapp.model.Profile;
import io.javabrains.profileserviceapp.service.ProfileService;
//import io.javabrains.profileserviceapp.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class ProfileController {

    @Autowired
    private ProfileService profileService;
//    @Autowired
//    private JwtUtil jwtUtil;
//    @Autowired
//    private AuthenticationManager authenticationManager;


    @PostMapping("/post")
    public ResponseEntity<Profile> saveOrUpdate(@RequestBody Profile profile) {
        return new ResponseEntity<Profile>(profileService.saveOrUpdate(profile), HttpStatus.ACCEPTED);
       
        
    }
    @GetMapping("/get")
    public ResponseEntity<List<Profile>> findAll() {
        return new ResponseEntity<List<Profile>>(profileService.findAll(), HttpStatus.ACCEPTED);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delete(@RequestBody Profile profile) {
        profileService.delete(profile);
        return new ResponseEntity<String>("Profile Deleted", HttpStatus.ACCEPTED);
    }
//    @PostMapping("/authenticate")
//    public String generateToken(@RequestBody AuthRequest authRequest) throws Exception {
//        try {
//            authenticationManager.authenticate(
//                    new UsernamePasswordAuthenticationToken(authRequest.getUserName(), authRequest.getPassword())
//            );
//        } catch (Exception ex) {
//            throw new Exception("Invalid username/password");
//        }
//        return jwtUtil.generateToken(authRequest.getUserName());
//    }
}
