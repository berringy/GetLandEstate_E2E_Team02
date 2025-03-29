package getland.stepdefs.db_stepdefs.us12_stepdefs;

import getland.utilities.ConfigReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static org.junit.Assert.assertNotNull;

public class US12_DBStepDefs {

    Connection connection;
    Statement statement;
    ResultSet resultSet;

    List<String> actualColumnNames = new ArrayList<>();

    @Given("Connect to the DB")
    public void connectToTheDB() throws SQLException {
        connection = DriverManager.getConnection(
                ConfigReader.getProperty("dbUrl"),
                ConfigReader.getProperty("dbUser"),
                ConfigReader.getProperty("dbPassword")
        );
        System.out.println("Database connection is established");

    }

    @When("Send query for column names of the images table")
    public void sendQueryForColumnNamesOfTheCitiesTable() throws SQLException {
        statement = connection.createStatement();
        resultSet = statement.executeQuery("SELECT column_name FROM information_schema.columns WHERE table_name = 'images'");

        while (resultSet.next()){
            actualColumnNames.add(resultSet.getString("column_name"));
        }
        System.out.println("Column names retrieved successfully.");
    }

    @Then("Validate images column names from resultset")
    public void validateImagesColumnNamesFromResultset() throws SQLException {
        // Expected column names (should be updated according to the database schema)
        List<String> expectedColumnNames = Arrays.asList("id", "advert_id", "data", "featured", "name","type");

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

    @And("Display and verify the last record added to the images table")
    public void displayAndVerifyTheLastRecordAddedToTheImagesTable() throws SQLException {
        statement = connection.createStatement();
        resultSet = statement.executeQuery("SELECT * FROM images ORDER BY advert_id  DESC LIMIT 1");

        if (resultSet.next()) {
            int id = resultSet.getInt("id");
            int advert_id = resultSet.getInt("advert_id");
            int data = resultSet.getInt("Data");
            Boolean featured = resultSet.getBoolean("Featured");
            String name = resultSet.getString("Name");
            String type = resultSet.getString("Type");

            System.out.println("Last record details:");
            System.out.println("ID: " + id);
            System.out.println("Created At: " + advert_id);
            System.out.println("Advert ID: " + data);
            System.out.println("User ID: " + featured);
            System.out.println("Name: " + name);
            System.out.println("Type: " + type);

            // Null kontrolü yaparak doğrulama
            assertNotNull("id should not be null", id);
            assertNotNull("Advert id should not be null", advert_id);
            assertNotNull("Data should not be null", data);
            assertNotNull("Featured should not be null", featured);
            assertNotNull("Name should not be null", name);
            assertNotNull("type should not be null", type);
        } else {
            System.out.println("No records found in the logs table.");
        }

        // Bağlantıyı kapatma işlemi
        if (resultSet != null) resultSet.close();
        if (statement != null) statement.close();
        if (connection != null) connection.close();
        System.out.println("Database connection closed.");

    }
}
