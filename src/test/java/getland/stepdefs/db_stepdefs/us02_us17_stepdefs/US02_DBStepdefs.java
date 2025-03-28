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

public class US02_DBStepdefs {

    Connection connection;
    Statement statement;
    ResultSet resultSet;

    List<String> actualCategoriesColumnNames = new ArrayList<>();

    @Given("Connect to the DataBase as Admin.")
    public void connectToTheDataBaseAsAdmin() throws SQLException {
        connection = DriverManager.getConnection(
                ConfigReader.getProperty("dbUrl"),
                ConfigReader.getProperty("dbUser"),
                ConfigReader.getProperty("dbPassword")
        );
        System.out.println("Database connection established successfully.");
    }

    @When("Send query for Categories column names of the logs.")
    public void sendQueryForCategoriesColumnNamesOfTheLogs() throws SQLException {
        statement = connection.createStatement();
        resultSet = statement.executeQuery("SELECT column_name FROM information_schema.columns WHERE table_name = 'categories'");
        while (resultSet.next()) {
            actualCategoriesColumnNames.add(resultSet.getString("column_name"));
        }
        System.out.println("Column names retrieved successfully.");
    }

    @Then("Validate Categories column names from resultset.")
    public void validateCategoriesColumnNamesFromResultset() throws SQLException {
        // Beklenen sütun isimleri (veritabanındaki şema doğrultusunda güncellenmeli)
        List<String> expectedColumnNames = Arrays.asList("id", "created_at", "updated_at"
                , "is_active", "built_in", "seq", "title", "slug", "icon");

        // 1. Sütun sayısını kontrol et
        assertEquals("The number of columns does not match!", expectedColumnNames.size(), actualCategoriesColumnNames.size());

        // 2. Tüm sütun isimlerinin beklendiği gibi olup olmadığını doğrula
        for (String expectedColumn : expectedColumnNames) {
            assertTrue("The expected column is missing: " + expectedColumn, actualCategoriesColumnNames.contains(expectedColumn));
        }

        System.out.println("Column names validated successfully: " + actualCategoriesColumnNames);

        // Kaynakları kapat
        if (resultSet != null) resultSet.close();
        if (statement != null) statement.close();
    }

    @And("Verify the accuracy of the apartment title and information.")
    public void Verify_theaccuracy_of_the_apartment_information() throws SQLException {
        statement = connection.createStatement();
        resultSet = statement.executeQuery("SELECT * FROM categories WHERE title = 'Apartment';");

        if (resultSet.next()) {
            int id = resultSet.getInt("id");
            String title = resultSet.getString("title");
            String icon = resultSet.getString("icon");
            int seq = resultSet.getInt("seq");
            Boolean built_in = resultSet.getBoolean("built_in");
            Boolean is_active = resultSet.getBoolean("is_active");


            System.out.println("All details about 'Apartment':");
            System.out.println("ID: " + id);
            System.out.println("Title: " + title);
            System.out.println("Icon: " + icon);
            System.out.println("Seq: " + seq);
            System.out.println("BuiltIn: " + built_in);
            System.out.println("Active: " + is_active);

            // Null kontrolü yaparak doğrulama
            assertNotNull("ID should not be null", id);
            assertNotNull("Title should not be null", title);
            assertNotNull("Icon should not be null", icon);
            assertNotNull("Seq should not be null", seq);
            assertNotNull("BuiltIn should not be null", built_in);
            assertNotNull("Active should not be null", is_active);

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
