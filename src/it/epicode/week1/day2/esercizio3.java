package it.epicode.week1.day2;

import java.util.Scanner;

public class esercizio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String testo;

        while (true) {
            System.out.println("Inserisci una stringa o 'q' per uscire:");
            testo = scanner.nextLine();

            if (testo.equals("q")) {
                System.out.println("Hai inserito 'q'. Uscita dal programma.");
                break;
            }


            for (int i = 0; i < testo.length(); i++) {
                System.out.print(testo.charAt(i));


                if (i != testo.length() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    }
}
