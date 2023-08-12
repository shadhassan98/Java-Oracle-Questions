package JDBCLocale;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectionConn4 {
    public static void main(String[] args) {
        String dbURL = "jdbc:sqlserver://sqldatabase98.database.windows.net;databaseName=Shad-sqlDatabase";
        String username = "shadhassan";
        String password = "";
    try {  
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection conn = DriverManager.getConnection (dbURL, username, password);
            String query = "SELECT * FROM Employee WHERE ID = 14";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            //while(rs.next())
            System.out.println("Employee ID: " + rs.getInt("id"));
    }
    catch (Exception se) {
        System.out.println(se);
    }
}
}
