package com.jdk8.utils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jdk8.model.Staff;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by MinhNTK on 1/3/2016.
 */
public class JsonUtils {

    private final static String FILE_NAME = "D:\\Research\\jdk8\\src\\main\\resources\\Staff.json";

    public List<Staff> getAllStaffs() {
        try {
            ObjectMapper mapper = new ObjectMapper();
            List<Staff> staffs = mapper.readValue(new File(FILE_NAME),
                                      new TypeReference<List<Staff>>() {});
            return staffs;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return null;
    }
}
