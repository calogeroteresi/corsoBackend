package it.epicode.week1.day3;

public class UsoSim {
    @Override
    public String toString() {
        return "UsoSim{}";
    }

    public static void main(String[] args) {
        SIM sim = new SIM("123456789", 0.1);
        sim.setCreditoDisponibile(10.0);

        sim.telefonata(30, "987654321");
        sim.telefonata(20, "555555555");

        sim.stampaDatiSIM();
    }
}
