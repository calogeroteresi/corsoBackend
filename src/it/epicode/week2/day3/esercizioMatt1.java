package it.epicode.week2.day3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneOffset;
import java.time.temporal.ChronoUnit;

 public class esercizioMatt1 {
   public static void main(String[] args) {
        LocalDate ld1 = LocalDate.now();
        LocalTime lt1 = LocalTime.now();

        System.out.println(lt1);
        System.out.println(ld1);

        LocalTime lt2=  LocalTime.of(5,45,45);
        System.out.println(lt2);

        LocalTime lt3 = LocalTime.parse("10:34:45");
        System.out.println(lt3);

        System.out.println(lt1.getHour());
        System.out.println(lt1.until(lt3, ChronoUnit.MINUTES));

        LocalDateTime ltd1 = LocalDateTime.now();
       System.out.println(ltd1);
       System.out.println(ltd1.toEpochSecond(ZoneOffset.UTC));
   }
}
