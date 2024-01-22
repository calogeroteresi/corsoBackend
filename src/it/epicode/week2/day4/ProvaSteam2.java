package it.epicode.week2.day4;

import java.util.*;
import java.util.stream.Collectors;

public class ProvaSteam2 {

    public static void main(String[] args) {
        List<String> so = List.of("Windows", "Ios", "Android", "Linux");
        List<String> so2 = so.stream().filter(s-> s.length()>4).collect(Collectors.toList());

        System.out.println(so2);

        List<String> so3 = so.stream().filter(s -> s.length()>4).collect(Collectors.toUnmodifiableList());

        Set<String> soSet = so.stream().filter(s -> s.length()>4).collect(Collectors.toSet());


        Set<String> soSet2 = so.stream().filter(s -> s.length()>4).collect(Collectors.toUnmodifiableSet());

        System.out.println(soSet);

        List<String> so4 = so.stream().filter(s-> s.length()>4).collect(Collectors.toCollection(LinkedList::new));

        System.out.println(so4);

        String parola = so.stream().collect(Collectors.joining(", ", "SO: ", "."));

        System.out.println(parola);

        System.out.println(so.stream().collect(Collectors.summingInt(String::length)));

        System.out.println(so.stream().collect(Collectors.averagingInt(String::length)));

        System.out.println(so.stream().collect(Collectors.summarizingInt(String::length)));

        System.out.println(so.stream().map(String::length).collect(Collectors.minBy(Comparator.naturalOrder())).get());

        System.out.println(so.stream().collect(Collectors.groupingBy(s -> s.length(), Collectors.counting())));

        Map<Boolean,Long> mappa = so.stream().collect(Collectors.partitioningBy(s -> s.length()>3, Collectors.counting()));
        System.out.println(mappa);

        System.out.println(so.stream().limit(2).collect(Collectors.toList()));

        System.out.println(so.stream().mapToInt(String::length).max().getAsInt());

        System.out.println(so.stream().mapToInt(String::length).average().getAsDouble());
    }

}
