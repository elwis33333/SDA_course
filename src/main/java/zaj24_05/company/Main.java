package zaj24_05.company;

import java.sql.*;

public class Main {
private static final String URL = "jdbc:mysql://localhost:3306/world?serverTimezone=Europe/Warsaw";
private static final String USER = "root";
private static final String PASS = "ZdeF42ca";
    public static void main(String[] args) throws SQLException {
        try(Connection connection = DriverManager.getConnection(URL,USER,PASS);){
            System.out.println("Is open: " + !connection.isClosed());
            String querryAllCountries = "select * from Country limit 5 offset 10";
            Statement statement =  connection.createStatement();
            ResultSet resultSet = statement.executeQuery(querryAllCountries);
            while(resultSet.next()){
                System.out.println(resultSet.getString("Name") + "\t\t" + resultSet.getString("Code") + "\t\t" + resultSet.getInt("IndepYear") + "\t\t"+resultSet.getDouble("GNP"));
            }
            resultSet.close(); //sprzątanie miejsca w pamięci
            statement.close(); //sprzątanie miejsca w pamięci
        }
     catch (SQLException ex){
            System.out.println(ex);
        }
        System.out.println("------------------- Uzycie query w metodzie");
        //fresh topic, Ahtung
        CountryInformation.about("USA","POL","RUS","GER");
        CountryInformation.saveCity("Bikini dolne", "USA","California", 222L);


       // connection.close(); //blok try catch robi to za nas automatycznie
    }
}
