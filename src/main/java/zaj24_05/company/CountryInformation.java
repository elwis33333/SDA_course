package zaj24_05.company;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class CountryInformation {
    private static final String URL = "jdbc:mysql://localhost:3306/world?serverTimezone=Europe/Warsaw";
    private static final String USER = "root";
    private static final String PASS = "ZdeF42ca";
    private static Connection connection;
    public static void about(String ... code) {
            //open connection to db
            openConection();
            //fetch data
        List<Country> countries = fetchData(code);
            //print on screen
        countries.stream().forEach(System.out::println); //1 stream method reference
        //caountries.stream().forEach(country -> System.out.println(country));   //2 stream with lambda expresion
        /*
        // 3 old fasion iterration
        for (Country country : countries) {
            System.out.println(country);
        }
        */
        //close connection
        closeConnection();
    }

    private static List<Country> fetchData(String[] codes) {
        LinkedList<Country> countries = new LinkedList<>();
        if (codes.length == 0) {
            return countries;
        }
        String query = "select cr.Name as Name, Continent, cr.Population, c.Name as Capitol " +
                "from country cr join city c on cr.Capital = c.ID where Code=?";
        int idx = 1;
        try(PreparedStatement statement = connection.prepareStatement(query)) {
            for (String code : codes) {
                //get one record from db
                statement.setString(1, code);
                statement.execute();
                ResultSet resultSet = statement.getResultSet();

                Country country = new Country();
                if(resultSet.next()) {
                    country.setName(resultSet.getString("Name"));
                    country.setContinent(resultSet.getString("Continent"));
                    country.setPopulation(resultSet.getLong("Population"));
                    country.setCapital(resultSet.getString("Capitol"));
                   /* System.out.println("Meta data: " + idx);
                    ResultSetMetaData metaData = resultSet.getMetaData();
                    System.out.println(metaData.getCatalogName(idx));
                    System.out.println(metaData.getColumnClassName(idx));
                    System.out.println(metaData.getColumnLabel(idx));
                    System.out.println(metaData.getColumnTypeName(idx));
                    idx++;*/
                } else {
                    country.setName(code + " is unknown / not in data base");
                    country.setContinent("Unknown");
                    country.setPopulation(0L);
                    country.setCapital("Unknown");
                }
                countries.add(country);
            }
        }catch (SQLException ex){
            System.out.println(ex);
        }
        return countries;
    }

    private static void closeConnection() {
        try { connection.close();} catch (SQLException e) { e.printStackTrace(); }
    }
    private static void openConection() {
        try { connection = DriverManager.getConnection(URL,USER,PASS); } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void saveCity(String name, String countryCode, String district, long population) {
    openConection();
        String query = "Insert into City(Name, CountryCode, District, Population) VALUES (?,?,?,?)";
        try(PreparedStatement statement = connection.prepareStatement(query)){
            statement.setLong(4, population);
            statement.setString(2, countryCode);
            statement.setString(1, name);
            statement.setString(3, district);
            if (!statement.execute()) System.out.println("Insert done times: " + statement.getUpdateCount());
            else System.out.println("Bad insert - don't done");
        }catch(SQLException e){ e.printStackTrace(); }
    closeConnection();
    }
}
