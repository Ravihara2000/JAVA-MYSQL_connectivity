import java.sql.*;
public class JDBC {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/jdbc";
        String user = "root";
        String password = "www+ravi2000";
        //String query="SELECT * FROM users";
        String query="INSERT INTO users VALUES ('gayan',28)";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection=DriverManager.getConnection(url,user,password);
            Statement statement = connection.createStatement();
            statement.executeUpdate(query);
            //statement.executeQuery(query);
            //ResultSet result = statement.executeQuery(query);

/*           String name;
            int age;
            while(result.next()){
                name = result.getString(1);
                age= result.getInt(2);
                System.out.println(name + " "+age);
            }*/

            connection.close();


        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
