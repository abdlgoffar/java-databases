package java.databases.helpers;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionDriverHikari {
    private static HikariDataSource hikariDataSource;
    private static Connection connection;
    static {
        //configuration connection database
        HikariConfig hikariConfig = new HikariConfig();
        hikariConfig.setDriverClassName("com.mysql.cj.jdbc.Driver");
        hikariConfig.setJdbcUrl("jdbc:mysql://localhost:3306/learnjavadatabase");
        hikariConfig.setUsername("root");
        hikariConfig.setPassword("");
        //configuration service database
        hikariConfig.setMaximumPoolSize(10);//max user for connect to database
        hikariConfig.setMinimumIdle(5);//max connection opened in database
        hikariConfig.setIdleTimeout(60_000);//time to closed connection database, if nothing user connect
        hikariConfig.setMaxLifetime(60_000 * 10);//max time user connect to database,before repeat connect
        hikariDataSource = new HikariDataSource(hikariConfig);
    }
    public static Connection startHikariDataSource() {
        try {
            connection = ConnectionDriverHikari.hikariDataSource.getConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }
}
