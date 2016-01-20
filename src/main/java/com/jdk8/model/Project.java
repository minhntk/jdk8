package com.jdk8.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Optional;

/**
 * Created by Hi on 1/18/2016.
 */
public class Project {

    private final String projectName;
    private final String id;
    private final String industry;
    private final Optional<Customer> customer;


    public Project(@JsonProperty("id") String id,
                   @JsonProperty("name") String name,
                   @JsonProperty("industry") String industry,
                   @JsonProperty("customer") Customer customer) {
        this.projectName = name;
        this.id = id;
        this.industry = industry;
        this.customer = Optional.ofNullable(customer);
    }

    public String getProjectName() {
        return projectName;
    }

    public String getId() {
        return id;
    }

    public Optional<Customer> getCustomer() {
        return customer;
    }
}
