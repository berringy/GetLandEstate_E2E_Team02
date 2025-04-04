package getland.stepdefs.db_stepdefs.us02_us17_stepdefs;

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

public class US17_DBStepdefs {

    Connection connection;
    Statement statement;
    ResultSet resultSet;

    List<String> actualUsersColumnNames = new ArrayList<>();

    @Given("Connect to the DataBase.")
    public void connectToTheDataBase() throws SQLException {
        connection = DriverManager.getConnection(
                ConfigReader.getProperty("dbUrl"),
                ConfigReader.getProperty("dbUser"),
                ConfigReader.getProperty("dbPassword")
        );
        System.out.println("Database connection established successfully.");
    }

    @When("Send query for Users column names of the logs.")
    public void sendQueryForUsersColumnNamesOfTheLogs() throws SQLException {
        statement = connection.createStatement();
        resultSet = statement.executeQuery("SELECT column_name FROM information_schema.columns WHERE table_name = 'users'");
        while (resultSet.next()) {
            actualUsersColumnNames.add(resultSet.getString("column_name"));
        }
        System.out.println("Column names retrieved successfully.");
    }

    @Then("Validate Users column names from resultset.")
    public void validateUsersColumnNamesFromResultset() throws SQLException {
        // Beklenen sütun isimleri (veritabanındaki şema doğrultusunda güncellenmeli)
        List<String> expectedColumnNames = Arrays.asList("id", "created_at", "updated_at"
                , "built_in", "enabled", "locked", "picture_id", "last_name","role","password_hash"
                ,"phone","email","reset_password_code","first_name");

        // 1. Sütun sayısını kontrol et
        assertEquals("The number of columns does not match!", expectedColumnNames.size(), actualUsersColumnNames.size());

        // 2. Tüm sütun isimlerinin beklendiği gibi olup olmadığını doğrula
        for (String expectedColumn : expectedColumnNames) {
            assertTrue("The expected column is missing: " + expectedColumn, actualUsersColumnNames.contains(expectedColumn));
        }

        System.out.println("Column names validated successfully: " + actualUsersColumnNames);

        // Kaynakları kapat
        if (resultSet != null) resultSet.close();
        if (statement != null) statement.close();

    }

    @And("Verify the accuracy for id three informations.")
    public void verifyTheAccuracyForIdThreeInformations() throws SQLException {
        statement = connection.createStatement();
        resultSet = statement.executeQuery("SELECT * FROM users WHERE id = 3");

        if (resultSet.next()) {
            int id = resultSet.getInt("id");
            String createdAt = resultSet.getString("created_at");
            String firstName = resultSet.getString("first_name");
            String lastName = resultSet.getString("last_name");
            String email = resultSet.getString("email");
            String phone = resultSet.getString("phone");
            String role = resultSet.getString("role");


            System.out.println("All details about ID 3:");
            System.out.println("ID: " + id);
            System.out.println("Created At: " + createdAt);
            System.out.println("First Name: " + firstName);
            System.out.println("Last Name: " + lastName);
            System.out.println("Email: " + email);
            System.out.println("Phone: " + phone);
            System.out.println("Role: " + role);

            // Null kontrolü yaparak doğrulama
            assertNotNull("ID should not be null", id);
            assertNotNull("Created At should not be null", createdAt);
            assertNotNull("First Name should not be null", firstName);
            assertNotNull("Last Name should not be null", lastName);
            assertNotNull("Email should not be null", email);
            assertNotNull("Phone should not be null", phone);
            assertNotNull("Role should not be null", role);

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
