package it.epicode.week2.day3;

import java.util.Date;
import java.util.List;

public class UsaLambda {

    public static void main(String[] args) {
        Sommatore sommatore = (a,b) -> a+b;
        System.out.println(sommatore.somma(4,7));

        Verificatore verificatore = (s, c) -> s.length()>c;
        System.out.println(verificatore.verifica("Pallone",5));

        Cerchio cerchio = r -> Math.PI * Math.pow(r,2);
        System.out.println(cerchio.area(5));

        List<Double> lista = List.of(2.0,7.5,5.2,45.1,1.7,2.4,5.5,4.3,5.4);

        SommaLista sommaLista = l -> {double somma = 0;
                                    for (Double d:l){
                                        somma += d;
                                    }
                                        return somma;


    };
        System.out.println(sommaLista.sommaLista(lista));
}}
