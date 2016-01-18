package com.jdk8.utils;

/**
 * Created by Hi on 1/18/2016.
 */
@FunctionalInterface
public interface SortService<T> {
    boolean equals(Object obj);
    int compare(T o1, T o2);
}
