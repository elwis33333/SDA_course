package zaj08_03_ver2.EnumExample;

public enum Color {
    RED(false),
    BLUE(true),
    GREEN(true);

    boolean nice;

    private Color(boolean isNice) {
        this.nice = isNice;
    }
}
