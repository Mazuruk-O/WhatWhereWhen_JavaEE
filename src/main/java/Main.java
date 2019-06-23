import bean.AllEnum.Language;
import bean.AllEnum.OptionLevel;
import bean.AllEnum.TypeContact;
import bean.AllEnum.TypeTeam;
import bean.UserImpl;
import bean.intfc.User;
import connector.ConnectorDB;
import model.LoaderEnum;
import model.LoaderEnumImpl;
import model.repository.Repository;
import model.repository.RepositoryUser;
import model.repository.Specification;

import java.io.File;
import java.sql.*;
import java.util.Arrays;
import java.util.List;

public class Main {
//    private static final String databaseProperties = "src/main/resources/database.properties";

//    public static void main(String[] args) throws SQLException {
//        Connection connection = ConnectorDB.getConnection(new File(databaseProperties));
//        Statement st = connection.createStatement();
//        ResultSet rs = st.executeQuery("select * from (type_team a inner join language b on a.id_name_language = b.id_name_language)");
//        rs.last();
//        System.out.println("ResultSet size: " + rs.getRow());
//        rs.first();
//        while(rs.next()){
//            System.out.print("id_type_team: " + rs.getInt(1));
//            System.out.print("  name_type: " + rs.getString("name_type_team"));
//            System.out.println("  language: " + rs.getString("name_language"));
//        System.out.println();
//        }
//    }

//    public static void main(String[] args) throws SQLException {
//        LoaderEnum loaderEnum = new LoaderEnumImpl();
//        loaderEnum.loadEnum(ConnectorDB.getConnection(new File(databaseProperties)));
//
//        System.out.println(Arrays.toString(Language.values()));
//        System.out.println("=================");
//        System.out.println(Arrays.toString(TypeContact.values()));
//        System.out.println("=================");
//        System.out.println(Arrays.toString(TypeTeam.values()));
//        System.out.println("+++++++++++++++++");
//        User user = new UserImpl(12,"Oleg","Mazuruk","Volodymyrovych", Date.valueOf("1998-04-03"), 1,Language.values()[0]);
//        Repository repositoryUser = new RepositoryUser(ConnectorDB.getConnection(new File(databaseProperties)));
//        repositoryUser.add(user);
//    }
}
