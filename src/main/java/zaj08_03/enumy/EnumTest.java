package zaj08_03.enumy;

public class EnumTest {
    public static void main(String[] args) {
        Kolor kolor = Kolor.CZARNY;
        System.out.println("Kolor czarny jest " + czyLadny(kolor));

        kolor = Kolor.ZIELONY;
        System.out.println("Kolor zielony jest " + czyLadny(kolor));
    }

    public static String czyLadny(Kolor kolor){
        return (kolor.ladny) ? "ladny" : "brzydki";
    }
}


