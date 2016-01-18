package com.jdk8.utils;

import com.jdk8.model.Staff;

import java.util.ArrayList;
import java.util.Collections;
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

    public List<T> sort(SortService<T>  sort) {
        if (staffs == null || (staffs.size() < 1)) {
            return staffs;
        }

        for (int i = staffs.size() - 1; i >= 0; i--) {
            for (int j = 1; j <= i; j++) {
                T staff1 = staffs.get(j-1);
                T staff2 = staffs.get(j);
                if (sort.compare(staff1, staff2) == -1) {
                    Collections.swap(staffs,j - 1, j);
                }
            }
        }

        return staffs;
    }
}
