package br.com.challenge.beecrowd;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Double valorDePi = 3.14159;
        double valorDoRaio;

        Scanner scanner = new Scanner(System.in);
        valorDoRaio = Double.parseDouble(scanner.next());
        Double result = calcularArea(valorDoRaio, valorDePi);
        String resultado  = String.format("%.4f",result).replace(",", ".");

        System.out.println("A=" + resultado);

    }

    public static Double calcularArea(Double valorDoRaio, Double valorDePi) {
        return (valorDoRaio * valorDoRaio) * valorDePi;
    }
}