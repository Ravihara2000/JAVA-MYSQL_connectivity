import java.sql.*;
public class JDBC {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3386/jdbc";
        String user = "root";
        String password = "Ravihara13346";
        String query="SELECT * FROM users";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection=DriverManager.getConnection(url,user,password);
            Statement statement = connection.createStatement();
            statement.executeQuery(query);
            ResultSet result = statement.executeQuery(query);

           String name;
            int age;
            while(result.next()){
                name = result.getString(1);
                age= result.getInt(2);
                System.out.println(name + " "+age);
            }


        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
