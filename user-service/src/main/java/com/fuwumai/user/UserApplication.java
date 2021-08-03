package com.fuwumai.user;

import com.fuwumai.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
public class UserApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }

    @RestController
    public static class SampleController {

        final
        UserService userService;

        public SampleController(UserService userService) {
            this.userService = userService;
        }

        @GetMapping("/hello")
        public List<String> showForm() {
            return userService.getUsers();
        }
    }

}
