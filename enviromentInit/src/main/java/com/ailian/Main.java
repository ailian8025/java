package com.ailian;

import org.apache.commons.lang3.StringUtils;

public class Main {
    public static void main(String[] args) {
        String message = "Hello, Gradle!";
        System.out.println(message);
        String reversedMessage = StringUtils.reverse(message);
        System.out.println(reversedMessage);
    }
}