package com.jdk8.run;

import com.jdk8.model.Staff;
import com.jdk8.utils.JsonUtils;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Hi on 1/3/2016.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!"); // Display the string.
        JsonUtils utils = new JsonUtils();
        List<Staff> staffs = utils.getAllStaffs();
        List<Staff> javaStaffList = staffs.stream()
                                .filter((d)->d.getSkills().contains("java")
                                           && d.getPosition().equals("SSE")
                                        )
                                .sorted((f1, f2) -> Long.compare(f2.getAge(), f1.getAge()))
                                .collect(Collectors.toList());
        for (Staff staff: javaStaffList) {
            System.out.println(staff.getFullName());
        }

    }
}
