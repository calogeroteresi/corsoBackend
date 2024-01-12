package it.epicode.week1.progetto;

import java.util.Scanner;

public class Esegui {
    private static final int NUMERO_ELEMENTI = 5;
    private static int NUMERO_CORRENTE = 1;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ElementoMultimediale[] elementi = new ElementoMultimediale[NUMERO_ELEMENTI];

        for (int i = 0; i < NUMERO_ELEMENTI; i++) {
            elementi[i] = inserisciElemento(scanner);
        }

        int scelta;
        do {
            System.out.println("Scegli un elemento da eseguire (da 1 a " + NUMERO_ELEMENTI + ", 0 per uscire):\n");
            scelta = Integer.parseInt(scanner.nextLine());

            if (scelta >= 1 && scelta <= NUMERO_ELEMENTI) {
                eseguiElemento(elementi[scelta - 1]);
            } else if (scelta != 0) {
                System.out.println("Scelta non valida. Riprova.");
            }

        } while (scelta != 0);
    }

    private static ElementoMultimediale inserisciElemento(Scanner scanner) {
        ElementoMultimediale elemento = null;

        System.out.println("Inserisci i dettagli per l'elemento " + NUMERO_CORRENTE++);
        System.out.print("Titolo: ");
        String titolo = scanner.nextLine();


        boolean tipoValido = false;

        do {
            System.out.println("Seleziona il tipo di elemento (IMMAGINE, AUDIO, VIDEO): ");
            String tipoElementoStr = scanner.nextLine();

            try {
                TipoElemento tipoElemento = TipoElemento.valueOf(tipoElementoStr.toUpperCase());
                elemento = creaElemento(tipoElemento, titolo, scanner);

                if (elemento == null) {
                    System.out.println("Tipo di elemento non valido. Riprova.");
                } else {
                    tipoValido = true;
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Tipo di elemento non valido. Riprova.");
            }
        } while (!tipoValido);

        return elemento;
    }



    private static ElementoMultimediale creaElemento(TipoElemento tipoElemento, String titolo, Scanner scanner) {
        if (tipoElemento == TipoElemento.AUDIO) {
            System.out.print("Volume: ");
            int volumeAudio = Integer.parseInt(scanner.nextLine());

            System.out.print("Durata: ");
            int durata = Integer.parseInt(scanner.nextLine());
            return new Audio(titolo, durata, volumeAudio);
        } else if (tipoElemento == TipoElemento.VIDEO) {
            System.out.print("Volume: ");
            int volumeVideo = Integer.parseInt(scanner.nextLine());

            System.out.print("Luminosita: ");
            int luminositaVideo = Integer.parseInt(scanner.nextLine());

            System.out.print("Durata: ");
            int durata = Integer.parseInt(scanner.nextLine());
            return new Video(titolo, durata, volumeVideo, luminositaVideo);
        } else if (tipoElemento == TipoElemento.IMMAGINE) {
            System.out.print("Luminosita: ");
            int luminositaImmagine = Integer.parseInt(scanner.nextLine());
            return new Immagine(titolo, luminositaImmagine);
        } else {
            return null;
        }
    }


    private static void eseguiElemento(ElementoMultimediale elemento) {
        if (elemento != null) {
            System.out.println("Esecuzione dell'elemento - " + elemento.toString());
            elemento.esegui();
        } else {
            System.out.println("Elemento non valido.");
        }
    }
}
