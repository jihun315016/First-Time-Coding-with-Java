package ch23.sec01_02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedStatementTest {
    private static final String driver = "oracle.jdbc.driver.OracleDriver";
    private static final String url = "jdbc:oracle:thin:@localhost:1521:XE";
    private static final String user = "C##user1";
    private static final String pwd = "1234";

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Connection conn;
        PreparedStatement preparedStatement;
        ResultSet resultSet;
        String sql;

        Class.forName(driver);
        conn = DriverManager.getConnection(url, user, pwd);
        preparedStatement = conn.prepareStatement(driver);

        sql = "INSERT INTO Member (id, name, height, weight, age) VALUES (?, ?, ?, ?, ?)";
        preparedStatement = conn.prepareStatement(sql);
        preparedStatement.setString(1, "0010");
        preparedStatement.setString(2, "지성2");
        preparedStatement.setInt(3, 178);
        preparedStatement.setInt(4, 67);
        preparedStatement.setInt(5, 23);

        int rows = preparedStatement.executeUpdate();

        // sql = "SELECT id, name FROM Member WHERE id = ?";
        // preparedStatement.setString(1, "0005");
        // resultSet = preparedStatement.executeQuery();
        // while (resultSet.next()) {
        //     System.out.println(resultSet.getString("id") + " " + resultSet.getString("name"));
        // }
    }
}
