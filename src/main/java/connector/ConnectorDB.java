package connector;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.ResourceBundle;

public class ConnectorDB {
    private static Connection connection;

    public static Connection getConnection(){
        if(connection == null){
            try (FileInputStream fis = new FileInputStream("src/main/resources/database.properties")){

                Properties property = new Properties();
                property.load(fis);

                String host = property.getProperty("db.host");
                String login = property.getProperty("db.login");
                String password = property.getProperty("db.password");
                String classForName = property.getProperty("db.classForName");

                Class.forName(classForName);
                return DriverManager.getConnection(host,login,password);

            } catch (SQLException e) {
                e.printStackTrace();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }

        return connection;
    }
}
