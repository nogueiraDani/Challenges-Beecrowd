package br.com.challenge.beecrowd;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        Integer numberA;
        Integer numberB;
        numberA = scanner.nextInt();
        numberB = scanner.nextInt();
        scanner.close();

        System.out.println("PROD = " + numberA*numberB);
    }
}