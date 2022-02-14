package shai.zambrovski.poc.migration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import shai.zambrovski.poc.migration.model.User;
import shai.zambrovski.poc.migration.repository.SimpleRepository;

import java.util.List;

@RestController
public class SimpleController {

    @Autowired
    private SimpleRepository simpleRepository;

    @GetMapping(value = "/users")
    @ResponseBody
    public List<User> getUsers() {
        return simpleRepository.findAll();
    }

}