package org.example;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

/*
Test task:

Given a simple String AABBCCD112233.
All you need is to return a new String, that will not contain any duplicates.
The code should be clean, readable and optimized.
 Also, we expect to see test coverage with different test cases.

Please publish your code on GitHub and send us a link.

 */
public class RemovingDuplicates {

    public static final String EMPTY_VALUE = "";

    public static void main(String[] args) {
        System.out.println(removeDuplicates("AABBCCD112233"));
    }

    public static String removeDuplicates(String str) {
        if (str == null || str.length() == 0) return EMPTY_VALUE;

        Set<Character> set = new LinkedHashSet<>();
        StringBuilder result = new StringBuilder();
        str.chars().forEach(c -> {
            if (set.add((char)c)) {
                result.append((char) c);
            }
        });

        return result.toString();
    }


}