package getland.stepdefs.db_stepdefs.us07_us15_stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class US07_US15_DB_Stepdefs {

    Connection connection;
    Statement statement;
    ResultSet resultSet;
    PreparedStatement preparedStatement;

    List<String> actualColumnNames = new ArrayList<>();


    @Given("User connects to The Database")
    public void userConnectsToTheDatabase() throws SQLException {
        connection = DriverManager.getConnection(
                "jdbc:postgresql://64.227.123.49:5432/prettierhomes",
                "techprotester",
                "myPassword"
        );
    }

    @When("User retrieves actual column names from {string} table")
    public void userRetrievesActualColumnNamesFromTable(String tableName) throws SQLException {
        actualColumnNames.clear();

        String query = "SELECT column_name FROM information_schema.columns WHERE table_name = ?";
        preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, tableName);
        resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
            actualColumnNames.add(resultSet.getString("column_name"));
        }
        System.out.println("✅ Column names retrieved successfully: " + actualColumnNames);
    }


    @Then("User verifies expected column names and actual column names in {string} table")
    public void userVerifiesExpectedColumnNamesAndActualColumnNamesInCountriesTable(String tableName) throws SQLException {
        List<String> expectedColumns_countriesTable = List.of("id", "lat", "lng", "name");
        List<String> expectedColumns_advertTypesTables = List.of("id", "built_in", "title");

        if (tableName.equals("countries")){
            Assert.assertEquals("❌ Column names do not match!", expectedColumns_countriesTable, actualColumnNames);
            System.out.println("✅ Column names are verified successfully: " + actualColumnNames);
        }else {
            Assert.assertEquals("❌ Column names do not match!", expectedColumns_advertTypesTables, actualColumnNames);
            System.out.println("✅ Column names are verified successfully: " + actualColumnNames);
        }
    }


    @And("User verifies that no empty data in the {string} column in {string} table")
    public void userVerifiesThatNoEmptyDataInTheNameColumnInCountriesTable(String column, String tableName) throws SQLException{
        String query = "SELECT " + column + " FROM "+ tableName;
        statement = connection.createStatement();
        resultSet = statement.executeQuery(query);

        while (resultSet.next()) {
            String value = resultSet.getString(column);
            Assert.assertNotNull("❌ " + column + " column contains null data!", value);
            Assert.assertFalse("❌ " + column + " column contains an empty string!", value.trim().isEmpty());
        }
        System.out.println("✅ " + column + " column does not contain empty data.");
    }



    @And("User closes the Database Connection")
    public void userClosesTheDatabaseConnection() throws SQLException {
        if (resultSet != null) resultSet.close();
        if (statement != null) statement.close();
        if (preparedStatement != null) preparedStatement.close();
        if (connection != null) connection.close();
        System.out.println("✅ Database connection closed successfully.");
    }

}