package it.epicode.week1.progetto;

public class Immagine extends ElementoMultimediale {
    private int luminosita;

    public Immagine(String titolo, int luminosita) {
        super(titolo, 0);
        this.luminosita = luminosita;
    }

    public void show() {
        for (int i = 0; i < luminosita; i++) {
            System.out.print("*");
        }
    }

    @Override
    public void esegui() {
        show();
        System.out.print("\n");
    }

    public void aumentaLuminosita() {
        luminosita++;
    }

    public void diminuisciLuminosita() {
        if (luminosita > 0) {
            luminosita--;
        }
    }

    @Override
    public String toString() {
        return "Immagine con titolo '" + titolo + "' e luminosità " + luminosita;
    }

}
