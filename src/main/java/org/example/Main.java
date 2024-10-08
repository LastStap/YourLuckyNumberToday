package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random randomNumber = new Random();

        int nextNumber = randomNumber.nextInt(0, 11);

        System.out.println("Your lucky number today: " + nextNumber);
    }
}