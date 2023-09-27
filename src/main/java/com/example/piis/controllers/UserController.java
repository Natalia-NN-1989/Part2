package com.example.piis.controllers;

import com.example.piis.model.dto.UserInfoRequest;
import com.example.piis.model.dto.UserInfoResponse;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

  //  @GetMapping("/q1")
//      public String sayHello(){
//        return "Hello, World!";
//    }
//    @GetMapping
//    public List<String> getUsers(){
//      return List.of("Anna","Maria","Mike");
//    }
//    @GetMapping("/all")
//    public void getUsersAll(){
//
//    }
  @PostMapping
  public UserInfoResponse createUser(@RequestBody UserInfoRequest request) {
     return new UserInfoResponse();
  }
}
