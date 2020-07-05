package zaj24_05.JDBCexample;

public class Country {
    private String name;
    private String continent;
    private long population;
    private String capital;

    public Country() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", \tcontonent='" + continent + '\'' +
                ", \tpopulation=" + population +
                ", \tcapital='" + capital + '\'' +
                '}';
    }
}
