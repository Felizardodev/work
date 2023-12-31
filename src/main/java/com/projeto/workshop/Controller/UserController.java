package com.projeto.workshop.Controller;

import com.projeto.workshop.Entities.UserEntity;
import com.projeto.workshop.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserService userService;
    @GetMapping
    public ResponseEntity<List<UserEntity>> findAll(){
        List<UserEntity> list = userService.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<UserEntity> findById(@PathVariable Long id) {
        UserEntity obj = userService.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
