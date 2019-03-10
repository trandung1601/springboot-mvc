package service;

import org.springframework.security.core.userdetails.UserDetailsService;

import dto.UserRegistrationDto;
import model.User;


public interface UserService extends UserDetailsService {

    User findByEmail(String email);

    User save(UserRegistrationDto registration);
}
