package connection;

import java.sql.*;

public class ConnectDB {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/testdatabase?characterEncoding=latin1&useConfigs=maxPerformance";
        String username = "root";
        String password = "yani1983";
        String query = "select * from students";

        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection(url, username, password);


        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        resultSet.next();


        String student1 = resultSet.getString("name");
        System.out.println(student1);
        }

    }

