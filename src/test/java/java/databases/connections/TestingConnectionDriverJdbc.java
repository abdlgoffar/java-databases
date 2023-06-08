package java.databases.connections;

import org.junit.jupiter.api.Test;

import java.databases.helpers.ConnectionDriverJdbc;
import java.sql.Connection;

public class TestingConnectionDriverJdbc {
    @Test
    public void testConnectionDriverJdbc() {
        String url = "jdbc:mysql://localhost:3306/db_name";
        String username = "root";
        String password = "";
        Connection connection = ConnectionDriverJdbc.startDriverManager(url, username, password);
    }
}
