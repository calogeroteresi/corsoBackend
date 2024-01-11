
package it.epicode.week1.day4;

public class GestioneDipendente {

    public static void main(String[] args) {
        // Creazione di 4 dipendenti
        Dipendente operaio1 = new Dipendente(1, Dipendente.Dipartimento.PRODUZIONE);
        Dipendente operaio2 = new Dipendente(2, Dipendente.Dipartimento.PRODUZIONE);
        Dipendente impiegato = new Dipendente(3, Dipendente.Dipartimento.AMMINISTRAZIONE);
        Dipendente dirigente = new Dipendente(4, Dipendente.Dipartimento.VENDITE);

        // Stampa lo stato iniziale dei dipendenti
        System.out.println("Stato iniziale dei dipendenti:");
        operaio1.stampaDatiDipendente();
        operaio2.stampaDatiDipendente();
        impiegato.stampaDatiDipendente();
        dirigente.stampaDatiDipendente();

        // Promuovi un operaio a impiegato
        operaio1.promuovi();

        // Promuovi l'impiegato a quadro
        impiegato.promuovi();

        // Stampa lo stato aggiornato dei dipendenti dopo le promozioni
        System.out.println("\nStato dei dipendenti dopo le promozioni:");
        operaio1.stampaDatiDipendente();
        operaio2.stampaDatiDipendente();
        impiegato.stampaDatiDipendente();
        dirigente.stampaDatiDipendente();


        // Calcola la somma degli stipendi con 5 ore di straordinario per ciascun dipendente
        double sommaStipendi = Dipendente.calcolaPaga(operaio1, 5) +
                Dipendente.calcolaPaga(operaio2, 5) +
                Dipendente.calcolaPaga(impiegato, 5) +
                Dipendente.calcolaPaga(dirigente, 5);

        System.out.println("\nSomma degli stipendi con 5 ore di straordinario per ciascun dipendente: " + sommaStipendi);
    }
}

