package com.cde.enablement.hystrixredisexample.repository;

import com.cde.enablement.hystrixredisexample.model.Character;
import org.springframework.data.repository.CrudRepository;

public interface CharacterRepository extends CrudRepository<Character, Long> {
}
