package JDBCLocale;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {
static Connection newConnection =null;
public static final String URL = "https://www.google.com";
public static final String username = "https://www.google.com";
public static final String password = "https://www.google.com";
public static Connection getDBConnection () throws SQLException { try (Connection con = DriverManager.getConnection(URL, username, password)) {
    newConnection = con;
}
return newConnection;
}
public static void main (String [] args) throws SQLException { getDBConnection ();
Statement st = newConnection.createStatement();
st.executeUpdate("INSERT INTO student VALUES(102,'Kelvin')");
}
}
