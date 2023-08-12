package DFC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {
    static Connection newConnection =null;
    public static Connection getDBConnection () throws SQLException { 
        String URL = "jdbc:sqlserver://sqldatabase98.database.windows.net;databaseName=Shad-sqlDatabase";
        String username = "shadhassan";
        String password = "";
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        }
        catch(Exception e){
            System.out.println(e);
        }
        try { 
            Connection con = DriverManager.getConnection(URL, username, password);
            newConnection = con;
        }
        catch(Exception e){
            System.out.println(e);
        }
        return newConnection;
    }
    public static void main (String [] args) throws SQLException { 
        getDBConnection();
        Statement st = newConnection.createStatement();
        st.executeUpdate("INSERT INTO student VALUES (104, 'Kelvinayy')");
    }
}
