package ch23.extra;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import java.sql.ResultSet;

public class JDBCConn {
    private static final String driver = "oracle.jdbc.driver.OracleDriver";
    private static final String url = "jdbc:oracle:thin:@localhost:1521:XE";
    private static final String user = "C##user1";
    private static final String pwd = "1234";

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Connection conn;
        Statement statement;
        
        // driver 클래스(Oracle Driver)를 메모리에 로드
        // 해당 클래스 초기화 과정 중 드라이버를 DriverManager에 등록하는 과정이 포함되어 있다.
        Class.forName(driver);
                
        // 데이터베이스에 연결 시도
        // url이 오라클 드라이버가 사용된다는 것을 명시하고 있다.
        conn = DriverManager.getConnection(url, user, pwd);

        // 쿼리를 데이터베이스에 보내기 위해 사용되는 인터페이스
        statement = conn.createStatement();

        

        ResultSet resultSet;
        String query;
        int rows;
        String id, name;

        query = "INSERT INTO Person VALUES (1, 'kim')";
        rows = statement.executeUpdate(query); // 적용된 행 : 1
        
        query = "SELECT id, name FROM Person ORDER BY id";
        resultSet = statement.executeQuery(query);

        System.out.println("==================================================");
        while (resultSet.next()) {
            id = resultSet.getString("id");
            name = resultSet.getString("name");
            System.out.println(id + " " + name);
        }
        System.out.println("==================================================");

    }
}
