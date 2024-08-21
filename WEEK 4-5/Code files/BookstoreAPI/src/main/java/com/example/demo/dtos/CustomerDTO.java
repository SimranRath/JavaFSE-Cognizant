package com.example.demo.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CustomerDTO {

    private Long id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("email")
    private String email;

    @JsonProperty("password")
    private String password;

    // Getters and setters
}
