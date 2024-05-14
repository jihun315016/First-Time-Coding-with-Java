package ch17.sec05_01;

import java.util.Properties;

public class MysqlDriverTest {
    public static void main(String[] args) {
        Properties prop = new Properties();
        prop.setProperty("driver",  "com.mysql.xxx");
        prop.setProperty("url", "jdbc:mysql://xxx");
        prop.setProperty("username", "user1");
    
        System.out.println(prop.getProperty("driver"));
        System.out.println(prop.getProperty("url"));
        System.out.println(prop.getProperty("username"));
    }
}
