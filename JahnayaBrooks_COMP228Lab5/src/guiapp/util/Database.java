package guiapp.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class Database {

    private static final String url = "jdbc:sqlite:gameplayes.db";

    public static Connection getConnection() throws Exception {
        return DriverManager.getConnection(url);
    }
}

