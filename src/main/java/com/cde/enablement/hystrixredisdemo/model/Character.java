package com.cde.enablement.hystrixredisdemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

@RedisHash("characters")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Character implements Serializable {

    @Id
    private Long id;
    private String firstName;
    private String lastName;
    private Integer age;
}
