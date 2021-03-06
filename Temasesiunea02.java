package org.example;
import java.util.Scanner;

public class Temasesiunea02 {
    public static void main(String[] args) {
        double a;
        double b;

        System.out.println("\n" + "\t" + "Calculator IMC (Indice de masa corporala):");

        System.out.println("\n" + "Introduceti inaltimea (cm):");
        a = new Scanner(System.in).nextInt();

        System.out.println("Introduceti greutatea (kg):");
        b = new Scanner(System.in).nextInt();

        if(a > 300 || b > 500) {
            System.out.println("Valori initiale exagerate!" + "\n" + "Reintroduceti valorile initiale.");
        } else {
            double c = a / 100;
            double d = b/(c * c);

            double e = Math.round(d * 100);
            double imc = e/100;

            System.out.println("Valoare IMC = " + imc +".");

            if (imc < 18.5) {
                System.out.println("Grupa de greutate: Subponderal.");
            }
            if (imc >= 18.5 & imc < 25) {
                System.out.println("Grupa de greutate: Greutate normala.");
            }
            if (imc >= 25 & imc < 30) {
                System.out.println("Grupa de greutate: Supraponderal.");
            }
            if (imc >= 30 & imc < 35) {
                System.out.println("Grupa de greutate: Obezitate gradul I.");
            }
            if (imc >= 35 & imc < 40) {
                System.out.println("Grupa de greutate: Obezitate gradul II.");
            }
            if (imc >= 40) {
                System.out.println("Grupa de greutate: Obezitate morbida.");
            }
        }
    }
}