package com.jdk8.run;

import com.jdk8.model.Staff;
import com.jdk8.utils.FilterService;
import com.jdk8.utils.JsonUtils;
import com.jdk8.utils.StaffStream;

import java.util.List;

/**
 * Created by Hi on 1/11/2016.
 */
public class FuncInterMain {
    public static void main(String[] args) {
        List<Staff> staffList =  JsonUtils.getAllStaffs();

        System.out.println("**** Lambda Expression ******");
        List<Staff> filterStaff = new StaffStream<Staff>(staffList)
                                        .filter((d) -> d.getSkills().contains("java")
                                                        && d.getPosition().equals("SSE"));
        for (Staff staff: filterStaff) {
            System.out.println(staff.getFullName());
        }
        System.out.println("*************************");
        System.out.println("");

        System.out.println("*******Java 6 & 7 ***********");
        List<Staff> trafilterStaff = new StaffStream<Staff>(staffList)
                                        .filter(new FilterService<Staff>() {
                                            @Override
                                            public boolean test(Staff staff) {
                                                if (staff.getSkills().contains("java")
                                                        && staff.getPosition().equals("SSE")) {
                                                    return  true;
                                                }
                                                return false;
                                            }
                                        });
        for (Staff staff: trafilterStaff) {
            System.out.println(staff.getFullName());
        }
        System.out.println("*************************");
    }
}
