package getland.stepdefs.db_stepdefs.us09_stepdefs;

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

public class US09_DBStepdefs {
    Connection connection;
    Statement statement;
    ResultSet resultSet;

    List<String> actualColumnNames = new ArrayList<>();
    @Given("DB baglantisi kurulur")
    public void dbBaglantisiKurulur() throws SQLException {
        connection = DriverManager.getConnection(
                ConfigReader.getProperty("dbUrl"),
                ConfigReader.getProperty("dbUser"),
                ConfigReader.getProperty("dbPassword")
        );
        System.out.println("Database baglantisi basarili");
    }

    @When("category_property_keys tablosunun sütun adlarını almak için query gonderilir")
    public void category_property_keysTablosununSütunAdlarınıAlmakIçinQueryGonderilir() throws SQLException {
        statement = connection.createStatement();
        resultSet = statement.executeQuery("SELECT column_name FROM information_schema.columns WHERE table_name = 'category_property_keys'");

        while (resultSet.next()) {
            actualColumnNames.add(resultSet.getString("column_name"));
        }
        System.out.println("Sutun adlari basariyla alindi");
    }

    @Then("category_property_keys tablosunun sütun adları dogrulanir")
    public void category_property_keysTablosununSütunAdlarıDogrulanir() throws SQLException {
        List<String> expectedColumnNames = Arrays.asList("id", "built_in", "category_id", "key_type", "name", "prefix", "suffix");

        assertEquals("Sutun sayisi uyusmuyor", expectedColumnNames.size(), actualColumnNames.size());

        for (String expectedColumn : expectedColumnNames) {
            assertTrue("Beklenen sutun eksik: " + expectedColumn, actualColumnNames.contains(expectedColumn));
        }
        System.out.println("Sutun adi dogrulamasi basarili: " + actualColumnNames);

        // Kaynakları kapat
        if (resultSet != null) resultSet.close();
        if (statement != null) statement.close();


    }

    @And("category_property_keys tablosuna eklenen son kayıt dogrulanir")
    public void category_property_keysTablosunaEklenenSonKayıtDogrulanir() throws SQLException {
        statement = connection.createStatement();
        resultSet = statement.executeQuery("SELECT * FROM category_property_keys ORDER BY id DESC LIMIT 1");

        if (resultSet.next()) {
            int id = resultSet.getInt("id");
            String builtIn = resultSet.getString("built_in");
            int categoryId = resultSet.getInt("category_id");
            String keyType = resultSet.getString("key_type");
            String name = resultSet.getString("name");
            String prefix = resultSet.getString("prefix");
            String suffix = resultSet.getString("suffix");

            System.out.println("id: " + id);
            System.out.println("built_in: " + builtIn);
            System.out.println("category_id: " + categoryId);
            System.out.println("key_type: " + keyType);
            System.out.println("name: " + name);
            System.out.println("prefix: " + prefix);
            System.out.println("suffix: " + suffix);

            assertNotNull("id null olamaz", id);
            assertNotNull("built_in null olamaz", builtIn);
            assertNotNull("category_id null olamaz", categoryId);
            assertNotNull("key_type null olamaz", keyType);
            assertNotNull("name null olamaz", name);
            assertNotNull("prefix null olamaz", prefix);
            assertNotNull("suffix null olamaz", suffix);
        }   else {
            System.out.println("category_property_keys tablosunda kayit bulunamadi");
        }
        if (resultSet != null) resultSet.close();
        if (statement != null) statement.close();
        if (connection != null) connection.close();
        System.out.println("DB baglantisi kapatildi");
    }
}
