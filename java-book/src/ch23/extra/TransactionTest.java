package ch23.extra;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TransactionTest {
    private static final String driver = "oracle.jdbc.driver.OracleDriver";
    private static final String url = "jdbc:oracle:thin:@localhost:1521:XE";
    private static final String user = "C##user1";
    private static final String pwd = "1234";

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Connection conn;
        Statement statement;

        Class.forName(driver);
        conn = DriverManager.getConnection(url, user, pwd);
        conn.setAutoCommit(false);
        statement = conn.createStatement();

        String query;
        int rows;

        // 이런 쿼리가 여러 줄 있다고 가정
        query = "DELETE FROM Person";

        // DELETE 했지만 ROLLBACK 명령으로 되돌려서 안 지워져 있음
        conn.rollback();

        // 데이터베이스에 반영하려면 commit 메서드 사용
        // conn.commit();
    }
}
