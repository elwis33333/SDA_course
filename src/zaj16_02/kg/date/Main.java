package zaj16_02.kg.date;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Locale;

public class Main {
    public static void main(String[] args){

        Duration between = Duration.between(LocalDateTime.of(1025,04,18,0,0),LocalDateTime.now());
        Period period = Period.between(LocalDate.of(1025,04,18),LocalDate.now());
        System.out.println(between.toDays());
        LocalDateTime local = LocalDateTime.now().plusSeconds(56342);
        System.out.println(local.getDayOfWeek());

        long days = ChronoUnit.DAYS.between(LocalDateTime.of(1025,04,18,0,0),LocalDateTime.now());
        System.out.println(days);

        LocalDateTime localDate = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm EEEE", Locale.US);
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy:MM:dd:HH:mm");
        String time  = localDate.format(formatter);
        System.out.println(time);
        LocalDate chrobry = LocalDate.of(1025,4,18);
        System.out.println(chrobry.getDayOfWeek());

        for (String zoneId : ZoneId.getAvailableZoneIds()){
            System.out.println(zoneId);
        }




                SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        Date date = null;
        try {
            date = sdf.parse("1995/06/06");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(date);
        Date time2 = new Date();
        System.out.println(time2);
        SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm");
        System.out.println(sdf2.format(time2));
        System.out.println(time2);


    }

}
