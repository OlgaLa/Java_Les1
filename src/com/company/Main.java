package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Task 1
        System.out.println("Task 1" + "\n");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter any info");
        String info  = scanner.nextLine();
        System.out.printf("You have entered: %s \n", info);

        //Task 2
        System.out.println("Task 2" + "\n");
        byte byteVar = 127;
        short shortVar = 32767;
        int intVar = 2147483647;
        long longVar = 9223372036854775807L;
        float floatVar = 4;
        double doubleVar = 111.11235;
        char charVar = 'c';
        boolean boolVar = true;

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
