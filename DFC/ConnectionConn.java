package DFC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectionConn {
    public static void main(String[] args) {
        String URL = "jdbc:sqlserver://sqldatabase98.database.windows.net;databaseName=Shad-sqlDatabase";
        String username = "shadhassan";
        String password = "";
        Connection conn = null;
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(URL, username, password);
        }
        catch(Exception e){
            System.out.println(e);
        }
        
        String query = "SELECT id FROM employee";
        try (Statement stmt = conn.createStatement()) {
            ResultSet rs = stmt.executeQuery(query);
            stmt.executeQuery("SELECT id FROM customer");
            while (rs.next()) {
            //process the results
            System.out.println("Employee ID: "+ rs.getInt("id"));
        }
        } catch (Exception e) {
            System.out.println (e);
        }
    }
}
