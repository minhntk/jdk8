package com.jdk8.run;

import com.jdk8.model.Project;
import com.jdk8.model.Staff;

import java.util.Optional;

/**
 * Created by minhtknguyen on 1/25/2016.
 */
public class OptionalMain {
    public static void main(String[] args) {
        Staff staff = new Staff();
        Optional<Staff> staffOptional = Optional.of(staff);
        String name = staffOptional.flatMap(Staff::getProject).map(Project::getProjectName).orElse("UNKNOWN");
        System.out.println("Staff Name: " + name);
    }
}
