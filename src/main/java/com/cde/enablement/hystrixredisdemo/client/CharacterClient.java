package com.cde.enablement.hystrixredisdemo.client;

import com.cde.enablement.hystrixredisdemo.client.fallback.CharacterFallback;
import com.cde.enablement.hystrixredisdemo.model.Character;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "character-client", url = "http://localhost:3000", fallback = CharacterFallback.class)
public interface CharacterClient {
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    Character findById(@PathVariable("id") Long id);
}