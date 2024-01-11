package it.epicode.week1.day3;

public class Articolo {
    private String codiceArticolo;
    private String descrizioneArticolo;
    private double prezzo;
    private int pezziDisponibili;


    public Articolo (String cArt, String dArt, double pArt, int qArt){
        this.codiceArticolo = cArt;
        this.descrizioneArticolo = dArt;
        this.prezzo = pArt;
        this.pezziDisponibili = qArt;
    }
}
