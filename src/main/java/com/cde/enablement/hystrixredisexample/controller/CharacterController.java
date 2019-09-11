package com.cde.enablement.hystrixredisexample.controller;

import com.cde.enablement.hystrixredisexample.client.CharacterClient;
import com.cde.enablement.hystrixredisexample.model.Character;
import com.cde.enablement.hystrixredisexample.service.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/characters")
public class CharacterController {

    private CharacterService service;

    @Autowired
    public CharacterController(CharacterService service) {
        this.service = service;
    }

    @Cacheable(value = "characters", key = "#p0")
    @GetMapping("/{id}")
    public Character findById(@PathVariable("id") Long id) {
        return this.service.findById(id);
    }
}
