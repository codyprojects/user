package com.fuwumai.user.service;

import com.fuwumai.user.api.UserApiDelegate;
import com.fuwumai.user.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UserService implements UserApiDelegate {

    @Override
    public ResponseEntity<User> getUserById(Long userId) {
        var user = new User().id(123L).username("taylor").password("iam");
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    public List<String> getUsers() {
        return Arrays.asList("Hello", "World");
    }
}
