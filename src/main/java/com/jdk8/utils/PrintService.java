package com.jdk8.utils;

import java.util.List;

/**
 * Created by Hi on 1/18/2016.
 */
@FunctionalInterface
public interface PrintService<T> {
    void print(T t);
}
