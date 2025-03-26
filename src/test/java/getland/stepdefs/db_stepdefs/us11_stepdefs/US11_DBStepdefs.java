package getland.stepdefs.db_stepdefs.us11_stepdefs;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import getland.utilities.ConfigReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class US11_DBStepdefs {

    Connection connection;
    Statement statement;
    ResultSet resultSet;

    List<String> actualColumnNames = new ArrayList<>();

    public static int id;
    public static String message;
    public static Timestamp createdAt;

    @Given("Connect to the DataBase")
    public void connectToTheDataBase() throws SQLException {
        connection = DriverManager.getConnection(
                ConfigReader.getProperty("dbUrl"),
                ConfigReader.getProperty("dbUser"),
                ConfigReader.getProperty("dbPassword")
        );
        System.out.println("Database connection established successfully.");
    }

    @When("Send query for column names of the logs table")
    public void sendQueryForColumnNamesOfTheLogsTable() throws SQLException {
        statement = connection.createStatement();
        resultSet = statement.executeQuery("SELECT column_name FROM information_schema.columns WHERE table_name = 'logs'");

        while (resultSet.next()) {
            actualColumnNames.add(resultSet.getString("column_name"));
        }
        System.out.println("Column names retrieved successfully.");
    }

    @Then("Validate column names from resultset")
    public void validateColumnNamesFromResultset() throws SQLException {
        // Beklenen sütun isimleri (veritabanındaki şema doğrultusunda güncellenmeli)
        List<String> expectedColumnNames = Arrays.asList("id", "created_at", "advert_id", "user_id", "message");

        // 1. Sütun sayısını kontrol et
        assertEquals("Sütun sayısı uyuşmuyor!", expectedColumnNames.size(), actualColumnNames.size());

        // 2. Tüm sütun isimlerinin beklendiği gibi olup olmadığını doğrula
        for (String expectedColumn : expectedColumnNames) {
            assertTrue("Beklenen sütun eksik: " + expectedColumn, actualColumnNames.contains(expectedColumn));
        }

        System.out.println("Column names validated successfully: " + actualColumnNames);

        // Kaynakları kapat
        if (resultSet != null) resultSet.close();
        if (statement != null) statement.close();
    }

    @And("Display and verify the last record added to the table")
    public void displayAndVerifyTheLastRecordAddedToTheTable() throws SQLException {
        statement = connection.createStatement();
        resultSet = statement.executeQuery("SELECT * FROM logs ORDER BY created_at DESC LIMIT 1");

        if (resultSet.next()) {
             id = resultSet.getInt("id");
            createdAt = resultSet.getTimestamp("created_at");
            int advertId = resultSet.getInt("advert_id");
            int userId = resultSet.getInt("user_id");
            message = resultSet.getString("message");

            System.out.println("Last record details:");
            System.out.println("ID: " + id);
            System.out.println("Created At: " + createdAt);
            System.out.println("Advert ID: " + advertId);
            System.out.println("User ID: " + userId);
            System.out.println("Message: " + message);

            // Null kontrolü yaparak doğrulama
            assertNotNull("ID should not be null", id);
            assertNotNull("Created At should not be null", createdAt);
            assertNotNull("Advert ID should not be null", advertId);
            assertNotNull("User ID should not be null", userId);
            assertNotNull("Message should not be null", message);
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
