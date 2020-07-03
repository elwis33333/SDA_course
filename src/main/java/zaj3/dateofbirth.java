package zaj3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Locale;

public class dateofbirth {
    public static void main(String[] args) throws ParseException {
        LocalDate date = LocalDate.now();
        System.out.println(date);
        LocalDate date2 = date.plusDays(1000); //PONIEWAŻ OBIEKT LOCALDATE JEST PO UTWORZENIU NIEZMIENIALNY
        System.out.println(date +"     "+date2);
        LocalDateTime date3 = LocalDateTime.now();
        System.out.println(date3);
        LocalDateTime date4 = LocalDateTime.of(2019,10,3,1,30,10,10);
        System.out.println(date4);
/* wypisanie wszystkich stref
        for (String availableZoneId : ZoneId.getAvailableZoneIds()) {
            System.out.println(availableZoneId);
        }
*/
        ZonedDateTime now2 =ZonedDateTime.now(ZoneId.of("Asia/Kamchatka"));
        System.out.println(now2);
        // OBECNY CZAS I DZIEŃ TYGODNIA
        LocalDateTime date10 = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm EEEE");
        String text = date10.format(formatter);
        System.out.println(text);
        //Sprawdź dznień tygodnia podczas koronacji bolesława chrobrego
        LocalDate chrobry = LocalDate.of(1025, 4, 18);
        System.out.println(chrobry.getDayOfWeek());
        LocalDateTime chrobry2 = LocalDateTime.of(1025, 4, 18, 12,0,0);
        System.out.println(chrobry2.getDayOfWeek());
//////////////////////
        // wyświetlenie dostępnycj języków dla formatera
        /*
        for (Locale availableLocale : Locale.getAvailableLocales()) {
            System.out.println(availableLocale.getDisplayName() + " " +availableLocale.getLanguage());
        }*/
        DateTimeFormatter formater3 = DateTimeFormatter.ofPattern("EEEE", Locale.forLanguageTag("ja")); //koreański ar-arabski, pl -polski,
        LocalDate date5 = LocalDate.of(1025,4,18);
        System.out.println(formater3.format(date5));
/// ile czasu mineło od mojego urodzenia
        //Duration - godziny minuty sekundy - działa na LocalDate
        //Period - lata, miesiace, dni - działa na LocaTDateTime
        Duration between = Duration.between(LocalDateTime.of(1995,10,18,11,05), LocalDateTime.now());
        System.out.println(between.getSeconds());
        System.out.println(between.toDays());
/*
        Period dur = Period.between(LocalDate.of(1776, 7, 4), LocalDate.now());
        System.out.printf("%d years, %d months, %d days", dur.getYears(), dur.getMonths(),dur.getDays());
        System.out.printf(" that is: %d months", dur.toTotalMonths());*/

// ile dzniminęło od koronacji bolesława chrobrego
        LocalDateTime chrobry3 = LocalDateTime.of(1025, 4, 18, 12,0,0);
        Duration iledni = Duration.between(chrobry3, LocalDateTime.now()) ;
        System.out.println(iledni.toDays());
// jaki będzie dzień 56342 sekund od teraz
        LocalDateTime now =LocalDateTime.now();
        now.plusSeconds(56_342);
        System.out.println(now.plusSeconds(56_342));

        long betweeen = ChronoUnit.DAYS.between(LocalDate.of(1025,4,18),LocalDate.now());
        System.out.println(betweeen); //inaczej zrobione


    }
}
