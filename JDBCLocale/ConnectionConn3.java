package JDBCLocale;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



// ANSWER :- The Employee table is not updated and the program prints: 112 Jerry   
// it's INSENSITIVE, BUT this means it cannot see changes to db made my other means...
//  if you change the same ResultSet, you can see it even in INSENSITIVE mode!
// But table is not updated because rs.updateRow() needs to be called for ResultSet 
// updates to be committed to the db...


public class ConnectionConn3 {
    public static void main(String[] args) {
        String dbURL = "jdbc:sqlserver://sqldatabase98.database.windows.net;databaseName=Shad-sqlDatabase";
        String username = "shadhassan";
        String password = "";
    try {  
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection conn = DriverManager.getConnection (dbURL, username, password);
            Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            st.execute("SELECT * FROM employee2");
            ResultSet rs = st.getResultSet();
            while (rs.next()) {
                if (rs.getInt(1) == 112) {
                    rs.updateString(2, "Jack");
                }
            }
            rs.absolute(2);
            System.out.println(rs.getInt(1) + " " + rs.getString(2));
        } 
        catch (SQLException | ClassNotFoundException ex) {
            System.out.println("Exception is raised : " + ex);
        }
    }
}
