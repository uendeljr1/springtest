package org.example.test_spring.resources;

import org.example.test_spring.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
    @GetMapping
    public ResponseEntity<User> findAllUsers() {
        User user = new User(1L,"uendel","uendel@gmail.com","99999","12345");
        return ResponseEntity.ok().body(user);
    }
}
