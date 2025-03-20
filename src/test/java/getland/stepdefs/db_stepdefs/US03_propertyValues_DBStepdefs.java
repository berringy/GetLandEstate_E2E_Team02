package getland.stepdefs.db_stepdefs;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import getland.utilities.ConfigReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

public class US03_propertyValues_DBStepdefs {

    Connection connection;
    Statement statement;
    ResultSet resultSet;

    List<String> actualColumnNames = new ArrayList<>();

    @Given("Connect to DB server for property values")
    public void connect_To_DB_Server_For_Property_Values() throws SQLException {
        connection = DriverManager.getConnection(
                ConfigReader.getProperty("dbUrl"),
                ConfigReader.getProperty("dbUser"),
                ConfigReader.getProperty("dbPassword")
        );
        System.out.println("Database connection established successfully.");
    }

    @When("Send query to get column names of category_property_values table")
    public void send_Query_To_Get_Column_Names_Of_Category_Property_Values_Table() throws SQLException {
        statement = connection.createStatement();
        resultSet = statement.executeQuery("SELECT column_name FROM information_schema.columns WHERE table_name = 'category_property_values'");

        while (resultSet.next()) {
            actualColumnNames.add(resultSet.getString("column_name"));
        }
        System.out.println("Column names retrieved successfully.");
    }

    @Then("Verify column names of category_property_values table")
    public void verify_Column_Names_Of_Category_Property_Values_Table() {
        List<String> expectedColumnNames = Arrays.asList("id", "advert_id", "category_property_key_id", "value");

        assertEquals("Sütun sayısı uyuşmuyor!", expectedColumnNames.size(), actualColumnNames.size());

        for (String expectedColumn : expectedColumnNames) {
            assertTrue("Beklenen sütun eksik: " + expectedColumn, actualColumnNames.contains(expectedColumn));
        }

        System.out.println("Column names validated successfully: " + actualColumnNames);
    }

    @When("Send query to get the first record from category_property_values table")
    public void send_Query_To_Get_The_First_Record_From_Category_Property_Values_Table() throws SQLException {
        statement = connection.createStatement();
        resultSet = statement.executeQuery("SELECT * FROM category_property_values ORDER BY id ASC LIMIT 1");
        System.out.println("First record retrieved successfully.");
    }

    @Then("Verify the first record has valid data in category_property_values table")
    public void verify_The_First_Record_Has_Valid_Data_In_Category_Property_Values_Table() throws SQLException {
        if (resultSet.next()) {
            int id = resultSet.getInt("id");
            int advertId = resultSet.getInt("advert_id");
            int categoryPropertyKeyId = resultSet.getInt("category_property_key_id");
            String value = resultSet.getString("value");

            assertNotNull("id should not be null", id);
            assertNotNull("advert_id should not be null", advertId);
            assertNotNull("category_property_key_id should not be null", categoryPropertyKeyId);
            assertNotNull("value should not be null", value);

            System.out.println("First record details:");
            System.out.println("ID: " + id);
            System.out.println("Advert ID: " + advertId);
            System.out.println("Category Property Key ID: " + categoryPropertyKeyId);
            System.out.println("Value: " + value);
        } else {
            System.out.println("No records found in the category_property_values table.");
        }

        if (resultSet != null) resultSet.close();
        if (statement != null) statement.close();
    }

    @And("close for propertyValues DB connection")
    public void close_for_propertyValues_Db_Connection() throws SQLException {
        if (connection != null) {
            connection.close();
            System.out.println("Database connection closed.");
        }
    }
}