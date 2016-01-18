package com.jdk8.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by Hi on 1/18/2016.
 */
public class Project {

    private final String projectName;
    private final String id;


    public Project(@JsonProperty("id") String id,
                      @JsonProperty("name") String name) {
        this.projectName = name;
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public String getId() {
        return id;
    }
}
