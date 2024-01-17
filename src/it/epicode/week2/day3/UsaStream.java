package it.epicode.week2.day3;

import it.epicode.week1.day3.Articolo;

import java.util.List;
import java.util.stream.Stream;

public class UsaStream {
    public static void main(String[] args) {

        List<Integer> numeri = List.of(2,5,7,9,3,9);

        Stream<Integer> streamNumeri= numeri.stream();
        Stream<Integer> s1 = Stream.of(3,6,7,9,1,3);

        Stream<String> s2 = Stream.<String>builder().
        add("C").add("Javascript").build();

        for(Integer i:numeri){
            if(i%2==0){
                System.out.println(i);
            }
        }

        streamNumeri.filter(i -> i%2==0).forEach(System.out::println);

        System.out.println(numeri.stream().filter(i->i%2!=0).count());

        System.out.println(numeri.stream().filter(i->i%2!=0 && i>3).sorted().toList());



    }
}
