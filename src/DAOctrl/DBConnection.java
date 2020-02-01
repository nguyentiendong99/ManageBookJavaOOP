package DAOctrl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private final String DBNAM = "dong";
    private final String USER = "sa";
    private final String PASS = "dongnguyen190699";
    private static DBConnection instance = new DBConnection();
    private DBConnection(){

    }
    public static DBConnection getInstance(){
        return instance;
    }
    public Connection getConnection(){
        var url ="jdbc:sqlserver://localhost:1433;databasename=" + DBNAM +
                ";user=" + USER +";password=" + PASS;
        Connection conn = null;
        try {
            conn= DriverManager.getConnection(url);

        }catch (SQLException e){
            e.printStackTrace();
        }
        return conn;
    }
}
