package com.jdk8.utils;

import com.jdk8.model.Staff;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Hi on 1/11/2016.
 */
public class StaffStream<T> {

    private List<T> staffs;

    public StaffStream(List<T> staffs){
        this.staffs = staffs;
    }
    public List<T> filter(FilterService<T>  filter) {
        for(Iterator<T> iter = staffs.listIterator(); iter.hasNext(); ) {
            T staff = iter.next();
            if (!filter.test(staff)) {
                iter.remove();
            }
        }

        return staffs;
    }
}
