package br.com.challenge.beecrowd;

import java.io.IOException;
import java.util.Scanner;

import static java.lang.Float.parseFloat;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        Float gradeA = parseFloat(scanner.next());
        Float gradeB = parseFloat(scanner.next());
        Average average = new Average(gradeA, gradeB);
        System.out.println(average.calculateAverage());

    }
    public static class Average {
        private Float gradeA;
        private Float gradeB;
        private final Float NOTE_WEIGHT_A = 3.5f;
        private final Float NOTE_WEIGHT_B = 7.5f;

        public Average(Float gradeA, Float gradeB) {
            this.gradeA = gradeA;
            this.gradeB = gradeB;
        }

        public String calculateAverage(){
            Float gradeA = this.gradeA * this.NOTE_WEIGHT_A;
            Float gradeB = this.gradeB * this.NOTE_WEIGHT_B;
            Float average = (gradeA + gradeB)/(NOTE_WEIGHT_A + NOTE_WEIGHT_B);
            return toString(average);
        }

        public String toString(Float average) {
            String result = String.format("%.5f",average).replace(",",".");
            return "MEDIA = " + result;
        }
    }
}