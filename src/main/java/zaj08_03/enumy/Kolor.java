package zaj08_03.enumy;

public enum Kolor {

    CZERWONY(false),
    ZIELONY(false),
    CZARNY(true);

    boolean ladny;

    Kolor(boolean ladny) {
        this.ladny = ladny;
    }
}
