package com.market.servicemarket.service.base;

import com.market.servicemarket.entity.UserDetailsEntity;
import com.market.servicemarket.entity.UserEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    UserDetailsEntity getUserByEmail(String email);
    UserDetailsEntity getUserByNic(String nic);
    UserDetailsEntity getUserOneByEmail(String email);
    void saveUserDetail(UserDetailsEntity userDetailsEntity);
    void saveUser(UserEntity userEntity);
    Boolean isUserAvailableByNameOrNicOrEmail(String username, String email, String nicNumber);
}