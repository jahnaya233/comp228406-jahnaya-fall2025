package utils;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;

public class DBConnection {

    private static final String URL =
            "jdbc:postgresql://db.yrwpdvkyhhbdtjdmuysw.supabase.co:5432/postgres";

private static final String USER = "postgres";
private static final String PASSWORD = "h6TxKuqG5D1fZizW";

public static Connection getConnection() throws Exception {
    return DriverManager.getConnection(URL, USER, PASSWORD);
}

}

