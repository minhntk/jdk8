package com.jdk8.utils;

/**
 * Created by Hi on 1/11/2016.
 */
@FunctionalInterface
public interface FilterService<T> {
    boolean test(T t);
}
