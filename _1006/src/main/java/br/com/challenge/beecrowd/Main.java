package br.com.challenge.beecrowd;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        Float gradeA = Float.valueOf(scanner.next());
        Float gradeB = Float.valueOf(scanner.next());
        Float gradeC = Float.valueOf(scanner.next());

        Average average = new Average(gradeA, gradeB, gradeC);
        System.out.println(average.calculateAvarege());
        scanner.close();
    }

    public static class Average {
        private Float gradeA;
        private Float gradeB;
        private Float gradeC;

        final Integer NOTE_WEIGHT_A = 2;
        final Integer NOTE_WEIGHT_B = 3;
        final Integer NOTE_WEIGHT_C = 5;
        final Integer TOTAL_WEIGHT = NOTE_WEIGHT_A + NOTE_WEIGHT_B + NOTE_WEIGHT_C;

        public Average(Float gradeA, Float gradeB, Float gradeC) {
            this.gradeA = gradeA;
            this.gradeB = gradeB;
            this.gradeC = gradeC;
        }

        public String calculateAvarege(){
            Float gradeA = this.gradeA * NOTE_WEIGHT_A;
            Float gradeB = this.gradeB * NOTE_WEIGHT_B;
            Float gradeC = this.gradeC * NOTE_WEIGHT_C;
            Float sum = gradeA + gradeB + gradeC;
            Float result = sum / TOTAL_WEIGHT;
            return getMessage(result);
        }

        private String getMessage(Float result) {
            String value = String.format("%.1f", result).replace(",", ".");
            return "MEDIA = " + value;
        }

    }
}