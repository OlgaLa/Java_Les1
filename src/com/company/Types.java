package com.company;

/**
 * Created by olapanovich on 8.10.16.
 */
public class Types {

    byte byteVar;
    short shortVar;
    int intVar;
    long longVar;
    float floatVar;
    double doubleVar;
    char charVar;
    boolean boolVar;

    void print() {
        System.out.printf("byte: %d \n", byteVar);
        System.out.printf("short: %d\n", shortVar);
        System.out.printf("int: %d\n", intVar);
        System.out.printf("long: %d\n", longVar);
        System.out.printf("float: %f\n", floatVar);
        System.out.printf("double: %f\n", doubleVar);
        System.out.printf("char: %c\n", charVar);
        System.out.println("boolean: " + boolVar);
    }

}
