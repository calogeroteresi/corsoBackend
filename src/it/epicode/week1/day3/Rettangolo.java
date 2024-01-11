package it.epicode.week1.day3;

public class Rettangolo {

    private double base;
    private double altezza;

    public Rettangolo (double base, double altezza){
        this.base = base;
        this.altezza= altezza;
    }

    // Metodo per calcolare l'area
    private double calcolaArea(){
        return base * altezza;
    }


    // Metodo per calcolare il perimetro
    private double calcolaPerimetro(){
        return (base + altezza) * 2;
    }

    // Metodo per stampare area e perimetro di un singolo rettangolo
    public void stampaRettangolo(){
        double area = calcolaArea();
        double perimetro = calcolaPerimetro();

        System.out.println("Area: " + area);
        System.out.println("Perimetro: " + perimetro);
    }

      // Metodo per stampare area e perimetro di due rettangoli
    public void stampaDueRettangoli(Rettangolo rettangolo1, Rettangolo rettangolo2){
        System.out.println("Rettangolo 1:");
        rettangolo1.stampaRettangolo();

        System.out.println("\nRettangolo 2:");
        rettangolo2.stampaRettangolo();
    }
}
