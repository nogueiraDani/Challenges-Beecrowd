package br.com.challenge.beecrowd;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Integer numberA;
        Integer numberB;

        Scanner scanner = new Scanner(System.in);
        numberA = scanner.nextInt();
        numberB = scanner.nextInt();

        Integer sum = Integer.sum(numberA, numberB);
        String message = "SOMA = ";

        System.out.println(message + sum);
    }
}