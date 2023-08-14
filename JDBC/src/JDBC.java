import java.sql.*;
public class JDBC {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3386/jdbc";
        String user = "root";
        String password = "Ravihara13346";
        String query="";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection=DriverManager.getConnection(url,user,password);
            Statement statement = connection.createStatement();
            statement.executeQuery(query);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
