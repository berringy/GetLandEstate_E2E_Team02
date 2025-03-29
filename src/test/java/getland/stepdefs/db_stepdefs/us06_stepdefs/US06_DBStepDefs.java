package getland.stepdefs.db_stepdefs.us06_stepdefs;

import getland.utilities.ConfigReader;
import io.cucumber.java.en.*;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static org.junit.Assert.assertNotNull;

public class US06_DBStepDefs {


    Connection connection;
    Statement statement;
    ResultSet resultSet;

    List<String> actualColumnNames = new ArrayList<>();

    @Given("Connect to DB")
    public void connect_to_db() throws SQLException {
        connection = DriverManager.getConnection(
                ConfigReader.getProperty("dbUrl"),
                ConfigReader.getProperty("dbUser"),
                ConfigReader.getProperty("dbPassword")
        );
        System.out.println("Database connection is established");

    }
    @When("Send query for column names of the cities table")
    public void send_query_for_column_names_of_the_cities_table() throws SQLException {
        statement = connection.createStatement();
        resultSet = statement.executeQuery("SELECT column_name FROM information_schema.columns WHERE table_name = 'cities'");

        while (resultSet.next()){
            actualColumnNames.add(resultSet.getString("column_name"));
        }
        System.out.println("Column names retrieved successfully.");
    }
    @Then("Validate cities column names from resultset")
    public void validate_cities_column_names_from_resultset() throws SQLException {
        // Expected column names (should be updated according to the database schema)
        List<String> expectedColumnNames = Arrays.asList("id", "country_id", "lat", "lng", "name");

        // 1. Check the number of columns
        assertEquals("Sütun sayısi uyuşmuyor!", expectedColumnNames.size(), actualColumnNames.size());

        // 2. Tüm sütun isimlerinin beklendiği gibi olup olmadığını doğrula
        for (String expectedColumn : expectedColumnNames) {
            assertTrue("Beklenen sütun eksik: " + expectedColumn, actualColumnNames.contains(expectedColumn));
        }

        System.out.println("Column names validated successfully: " + actualColumnNames);

        // Kaynakları kapat
        if (resultSet != null) resultSet.close();
        if (statement != null) statement.close();
    }
    @Then("Display and verify the last record added to the cities table")
    public void display_and_verify_the_last_record_added_to_the_cities_table() throws SQLException {
        statement = connection.createStatement();
        resultSet = statement.executeQuery("SELECT * FROM cities ORDER BY country_id  ASC LIMIT 1");

        if (resultSet.next()) {
            int id = resultSet.getInt("id");
            int country_id = resultSet.getInt("country_id");
            int lat = resultSet.getInt("lat");
            int lng = resultSet.getInt("lng");
            String name = resultSet.getString("name");


            System.out.println("Last record details:");
            System.out.println("ID: " + id);
            System.out.println("Country_id: " + country_id);
            System.out.println("Lat: " + lat);
            System.out.println("Lng: " + lng);
            System.out.println("Name: " + name);

            // Null kontrolü yaparak doğrulama
            assertNotNull("id should not be null", id);
            assertNotNull("Country_id should not be null", country_id);
            assertNotNull("Lat should not be null",lat);
            assertNotNull("Lng should not be null", lng);
            assertNotNull("Name should not be null", name);

        } else {
            System.out.println("No records found in the cities table.");
        }

        // Bağlantıyı kapatma işlemi
        if (resultSet != null) resultSet.close();
        if (statement != null) statement.close();
        if (connection != null) connection.close();
        System.out.println("Database connection closed.");

    }

}
