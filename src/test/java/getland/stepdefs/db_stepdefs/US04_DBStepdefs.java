package getland.stepdefs.db_stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import getland.utilities.ConfigReader;
import io.cucumber.java.en.*;

import static org.junit.Assert.*;

public class US04_DBStepdefs {

    private Connection connection;
    private Statement statement;
    private ResultSet resultSet;
    private final List<String> actualColumnNames = new ArrayList<>();

    @Given("Connect to the DataBase..")
    public void connectToTheDataBase() {
        try {
            connection = DriverManager.getConnection(
                    ConfigReader.getProperty("dbUrl"),
                    ConfigReader.getProperty("dbUser"),
                    ConfigReader.getProperty("dbPassword")
            );
            System.out.println("Database connection established successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
            fail("Database connection failed: " + e.getMessage());
        }
    }

    @When("Send query for column names of the contacts table..")
    public void sendQueryForColumnNamesOfTheContactsTable() {
        String query = "SELECT column_name FROM information_schema.columns WHERE table_name = 'contacts' ORDER BY ordinal_position";

        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);

            actualColumnNames.clear();
            while (resultSet.next()) {
                actualColumnNames.add(resultSet.getString("column_name"));
            }

            System.out.println("Column names retrieved successfully: " + actualColumnNames);

        } catch (SQLException e) {
            e.printStackTrace();
            fail("Error while fetching column names: " + e.getMessage());
        }
    }

    @Then("Validate column names from resultset..")
    public void validateColumnNamesFromResultset() {
        List<String> expectedColumnNames = Arrays.asList("id", "created_at", "email", "first_name", "last_name", "message", "status");

        try {
            assertEquals("Column count does not match!", expectedColumnNames.size(), actualColumnNames.size());

            for (String expectedColumn : expectedColumnNames) {
                assertTrue("Missing expected column: " + expectedColumn, actualColumnNames.contains(expectedColumn));
            }

            System.out.println("Column names validated successfully: " + actualColumnNames);

        } catch (AssertionError e) {
            e.printStackTrace();
            fail("Column name validation failed: " + e.getMessage());
        } finally {
            closeResources();
        }
    }

    @When("Send query to get the last record from the contacts table..")
    public void sendQueryToGetTheLastRecordFromTheContactsTable() {
        String query = "SELECT * FROM contacts ORDER BY created_at DESC LIMIT 1";

        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);

            if (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("first_name");
                String lastname = resultSet.getString("last_name");
                String email = resultSet.getString("email");
                String message = resultSet.getString("message");
                Timestamp createdAt = resultSet.getTimestamp("created_at");
                Boolean status = resultSet.getBoolean("status");

                System.out.println("Last record details:");
                System.out.println("ID: " + id);
                System.out.println("Name: " + name);
                System.out.println("Last Name: " + lastname);
                System.out.println("Email: " + email);
                System.out.println("Message: " + message);
                System.out.println("Created At: " + createdAt);
                System.out.println("Status: "+ status);

                assertNotNull("ID should not be null", id);
                assertNotNull("Name should not be null", name);
                assertNotNull("Last name should not be null", lastname);
                assertNotNull("Email should not be null", email);
                assertNotNull("Message should not be null", message);
                assertNotNull("Created At should not be null", createdAt);
                assertNotNull("Status should not be null", status);

            } else {
                System.out.println("No records found in the contacts table.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
            fail("Error while fetching the last record: " + e.getMessage());
        } finally {
            closeResources();
        }
    }

    @Then("Display and verify the last record added to the table..")
    public void displayAndVerifyTheLastRecordAddedToTheTable() {
        System.out.println("Last record verification completed successfully.");
    }

    private void closeResources() {
        try {
            if (resultSet != null) resultSet.close();
            if (statement != null) statement.close();
            if (connection != null) connection.close();
            System.out.println("Database connection closed.");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Warning: Error closing database resources.");
        }
    }
}
