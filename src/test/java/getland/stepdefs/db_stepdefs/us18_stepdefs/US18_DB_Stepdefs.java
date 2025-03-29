package getland.stepdefs.db_stepdefs.us18_stepdefs;

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

public class US18_DB_Stepdefs {


    Connection connection;
    Statement statement;
    ResultSet resultSet;

    List<String> actualColumnNames = new ArrayList<>();
    @Given("Veritabani baglantisi sagglanir")
    public void veritabani_baglantisi_sagglanir() throws SQLException {
        connection = DriverManager.getConnection(
                ConfigReader.getProperty("dbUrl"),
                ConfigReader.getProperty("dbUser"),
                ConfigReader.getProperty("dbPassword")
        );
        System.out.println("Database connection is established");

    }

    @When("Favoriler tablosunun sütun adları için sorgu gönderilir")
    public void favoriler_tablosunun_sütun_adları_için_sorgu_gönderilir() throws SQLException {
        statement = connection.createStatement();
        resultSet = statement.executeQuery("SELECT column_name FROM information_schema.columns WHERE table_name = 'favorites'");

        while (resultSet.next()){
            actualColumnNames.add(resultSet.getString("column_name"));
        }
        System.out.println("Column names retrieved successfully.");
    }
    @Then("Sonuç kümesinden şehir sütun adlarını doğrula")
    public void sonuç_kümesinden_şehir_sütun_adlarını_doğrula() throws SQLException {
        // Expected column names (should be updated according to the database schema)
        List<String> expectedColumnNames = Arrays.asList("id", "created_at", "updated_at", "advert_id", "user_id");

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
    @Then("Favoriler tablosuna son eklenen veriyi göster ve doğrula")
    public void favoriler_tablosuna_son_eklenen_veriyi_göster_ve_doğrula() throws SQLException {
        statement = connection.createStatement();
        resultSet = statement.executeQuery("SELECT * FROM favorites ORDER BY advert_id  DESC LIMIT 1");

        if (resultSet.next()) {
            int id = resultSet.getInt("id");
            Timestamp created_at = resultSet.getTimestamp("created_at");
            int updated_at = resultSet.getInt("updated_at");
            int advert_id = resultSet.getInt("advert_id");
            int user_id = resultSet.getInt("user_id");


            System.out.println("Last record details:");
            System.out.println("ID: " + id);
            System.out.println("Created At: " + created_at);
            System.out.println("Advert ID: " + updated_at);
            System.out.println("User ID: " + advert_id);
            System.out.println("Name: " + user_id);


            // Null kontrolü yaparak doğrulama
            assertNotNull("id should not be null", id);
            assertNotNull("Advert id should not be null", created_at);
            //assertNotNull("Data should not be null", updated_at);
            assertNotNull("Featured should not be null", advert_id);
            assertNotNull("Name should not be null", user_id);

        } else {
            System.out.println("No records found in the favorites table.");
        }}}
