package it.epicode.week1.progetto;

class Audio extends ElementoMultimediale implements Riproducibile  {
    private int volume;

    public Audio(String titolo, int durata, int volume) {
        super(titolo, durata);
        this.volume = volume;
    }

    @Override
    public void play() {
        for (int i = 0; i < durata; i++) {
            for (int j = 0; j < volume; j++) {
                System.out.print("!");
            }
        }
    }

    @Override
    public void esegui() {
        play();
        System.out.print(" ");
    }

    public void abbassaVolume() {
        if (volume > 0) {
            volume--;
        }
    }

    public void alzaVolume() {
        volume++;
    }

    @Override
    public String toString() {
        return "Audio con titolo '" + titolo + "', durata " + durata + " secondi e volume " + volume;
    }

}
