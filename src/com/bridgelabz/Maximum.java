package com.bridgelabz;

public class Maximum<T extends Comparable<T>> {
    T x,y,z;

    public Maximum(T x,T y,T z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public T maximum() {
        return Maximum.maximum(x,y,z);
    }
    public static <T extends Comparable<T>> T maximum(T x,T y,T z) {
        T max = x;
        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        printMax(x,y,z,max);
        return max;
    }
    public static <T> void printMax(T x,T y,T z,T max) {
        System.out.println("Max of "+x+", "+y+" and "+z+" is "+max);
    }

    public static void main(String[]args){
        Integer xInt = 4, yInt = 2, zInt = 8;
        new Maximum(xInt, yInt, zInt).maximum();

        Float xFlt = 4.4f, yFlt = 2.2f, zFlt = 8.8f;
        new Maximum(xFlt, yFlt, zFlt).maximum();
    }
}