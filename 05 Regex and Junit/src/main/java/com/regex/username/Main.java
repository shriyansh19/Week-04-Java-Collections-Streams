package com.regex.username;

public class Main {
    public static void main(String[] args) {
        String[] usernames = {"user_123", "123user", "us"};
        for (String username : usernames) {
            System.out.println(username + ": " + (UsernameValidator.isValidUsername(username) ? "Valid" : "Invalid"));
        }
    }
}