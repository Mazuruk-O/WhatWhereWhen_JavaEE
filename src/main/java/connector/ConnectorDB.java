package connector;

import com.mysql.cj.jdbc.ConnectionImpl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.ResourceBundle;

/**
 * class ConnectorDB - performs the function of the database connection provider
 */

public class ConnectorDB {

    /**
     * @param file - properties database resources, which have next struct:
     *
     *             db.host = jdbc:mysql://localhost:3306/name_database
     *             db.login = login
     *             db.password = pessword
     *             db.classForName = com.mysql.cj.jdbc.Driver
     *
     * @return Connection with Database
     */
    public static Connection getConnection(File file) throws IOException, ClassNotFoundException, SQLException {
        if(checkCorrectFile(file)){
            FileInputStream fis = new FileInputStream(file);

            Properties property = new Properties();
            property.load(fis);

            String host = property.getProperty("db.host");
            String login = property.getProperty("db.login");
            String password = property.getProperty("db.password");
            String classForName = property.getProperty("db.classForName");

            Class.forName(classForName);
            return DriverManager.getConnection(host,login,password);
        }

        return null;
    }

    /**
     * @param file - checking file
     * @return true - if it's the file and file has an extension .properties
     */
    public static boolean checkCorrectFile(File file){
        if(file.isFile() && file.getPath().contains(".properties")){
            return true;
        }

        return false;
    }
}
