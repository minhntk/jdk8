package com.jdk8.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by minhtknguyen on 1/20/2016.
 */
public class Customer {

    private final String name;
    private final String address;

    public Customer(@JsonProperty("name") String name,
                    @JsonProperty("address") String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}
