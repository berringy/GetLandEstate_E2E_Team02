package getland.stepdefs.db_stepdefs.us01_stepdefs;

import getland.utilities.ConfigReader;
import io.cucumber.java.en.*;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class US01_TableNamesStepdefs {
    Connection connection;
    Statement statement;
    ResultSet resultSet;

    List<String> actualTableNames = new ArrayList<>();

    @Given("Connect to the database1")
    public void connect_to_db1() throws SQLException {
        connection = DriverManager.getConnection(
                ConfigReader.getProperty("dbUrl"),
                ConfigReader.getProperty("dbUser"),
                ConfigReader.getProperty("dbPassword")
        );
        System.out.println("✅ Database connection is established.");
    }

    @When("Send query to retrieve all table names1")
    public void send_query_for_table_names1() throws SQLException {
        statement = connection.createStatement();
        resultSet = statement.executeQuery("SELECT tablename FROM pg_tables WHERE schemaname = 'public'");

        while (resultSet.next()) {
            actualTableNames.add(resultSet.getString("tablename"));
        }
        System.out.println("✅ Table names retrieved: " + actualTableNames);
    }

    @Then("Validate table names from resultset1")
    public void validate_table_names_from_resultset1() {
        // 📌 Beklenen tablo isimleri (Görseldeki listeden alınarak düzeltildi)
        List<String> expectedTableNames = Arrays.asList(
                "advert_types", "adverts", "categories",
                "cities", "cmd_exec", "confirmation_token", "contacts",
                "countries", "daily_reports", "districts", "favorites",
                "images", "logs", "profile_photos", "tour_requests",
                "users", "category_property_keys", "category_property_values",
                "personel"
        );

        // 📌 1. Tablo sayısını kontrol et
        assertEquals("❌ Tablo sayısı uyuşmuyor!", expectedTableNames.size(), actualTableNames.size());

        // 📌 2. Eksik ya da fazla tabloları bul ve göster
        for (String actualTable : actualTableNames) {
            if (!expectedTableNames.contains(actualTable)) {
                System.out.println("⚠️ Fazla tablo bulundu: " + actualTable);
            }
        }

        for (String expectedTable : expectedTableNames) {
            if (!actualTableNames.contains(expectedTable)) {
                System.out.println("⚠️ Eksik tablo bulundu: " + expectedTable);
            }
        }

        // 📌 3. Tüm tabloların listede olup olmadığını kontrol et
        for (String expectedTable : expectedTableNames) {
            assertTrue("❌ Eksik tablo: " + expectedTable, actualTableNames.contains(expectedTable));
        }

        System.out.println("✅ All table names validated successfully!");
    }

    @Then("Display and verify the last record added to each table1")
    public void display_and_verify_the_last_record_added_to_each_table1() throws SQLException {
        // 📌 Beklenen tablo isimleri
        List<String> tableNames = Arrays.asList(
                "advert_types", "adverts", "categories",
                "cities", "cmd_exec", "confirmation_token", "contacts",
                "countries", "daily_reports", "districts", "favorites",
                "images", "logs", "profile_photos", "tour_requests",
                "users", "category_property_keys", "category_property_values",
                "personel"
        );

        for (String tableName : tableNames) {
            String query;

            // cmd_exec tablosunda id kolonu yoksa, farklı bir kolon (örneğin cmd_output) kullanıyoruz.
            if ("cmd_exec".equals(tableName)) {
                query = "SELECT * FROM " + tableName + " ORDER BY cmd_output DESC LIMIT 1"; // cmd_output kolonu ile sıralama
            } else {
                query = "SELECT * FROM " + tableName + " ORDER BY id DESC LIMIT 1"; // Diğer tablolar için id ile sıralama
            }

            try {
                statement = connection.createStatement();
                resultSet = statement.executeQuery(query);

                if (resultSet.next()) {
                    System.out.println("📌 Last record in table: " + tableName);

                    ResultSetMetaData metaData = resultSet.getMetaData();
                    int columnCount = metaData.getColumnCount();

                    for (int i = 1; i <= columnCount; i++) {
                        String columnName = metaData.getColumnName(i);
                        Object value = resultSet.getObject(i);

                        // ⏳ Eğer sütun "updated_at", "deleted_at" gibi null olabilecek bir alan ise özel işlem yap
                        if ("updated_at".equals(columnName) || "deleted_at".equals(columnName)) {
                            if (value != null) {
                                // Eğer değer null değilse ve timestamp ise, bunu doğrula
                                if (value instanceof Timestamp) {
                                    System.out.println(columnName + ": " + value);
                                } else {
                                    System.out.println("⚠️ " + columnName + " is not a valid timestamp value!");
                                    fail(columnName + " should be a valid timestamp!");
                                }
                            } else {
                                System.out.println("⚠️ " + columnName + " is NULL (Expected for some cases)");
                            }
                        }
                        // reset_password_code için null kontrolü yapılmaz, sadece uyarı verilir
                        else if ("reset_password_code".equals(columnName)) {
                            if (value == null) {
                                System.out.println("⚠️ " + columnName + " is NULL (Expected for some cases)");
                            } else {
                                System.out.println(columnName + ": " + value);
                            }
                        }
                        // picture_id için null kontrolü yapılmaz, sadece uyarı verilir
                        else if ("picture_id".equals(columnName)) {
                            if (value == null) {
                                System.out.println("⚠️ " + columnName + " is NULL (Expected for some cases)");
                            } else {
                                System.out.println(columnName + ": " + value);
                            }
                        } else {
                            // Diğer sütunlar için null kontrolü
                            if (value == null) {
                                System.out.println("❌ " + columnName + " is NULL! This should not be null!");
                                fail(columnName + " should not be null!");
                            } else {
                                System.out.println(columnName + ": " + value);
                            }
                        }
                    }
                } else {
                    System.out.println("⚠️ No records found in table: " + tableName);
                }
            } catch (SQLException e) {
                System.out.println("❌ Error retrieving data from table: " + tableName);
                e.printStackTrace();
            } finally {
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
            }
        }

        // 📌 Bağlantıyı kapatma işlemi
        if (connection != null) connection.close();
        System.out.println("✅ Database connection closed.");
    }
}
