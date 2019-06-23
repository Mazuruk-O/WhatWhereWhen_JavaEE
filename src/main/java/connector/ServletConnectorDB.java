package connector;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

@WebServlet(name = "ServletConnectorDB")
public class ServletConnectorDB extends HttpServlet {
    @Override
    public void init() throws ServletException {
        super.init();
        Logger log = (Logger)getServletContext().getAttribute("log4");
        String dbfilename = getInitParameter("pathSettingConnect");
        File file = new File(dbfilename);
        Connection connection = null;

        if(checkCorrectFile(file)){
            FileInputStream fis = null;
            try {
                fis = new FileInputStream(file);
                Properties property = new Properties();
                property.load(fis);

                String host = property.getProperty("db.host");
                String login = property.getProperty("db.login");
                String password = property.getProperty("db.password");
                String classForName = property.getProperty("db.classForName");

                Class.forName(classForName);
                connection = DriverManager.getConnection(host,login,password);
            } catch (FileNotFoundException e) {
                log.warn("FileNotFoundException: ",e);
            } catch (IOException e) {
                log.warn("IOException: ",e);
            } catch (SQLException e) {
                log.warn("SQLException: ",e);
            } catch (ClassNotFoundException e) {
                log.warn("ClassNotFoundException: ",e);
            }
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

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
