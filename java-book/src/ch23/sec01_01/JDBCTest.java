package ch23.sec01_01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class JDBCTest {
    private static final String driver = "oracle.jdbc.driver.OracleDriver";
    private static final String url = "jdbc:oracle:thin:@localhost:1521:XE";
    private static final String user = "C##user1";
    private static final String pwd = "1234";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // driver 클래스를 메모리에 로드
            // 해당 클래스 초기화 과정 중 드라이버를 DriverManager에 등록하는 과정이 포함되어 있다.
            Class.forName(driver);
            System.out.println("Oracle 드라이버 로딩 성공");

            // 데이터베이스에 연결 시도
            // url이 오라클 드라이버가 사용된다는 것을 명시하고 있다.
            conn = DriverManager.getConnection(url, user, pwd);
            System.out.println("Connection 성공");

            // Statement : 쿼리를 데이터베이스에 보내기 위해 사용되는 인터페이스
            stmt = conn.createStatement();
            System.out.println("Statement 생성 성공");

            // String query = "INSERT INTO Member VALUES ('0004', '범근차', 185, 85, 23)";
            // System.out.println(query);
            // int rows = stmt.executeUpdate(query); // INSERT, UPDATE, DELETE문 적용  시 사용
            // System.out.println(rows + "개의 행 추가"); // 1개의 행 추가

            // String query2 = "SELECT id, name, age FROM Member ORDER BY id";
            // System.out.println(query2);
            // rs = stmt.executeQuery(query2); // SELECT문 적용 시 사용

            // System.out.println("==================================================");
            // while (rs.next()) {
            //     System.out.println(rs.getString("id") + " " + rs.getString("name") + " " + rs.getString("age"));
            // }
            // System.out.println("==================================================");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } 
    }
}
