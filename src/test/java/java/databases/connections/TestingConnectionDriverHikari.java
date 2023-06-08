package java.databases.connections;

import org.junit.jupiter.api.Test;

import java.databases.helpers.ConnectionDriverHikari;
import java.sql.Connection;

public class TestingConnectionDriverHikari {
    @Test
    public void testConnectionDriverHikari() {
        Connection connection = ConnectionDriverHikari.startHikariDataSource();
    }

}
