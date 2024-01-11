package it.epicode.week1.day4;

public class Dipendente {
    // Attributi statici
    private static double stipendioBase = 1000;

    // Attributi di istanza
    private int matricola;
    private double stipendio;
    private double importoOrarioStraordinario = 30;
    private Livello livello;
    private Dipartimento dipartimento;

    // Enumerazione per i livelli
    public enum Livello {
        OPERAIO, IMPIEGATO, QUADRO, DIRIGENTE
    }

    // Enumerazione per i dipartimenti
    public enum Dipartimento {
        PRODUZIONE, AMMINISTRAZIONE, VENDITE
    }

    // Costruttore con matricola e Dipartimento
    public Dipendente(int matricola, Dipartimento dipartimento) {
        this.matricola = matricola;
        this.dipartimento = dipartimento;
        this.stipendio = stipendioBase;
        this.livello = Livello.OPERAIO;
    }

    // Costruttore con tutti i parametri
    public Dipendente(int matricola, double importoOrarioStraordinario, Livello livello, Dipartimento dipartimento) {
        this.matricola = matricola;
        this.importoOrarioStraordinario = importoOrarioStraordinario;
        this.livello = livello;
        this.dipartimento = dipartimento;
        calcolaStipendio();
    }

    // Metodo per ottenere la matricola
    public int getMatricola() {
        return matricola;
    }

    // Metodo per ottenere lo stipendio
    public double getStipendio() {
        return stipendio;
    }

    // Metodo per ottenere il Dipartimento
    public Dipartimento getDipartimento() {
        return dipartimento;
    }

    // Metodo per impostare il Dipartimento
    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }

    // Metodo per ottenere l'importo per ogni ora di straordinario
    public double getImportoOrarioStraordinario() {
        return importoOrarioStraordinario;
    }

    // Metodo per impostare l'importo per ogni ora di straordinario
    public void setImportoOrarioStraordinario(double importoOrarioStraordinario) {
        this.importoOrarioStraordinario = importoOrarioStraordinario;
    }

    // Metodo privato per calcolare lo stipendio in base al livello
    private void calcolaStipendio() {
        switch (livello) {
            case OPERAIO:
                stipendio = stipendioBase;
                break;
            case IMPIEGATO:
                stipendio = stipendioBase * 1.2;
                break;
            case QUADRO:
                stipendio = stipendioBase * 1.5;
                break;
            case DIRIGENTE:
                stipendio = stipendioBase * 2;
                break;
        }
    }
    public void stampaDatiDipendente() {
        System.out.println("Matricola: " + matricola);
        System.out.println("Livello: " + livello);
        System.out.println("Dipartimento: " + dipartimento);
        System.out.println("Stipendio: " + stipendio);
        System.out.println("Importo Orario Straordinario: " + importoOrarioStraordinario);
    }

    // Metodo per promuovere il dipendente e calcolare lo stipendio aggiornato
    public Livello promuovi() {
        switch (livello) {
            case OPERAIO:
                livello = Livello.IMPIEGATO;
                break;
            case IMPIEGATO:
                livello = Livello.QUADRO;
                break;
            case QUADRO:
                livello = Livello.DIRIGENTE;
                break;
            case DIRIGENTE:
                System.out.println("Il dipendente è già di livello DIRIGENTE. Impossibile promuovere.");
                break;
        }

        calcolaStipendio(); // Aggiorna lo stipendio in base al nuovo livello
        return livello;
    }

    // Metodo statico per calcolare la paga mensile di un dipendente
    public static double calcolaPaga(Dipendente dipendente) {
        return dipendente.stipendio;
    }

    // Metodo statico per calcolare la paga mensile comprensiva di straordinario
    public static double calcolaPaga(Dipendente dipendente, int oreStraordinario) {
        double pagaBase = calcolaPaga(dipendente);
        double pagaStraordinario = oreStraordinario * dipendente.importoOrarioStraordinario;
        return pagaBase + pagaStraordinario;
    }
}

