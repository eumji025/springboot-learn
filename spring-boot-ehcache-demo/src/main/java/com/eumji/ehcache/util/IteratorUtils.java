package com.eumji.ehcache.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @email eumji025@gmail.com
 * @author:EumJi
 * @date: 2017/11/29
 * @time: 10:33
 */
public class IteratorUtils {

    public static <T> List<T> copyIterator(Iterator<T> iter) {
        List<T> copy = new ArrayList<T>();
        while (iter.hasNext())
            copy.add(iter.next());
        return copy;
    }
}
