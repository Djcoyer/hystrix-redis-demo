package com.cde.enablement.hystrixredisdemo.client.fallback;

import com.cde.enablement.hystrixredisdemo.client.CharacterClient;
import com.cde.enablement.hystrixredisdemo.model.Character;
import com.cde.enablement.hystrixredisdemo.repository.CharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CharacterFallback implements CharacterClient {

    private CharacterRepository repository;

    @Autowired
    public CharacterFallback(CharacterRepository repository) {
        this.repository = repository;
        this.repository.save(new Character(1L, "Test", "Character" ,20));
    }

    @Override
    public Character findById(Long id) {
        System.out.println("{id} request in fallback");
        return this.repository.findById(1L).orElse(null);
    }
}