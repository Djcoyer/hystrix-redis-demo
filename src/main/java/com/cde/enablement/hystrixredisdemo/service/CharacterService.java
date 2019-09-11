package com.cde.enablement.hystrixredisdemo.service;

import com.cde.enablement.hystrixredisdemo.client.CharacterClient;
import com.cde.enablement.hystrixredisdemo.model.Character;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CharacterService {

    private CharacterClient client;

    @Autowired
    public CharacterService(CharacterClient client) {
        this.client = client;
    }


    public Character findById(Long id) {
        return this.client.findById(id);
    }
}