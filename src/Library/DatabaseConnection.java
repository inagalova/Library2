package Library;

import com.sun.source.tree.ArrayAccessTree;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class DatabaseConnection {
    public Connection connection = null;

    public DatabaseConnection(){
        connect();
    }

    private void connect() {
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection("jdbc:postgresql://77.77.151.91:5432/library", "ina.galova", "w@(^d$G5");
            if(connection != null) {
                System.out.println("Database connected!");
            } else {
                System.out.println("Database connection error");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public void Execute(String query){
        try{
            Statement statement = connection.createStatement();
            statement.executeUpdate(query);
            statement.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public void Fetch(String query){
        ResultSet result;
        try{
            Statement statement = connection.createStatement();
            result = statement.executeQuery(query);
            while(result.next()){
                result.getString("name");
            }
            statement.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
