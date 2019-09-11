package com.cde.enablement.hystrixredisdemo.repository;

import com.cde.enablement.hystrixredisdemo.model.Character;
import org.springframework.data.repository.CrudRepository;

public interface CharacterRepository extends CrudRepository<Character, Long> {
}
