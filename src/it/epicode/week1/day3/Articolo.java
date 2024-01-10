package it.epicode.week1.day3;

public class Articolo {
    private string codiceArticolo;
    private string descrizioneArticolo;
    private double prezzo;
    private int pezziDisponibili;


    public Articolo (string cArt, string dArt, double pArt, int qArt){
        this.codiceArticolo = cArt;
        this.descrizioneArticolo = dArt;
        this.prezzo = pArt;
        this.pezziDisponibili = qArt;
    }
}
