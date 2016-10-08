package com.company;

/**
 * Created by olapanovich on 8.10.16.
 */
public class workStrings {

    String myName;
    StringBuilder changedString;
    int charIndex;

    int nameLength() {
        return (myName.length());
    }

    char charInName (int charIndex) {
        return (myName.charAt(charIndex));
    }

    boolean compareStrings(StringBuilder str) {
        return (myName.contentEquals(str));
    }
}


