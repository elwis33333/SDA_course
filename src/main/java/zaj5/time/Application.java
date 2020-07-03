package zaj5.time;



import zaj5.time.User;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;
public class Application {
    public static User[] USERS = new User[100];
    public static DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("yyyy/MM/dd");
    public static int USER_COUNT;
    public static Pattern PATTERN_EMAIL = Pattern.compile("(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])");
    public static Pattern PATTERN_DATE = Pattern.compile("\\d{4}/\\d{2}/\\d{2}");
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Witaj\n" +
                "Wybierz opcję podając numer");
        int option = 99;
        while (true) {
            printHelp();
            option = scanner.nextInt();
            if (option == 0) {
                System.out.println("Zamykam aplikacje");
                break;
            } else if (option == 1) {
                insertUser(scanner);
            } else if (option == 2) {
                if (USER_COUNT == 0) {
                    System.out.println("Nie dodano użytkowników!!");
                    continue;
                }
                getUserBeforeDate(scanner);
            } else if (option == 3) {
                if (USER_COUNT == 0) {
                    System.out.println("Nie dodano użytkowników!!");
                    continue;
                }
                getUserAfterDate(scanner);
            } else if (option == 4) {
                if (USER_COUNT == 0) {
                    System.out.println("Nie dodano użytkowników!!");
                    continue;
                }
                getDateWithSameYear(scanner);
            } else {
                System.out.println("Niepoprawny numer. Help:");
                printHelp();
            }
        }
    }
    public static void printHelp() {
        System.out.println("0. Zamknij aplikację\n" +
                "1. Dodaj użytkownika\n" +
                "2. Wypisz użytkowników, którzy urodzili się przed podaną datą\n" +
                "3. Wypisz użytkowników, którzy urodzili się po podanej dacie\n" +
                "4. Wypisz użytkowników, którzy urodzili się w podanym roku");
    }
    public static boolean isValidEmail(String email){
        if (!PATTERN_EMAIL.matcher(email).matches()) {
            System.out.println("Podaj poprawnego maila");
            return true;
        }else{
            return false;
        }
    }
    public static boolean isValidDate(String birthdayStr){
        if (!PATTERN_DATE.matcher(birthdayStr).matches()) {
            System.out.println("Podaj poprawną datę");
            return true;
        } else {
            return false;
        }
    }
    public static void insertUser(Scanner scanner){
        boolean isEmailIncorrect=true;
        boolean isDateIncorrect=true;
        System.out.println("Podaj imię");
        String name = scanner.next();
        String email="";
        System.out.println("Podaj email");
        while (isEmailIncorrect) {
            email = scanner.next();
            isEmailIncorrect=isValidEmail(email);
        }
        System.out.println("Podaj datę urodzenia w formacie: rrrr/MM/dd");
        String birthdayStr="";
        LocalDate birthday=null;
        while (isDateIncorrect) {
            birthdayStr = scanner.next();
            try {
                birthday = LocalDate.parse(birthdayStr, DATE_TIME_FORMATTER);
                isDateIncorrect=false;
            }catch (DateTimeParseException ex){
                System.out.println("Podaj poprawną datę");
            }
        }
        User user = new User(name, email, birthday);
        if (USER_COUNT == USERS.length) {
            USERS = Arrays.copyOf(USERS, USERS.length + 100);
        }
        USERS[USER_COUNT] = user;
        USER_COUNT++;
    }
    public static void getUserBeforeDate(Scanner scanner){
        boolean isDateIncorrect=true;
        System.out.println("Podaj datę do sprawdzania");
        String birthdayStr="";
        LocalDate birthday=null;
        while (isDateIncorrect) {
            birthdayStr = scanner.next();
            try {
                birthday = LocalDate.parse(birthdayStr, DATE_TIME_FORMATTER);
                isDateIncorrect=false;
            }catch (DateTimeParseException ex){
                System.out.println("Podaj poprawną datę");
            }
        }
        for (int i = 0; i < USER_COUNT; i++) {
            if (USERS[i].getBirthday().isBefore(birthday)) {
                System.out.println(USERS[i].toString());
            }
        }
    }
    public static void getUserAfterDate(Scanner scanner) {
        boolean isDateIncorrect=true;
        System.out.println("Podaj datę do sprawdzania");
        String birthdayStr="";
        LocalDate birthday=null;
        while (isDateIncorrect) {
            try {
                birthday = LocalDate.parse(birthdayStr, DATE_TIME_FORMATTER);
                isDateIncorrect=false;
            }catch (DateTimeParseException ex){
                System.out.println("Podaj poprawną datę");
            }
        }
        for (int i = 0; i <  USER_COUNT; i++) {
            if (USERS[i].getBirthday().isAfter(birthday)) {
                System.out.println(USERS[i].toString());
            }
        }
    }
    public static void getDateWithSameYear(Scanner scanner){
        boolean isDateIncorrect=true;
        String birthdayStr="";
        LocalDate birthday=null;
        while (isDateIncorrect) {
            try {
                birthday = LocalDate.parse(birthdayStr, DATE_TIME_FORMATTER);
                isDateIncorrect=false;
            }catch (DateTimeParseException ex){
                System.out.println("Podaj poprawną datę");
            }
        }
        for (int i = 0; i <  USER_COUNT; i++) {
            if (USERS[i].getBirthday().getYear()==birthday.getYear()) {
                System.out.println(USERS[i].toString());
            }
        }
    }
}