package JDBCLocale;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class PropertiesProp2 {
    public static void main(String[] args) {
        
            String URL = "jdbc:sqlserver://sqldatabase98.database.windows.net;databaseName=Shad-sqlDatabase";
            String username = "shadhassan";
            String password = "";
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Properties prop = new Properties();
            prop.put("user",username);
            prop.put("password",password);
            Connection conn = DriverManager.getConnection(URL,prop);
            if(conn != null) {
                System.out.println("Connection Established");
            }
         }
         catch (Exception e) {
            System.out.println(e);
         }
    }
}
