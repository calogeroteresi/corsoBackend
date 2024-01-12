package it.epicode.week1.progetto;

class Video extends ElementoMultimediale implements Riproducibile {
    private int volume;
    private int luminosita;

    public Video(String titolo, int durata, int volume, int luminosita) {
        super(titolo, durata);
        this.volume = volume;
        this.luminosita = luminosita;
    }

    @Override
    public void play() {
        for (int i = 0; i <= durata; i++) {
            for (int j = 0; j <= volume; j++) {
                System.out.print("!");
            }
            for (int k = 0; k <= luminosita; k++) {
                System.out.print("*");
            }
        }
    }

    @Override
    public void esegui() {
        play();
        System.out.print("");
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
        return "Video con titolo '" + titolo + "', durata " + durata + " secondi, volume " + volume + " e luminosità " + luminosita;
    }



}