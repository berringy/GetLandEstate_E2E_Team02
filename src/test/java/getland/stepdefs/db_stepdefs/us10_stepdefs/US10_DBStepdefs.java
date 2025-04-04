package getland.stepdefs.db_stepdefs.us10_stepdefs;

import getland.utilities.ConfigReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static org.junit.Assert.assertNotNull;


public class US10_DBStepdefs {

    Connection connection;
    Statement statement;
    ResultSet resultSet;

    List<String> actualColumnNames = new ArrayList<>();

    @Given("Confirmation_token tablosu için Database Bağlantısı kurulur.")
    public void confirmation_tokenTablosuIçinDatabaseBağlantısıKurulur() throws SQLException {
        connection = DriverManager.getConnection(
                ConfigReader.getProperty("dbUrl"),
                ConfigReader.getProperty("dbUser"),
                ConfigReader.getProperty("dbPassword")
        );
        System.out.println("Database connection established successfully.");
    }

    @When("Kayitli confirmation_token sutun isimlerini almak icin query gonderilir.")
    public void kayitliConfirmation_tokenSutunIsimleriniAlmakIcinQueryGonderilir() throws SQLException {
        statement = connection.createStatement();
        resultSet = statement.executeQuery("SELECT column_name FROM information_schema.columns WHERE table_name = 'confirmation_token'");

        while (resultSet.next()) {
            actualColumnNames.add(resultSet.getString("column_name"));
        }
        System.out.println("Column names retrieved successfully.");
    }

    @And("Kayitli confirmation_token sutun isimleri dogrulanir.")
    public void kayitliConfirmation_tokenSutunIsimleriDogrulanir() throws SQLException {
        // Beklenen sütun isimleri (veritabanındaki şema doğrultusunda güncellenmeli)
        List<String> expectedColumnNames = Arrays.asList("id", "created_time", "user_id", "confirmation_token");

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

    @And("Kayitli confirmation_token sutun bilgilerini almak icin query gonderilir.")
    public void kayitliConfirmation_tokenSutunBilgileriniAlmakIcinQueryGonderilir() throws SQLException {
        statement = connection.createStatement();
        resultSet = statement.executeQuery("SELECT * FROM confirmation_token");
    }

    @And("confirmation_token tablosunun kayıtlı datalar içerdiği doğrulanır.")
    public void confirmation_tokenTablosununKayıtlıDatalarIçerdiğiDoğrulanır() throws SQLException {
        resultSet = statement.executeQuery("SELECT * FROM confirmation_token");
        if (!resultSet.next()) {
            Assert.fail("Tabloda kayıt bulunamadı!");
        }
    }

    @Then("Kayitli confirmation_token sutunlarının içerdiği bilgiler dogrulanir.")
    public void kayitliConfirmation_tokenSutunBilgileriDogrulanir() throws SQLException {

        // Bağlantıyı kapatma işlemi
        if (resultSet != null) resultSet.close();
        if (statement != null) statement.close();
        if (connection != null) connection.close();

    }


}
