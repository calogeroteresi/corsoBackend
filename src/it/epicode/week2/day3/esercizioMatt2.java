package it.epicode.week2.day3;

import java.util.Comparator;
import java.util.TreeSet;

public class esercizioMatt2 {
    public static void main(String[] args) {

        Ordinatore ordinatore = new Ordinatore();

        TreeSet<String> parole = new TreeSet<>((o1, o2) -> o2.compareTo(o1));



        parole.add("Java");
        parole.add("Javascript");
        parole.add("C++");
        parole.add("Python");

        System.out.println(parole);

    }
}
