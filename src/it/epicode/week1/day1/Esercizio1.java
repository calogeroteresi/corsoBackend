package it.epicode.week1.day1;

import java.util.Scanner;

public class Esercizio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //primo punto
        System.out.println("Dammi il primo numero");
        int a = scanner.nextInt();

        System.out.println("Dammi il secondo numero");
        int b = scanner.nextInt();

        int prodotto = moltiplica(a, b);

        System.out.println(prodotto);


        //secondo punto
        System.out.println("Dammi una stringa");
        String parola = scanner.next();

        System.out.println("Dammi il numero");
        int numero = scanner.nextInt();

        String parolaConcatenata = concatena(parola, numero);

        System.out.println(parolaConcatenata);


        //terzo punto
        String[] parole = {"java", "c++", "javascript", "python", "html"};

        String parolaDaAggiungere = "php";

        String[] paroleAggiunte = inserisciInArray(parole, parolaDaAggiungere);

        for (int i = 0; i <paroleAggiunte.length; i++) {
            System.out.println(paroleAggiunte[i]);
        }



    }

    public static int moltiplica(int a, int b){
        return a*b;
    }

    public static String concatena(String s, int a){
        return s+a;
    }

    public static String[] inserisciInArray(String[] parole, String parolaDaAggiungere){
        String[] paroleAggiunte = {parole[0], parole[1], parolaDaAggiungere, parole[2], parole[3], parole[4]};
        return paroleAggiunte;
    }

}
