package br.com.challenge.beecrowd;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer numberA = scanner.nextInt();
        Integer numberB = scanner.nextInt();

        Integer result = numberA + numberB;

        System.out.println("X = " + result);
        scanner.close();

    }
}