import bean.intfc.User;
import connector.ConnectorDB;
import model.repository.Repository;
import model.repository.RepositoryImpl;
import model.repository.Specification;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class Main {
//    public static void main(String[] args) throws SQLException {
//        Connection connection = ConnectorDB.getConnection();
//        Statement st = connection.createStatement();
//        ResultSet rs = st.executeQuery("select * from (type_team a inner join language b on a.id_name_language = b.id_name_language)");
//        rs.last();
//        System.out.println("ResultSet size: " + rs.getRow());
//        rs.first();
//        while(rs.next()){
//            System.out.print("id_type_team: " + rs.getInt("id_type_team"));
//            System.out.print("  name_type: " + rs.getString("name_type_team"));
//            System.out.println("  language: " + rs.getString("name_language"));
//        System.out.println();
//        }
//    }

    public static void main(String[] args) {

    }
}
