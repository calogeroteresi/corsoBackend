package it.epicode.week1.day2;

import java.util.Scanner;

public class esercizio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        contaCaratteri(scanner);
        bisestile(scanner);
    }

    public static void contaCaratteri(Scanner scanner) {
        System.out.println("Inserisci la stringa");
        String stringa = scanner.nextLine();

        int lunghezza = stringa.length();

        System.out.println("La lunghezza della stringa è: " + lunghezza);

        if (lunghezza % 2 == 0) {
            System.out.println("Il numero di caratteri è pari.");
        } else {
            System.out.println("Il numero di caratteri è dispari.");
        }
    }

    public static void bisestile(Scanner scanner) {
        System.out.println("Inserisci l'anno");
        int anno = scanner.nextInt();

        if (anno % 4 == 0 && anno % 100 != 0 || anno % 400 == 0 ){
            System.out.println("L'anno è bisestile");
        } else {
            System.out.println("L'anno non è bisestile");
        }
    }
}
