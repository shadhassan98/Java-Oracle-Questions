package DFC;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionConn2 {
    public static void main(String[] args)  {
        String dbURL = "jdbc:sqlserver://sqldatabase98.database.windows.net;databaseName=Shad-sqlDatabase";
        String username = "shadhassan";
        String password = "";
    try {  
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection conn = DriverManager.getConnection(dbURL, username, password);
            String query = "select * from item where id = 110";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()) {
                System.out.println("ID: " + rs.getInt("Id"));
                System.out.println("Description: " + rs.getString("Descrip"));
                System.out.println("Price: " + rs.getDouble("Price"));
                System.out.println("Quantity: " + rs.getInt("Quantity"));
            }
        } 
        catch (SQLException | ClassNotFoundException se) {
            System.out.println("Error");
        }
    } 
}

