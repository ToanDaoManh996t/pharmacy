package com.ominext.trainning.pharmacy.service;

import com.ominext.trainning.pharmacy.request.UserRegistrationDto;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
  User save(UserRegistrationDto registrationDto);
}
