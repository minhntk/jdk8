package com.jdk8.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Optional;

/**
 * Created by Hi on 1/3/2016.
 */

public class Staff {

    private String id;
    private String fullName;
    private int age;
    private int salary;
    private String position;
    private List<String> skills;
    private final Optional<Project> project;

    private Staff(@JsonProperty("id") String id,
                  @JsonProperty("name") String name,
                  @JsonProperty("birthYear") int age,
                  @JsonProperty("salary") int salary,
                  @JsonProperty("position") String position,
                  @JsonProperty("skills")List<String> skills,
                  @JsonProperty("project")Project project) {
        this.id = id;
        this.fullName = name;
        this.age = age;
        this.salary = salary;
        this.position = position;
        this.skills = skills;
        this.project = Optional.ofNullable(project);
    }

    public String getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public String getPosition() {
        return position;
    }

    public List<String> getSkills() {
        return skills;
    }

    public Optional<Project>  getProject() {
        return project;
    }
}
