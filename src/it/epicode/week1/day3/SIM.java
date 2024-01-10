package it.epicode.week1.day3;

public class SIM {

    private String numeroTelefono;
    private double costoPerSecondo;
    private double creditoDisponibile;
    private Chiamata[] ultimeChiamate;
    private int indiceUltimaChiamata;

    public SIM(String numeroTelefono, double costoPerSecondo) {
        this.numeroTelefono = numeroTelefono;
        this.costoPerSecondo = costoPerSecondo;
        this.creditoDisponibile = 0.0;
        this.ultimeChiamate = new Chiamata[5];
        this.indiceUltimaChiamata = 0;
    }

    public void telefonata(int secondi, String numeroChiamato) {
        double costoChiamata = secondi * costoPerSecondo;

        if (creditoDisponibile >= costoChiamata) {
            creditoDisponibile -= costoChiamata;

            Chiamata nuovaChiamata = new Chiamata(secondi, numeroChiamato);
            aggiungiChiamata(nuovaChiamata);
            System.out.println("Chiamata effettuata con successo!");
        } else {
            System.out.println("Credito insufficiente per effettuare la chiamata.");
        }
    }

    private void aggiungiChiamata(Chiamata chiamata) {
        ultimeChiamate[indiceUltimaChiamata] = chiamata;
        indiceUltimaChiamata = (indiceUltimaChiamata + 1) % 5;
    }

    public void stampaDatiSIM() {
        System.out.println("Numero di telefono: " + numeroTelefono);
        System.out.println("Costo al secondo: " + costoPerSecondo);
        System.out.println("Credito disponibile: " + creditoDisponibile + " euro");

        System.out.println("Ultime 5 chiamate registrate:");
        for (Chiamata chiamata : ultimeChiamate) {
            if (chiamata != null) {
                System.out.println("Numero chiamato: " + chiamata.getNumeroChiamato() +
                        ", Durata: " + chiamata.getDurata() + " secondi");
            }
        }
    }

    public double getCreditoDisponibile() {
        return creditoDisponibile;
    }

    public void setCreditoDisponibile(double creditoDisponibile) {
        this.creditoDisponibile = creditoDisponibile;
    }
}

class Chiamata {
    private int durata;
    private String numeroChiamato;

    public Chiamata(int durata, String numeroChiamato) {
        this.durata = durata;
        this.numeroChiamato = numeroChiamato;
    }

    public int getDurata() {
        return durata;
    }

    public String getNumeroChiamato() {
        return numeroChiamato;
    }
}
