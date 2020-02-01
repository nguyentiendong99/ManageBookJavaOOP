import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
public class TestConnectDB {
    public static void main(String[] args) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=dong";// your db name
            String user="sa"; // your db username
            String password="dongnguyen190699"; // your db password
//            String connectionUrl = "jdbc:sqlserver://localhost:1433;" +
//                    "databaseName=Tutorial;username=sa;password=123;";
            Connection conn = DriverManager.getConnection(url, user, password);
            if(conn != null){
                System.out.println("Connect success!");
            }

            var sql = "select * from dbo.Student";
            var statement = conn.prepareStatement(sql);
            var resultSet = statement.executeQuery();
            showResutl(resultSet);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void showResutl(ResultSet resultSet) throws SQLException {
        System.out.printf("%-20d%-20s%-20s%-20s%-20s%\n", "ID",
                "Title", "PublishedYear", "Quantity",
               "Author");
        while (resultSet.next()){
            var id = resultSet.getInt("ID");
            var Title = resultSet.getString("Title");
            var PublishedYear = resultSet.getInt("Published");
            var Quantity = resultSet.getInt("Quantity");
            var Author = resultSet.getString("Author");

            System.out.printf("%-20d%-20s%-20s%-20s%-20s%\n", id, Title,
                    PublishedYear,Quantity,Author);
        }
    }
}
