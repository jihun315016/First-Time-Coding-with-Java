package ch23.extra;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

class PreparedJDBC {
    private static final String driver = "oracle.jdbc.driver.OracleDriver";
    private static final String url = "jdbc:oracle:thin:@localhost:1521:XE";
    private static final String user = "C##user1";
    private static final String pwd = "1234";

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Connection conn;
    
        Class.forName(driver);
        conn = DriverManager.getConnection(url, user, pwd);
        //conn.setAutoCommit(false);


        ResultSet resultSet;
        String sql;
        //int[] rowsArray;
        //PreparedStatement insertPreparedStatement;
        PreparedStatement selectPreparedStatement;
        String id, name;

        // sql = "INSERT INTO Member (id, name) VALUES (?, ?)";
        // insertPreparedStatement = conn.prepareStatement(sql);
        
        // insertPreparedStatement.setString(1, "0016");
        // insertPreparedStatement.setString(2, "kim");
        // insertPreparedStatement.addBatch();
        
        // insertPreparedStatement.setString(1, "0017");
        // insertPreparedStatement.setString(2, "park");
        // insertPreparedStatement.addBatch();
        
        // rowsArray = insertPreparedStatement.executeBatch();
        // conn.commit();
        
        // for (int rows : rowsArray) {
            //     System.out.println(rows);
            // }
            
        // conn.setAutoCommit(false); << 주석 처리하였다.
        sql = "SELECT id, name FROM Member";
        selectPreparedStatement = conn.prepareStatement(sql);
        resultSet = selectPreparedStatement.executeQuery();
        while (resultSet.next()) {
            id = resultSet.getString("id");
            name = resultSet.getString("name");
            System.out.println(id + " " + name);
        }

        resultSet.close();
        selectPreparedStatement.close();
        conn.close();
    }
}
