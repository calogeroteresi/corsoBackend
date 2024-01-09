package it.epicode.week1.day2;

import java.util.Scanner;

public class esercizio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Scrivi un numero");
        int numero = scanner.nextInt();
            if (numero == 0){
                System.out.println("Impossibile avviare un conto alla rovescia");
            } else if (numero < 0) {
                System.out.println("Conto alla rovescia negativo:");
                for (int i = numero; i <= 0; i++) {
                    System.out.println(i);
                }
            }else{
                System.out.println("Conto alla rovescia:");
                for (int i = numero; i >= 0; i--) {
                    System.out.println(i);
                }
            }

        }



    }

