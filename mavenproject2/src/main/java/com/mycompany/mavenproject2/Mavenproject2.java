package com.mycompany.mavenproject2;

/**
 * Main application class
 */
public class Mavenproject2 {

    public static void main(String[] args) {
        int first = 10;
        int second = 20;
        int sum = first + second;

        System.out.println(first + " + " + second + " = " + sum);
    }

    // Method to be tested
    public int add(int a, int b) {
        return a + b;
    }

    // Method to be tested
    public String getMessage() {
        return "Hello, NetBeans!";
    }
}