package com.jose.curso.springboot.app.springboot_crud.security;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public abstract class SimpleGrantedAuthoorityJsonCreator {

    @JsonCreator
    public SimpleGrantedAuthoorityJsonCreator(@JsonProperty("authority") String role) {

    }
}
