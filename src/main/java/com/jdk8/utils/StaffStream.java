package com.jdk8.utils;

import com.jdk8.model.Staff;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Hi on 1/11/2016.
 */
public class StaffStream {

    private List<Staff> staffs;

    public StaffStream(List<Staff> staffs){
        this.staffs = staffs;
    }
    public List<Staff> filter(FilterService<Staff>  filter) {
        for(Iterator<Staff> iter = staffs.listIterator(); iter.hasNext(); ) {
            Staff staff = iter.next();
            if (!filter.test(staff)) {
                iter.remove();
            }
        }

        return staffs;
    }
}
