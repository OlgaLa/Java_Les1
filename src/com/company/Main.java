package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

       // Task 1
        System.out.println("Task 1" + "\n");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter your name");
        String name  = scanner.nextLine();
        System.out.printf("You have entered: %s \n", name);

        //Task 2
        System.out.println("Task 2" + "\n");
        Types types = new Types();

        types.byteVar = 127;
        types.shortVar  = 32767;
        types.intVar = 2147483647;
        types.longVar = 9223372036854775807L;
        types.floatVar = 4;
        types.doubleVar = 111.11235;
        types.charVar = 'c';
        types.boolVar = true;

        types.print();

        //Task 3
        System.out.println("Task 3" + "\n");
        workStrings strObj = new workStrings();

        strObj.myName = name;
        char[] selectedChars = new char[strObj.nameLength()];

        int srcBegin = 0;
        int srcEnd = strObj.nameLength() - 1;

        if (!(strObj.myName.isEmpty())) {
            // length
            System.out.printf("Name's length: %d", strObj.nameLength());

            //char in string
            System.out.println("\nEnter index between 0 and " + (strObj.nameLength()-1));
            strObj.charIndex  = scanner.nextInt();
            System.out.printf("\nChar: %c", strObj.charInName(strObj.charIndex));

            //select several chars from string
            System.out.print("\nSelected chars ");
            strObj.myName.getChars(srcBegin, srcEnd, selectedChars, 0);
            System.out.println(selectedChars);

            //check if the name starts with "o"
            System.out.print("\nName starts with 'o': " + strObj.myName.startsWith("o"));
        }
        else {
            System.out.println("You have entered the empty name");
        }

        //compare strings
        System.out.println("\nEnter the new string");
        strObj.changedString = new StringBuilder(scanner.next());
        System.out.print("Name and new string are equal: " + strObj.compareStrings(strObj.changedString));

        //concat the strings
        System.out.print("\nString after contatination:" + strObj.changedString.toString().concat(strObj.myName));

        //replace strings
        System.out.print("\nReplace part of string: " + strObj.changedString.replace(srcBegin, strObj.changedString.length()-1, strObj.myName));
    }
}
