package com.jdk8.run;

import com.jdk8.model.Staff;
import com.jdk8.utils.JsonUtils;
import com.jdk8.utils.StaffStream;

import java.util.List;

/**
 * Created by Hi on 1/11/2016.
 */
public class FuncInterMain {
    public static void main(String[] args) {
        List<Staff> staffList =  JsonUtils.getAllStaffs();
        List<Staff> filterStaff = new StaffStream(staffList).filter((d)->d.getSkills().contains(".net"));
        for (Staff staff: filterStaff) {
            System.out.println(staff.getFullName());
        }
    }
}
