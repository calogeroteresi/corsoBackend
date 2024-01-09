package it.epicode.week1.day1;

public class esercizio3 {

    public static void main(String[] args) {
        System.out.println(calcolaPerimetro(7.8, 5.2));
        System.out.println(controllaPariODispari(17));
        System.out.println(calcolaArea(3.1, 4.5, 6.2));
    }

    public static double calcolaPerimetro(double lato1, double lato2) {
        return 2 * (lato1 + lato2);
    }

    public static String controllaPariODispari(int numero) {
        return (numero % 2 == 0) ? "Pari" : "Dispari";
    }

    public static double calcolaArea(double lato1, double lato2, double lato3) {
        double semiperimetro = (lato1 + lato2 + lato3) / 2;
        return Math.sqrt(semiperimetro * (semiperimetro - lato1) * (semiperimetro - lato2) * (semiperimetro - lato3));
    }

}