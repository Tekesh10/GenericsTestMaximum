package com.bridgelabz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Maximum<T extends Comparable<T>> {
    T a, b, c, d, e;
    List<T> list = new ArrayList<T>();
    public void sortList() {
        Maximum max = new Maximum(1, 2, 3, 4, 5);
        max.list.add(this.a);
        max.list.add(this.b);
        max.list.add(this.c);
        max.list.add(this.d);
        max.list.add(this.e);

        Collections.sort(max.list);
        System.out.println(max.list);
    }

    public Maximum(T a, T b, T c, T d, T e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    public T maximum() {
        return Maximum.maximum(a, b, c, d, e);
    }
    public static <T extends Comparable<T>> T maximum(T a, T b, T c, T d, T e) {
        T max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        if (d.compareTo(max) > 0) {
            max = d;
        }
        if (e.compareTo(max) > 0) {
            max = e;
        }
        printMax(a, b, c, d, e, max);
        return max;
    }
    public static <T> void printMax(T a, T b, T c, T d, T e, T max) {
        System.out.println("Max of " + a + ", " + b + ", " + c + ", " + d + " and " + e + " is " + max);
    }
    public static void main(String[] args) {
        Integer aInt = 4, bInt = 2, cInt = 32, dInt = 16, eInt = 8;
        new Maximum(aInt, bInt, cInt, dInt, eInt).maximum();
        new Maximum(aInt, bInt, cInt, dInt, eInt).sortList();

        Float aFlt = 4.4f, bFlt = 2.2f, cFlt = 32.2f, dFlt = 16.6f, eFlt = 8.8f;
        new Maximum(aFlt, bFlt, cFlt, dFlt, eFlt).maximum();
        new Maximum(aFlt, bFlt, cFlt, dFlt, eFlt).sortList();

        String aStr = "Apple", bStr = "Mango", cStr = "Peach", dStr = "Banana", eStr = "Grape";
        new Maximum(aStr, bStr, cStr, dStr, eStr).maximum();
        new Maximum(aStr, bStr, cStr, dStr, eStr).sortList();
    }
}