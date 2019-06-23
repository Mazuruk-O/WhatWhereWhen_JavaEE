package model.repository;

import bean.AllEnum.Language;
import bean.AllEnum.OptionLevel;
import bean.UserImpl;
import bean.intfc.User;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class RepositoryUser implements Repository<User> {
    private Connection connection;
    private static final String SQL_INSERT = "INSERT INTO user(id_user_registration_detail,firstname,surname,lastname,date_birtday,id_option_access_level,id_language) VALUES(?,?,?,?,?,?,?)";
    //private static final String SQL_UPDATE = "INSERT INTO user(firstname,surname,lastname,date_birthday,id_option_access_level,id_language) VALUES(?,?,?,?,?,?)";
    //private static final String SQL_REMOVE = "INSERT INTO user(firstname,surname,lastname,date_birthday,id_option_access_level,id_language) VALUES(?,?,?,?,?,?)";

    public RepositoryUser(Connection connection){
        this.connection = connection;
    }

    @Override
    public void add(User add) {
        try {
            PreparedStatement ps = getPreparedStatement(SQL_INSERT);
            ps.setInt(1,1);
            ps.setString(2,add.getFirstName());
            ps.setString(3,add.getSurnameName());
            ps.setString(4,add.getLastName());
            ps.setDate(5,add.getDateBirtday());
            ps.setInt(6, (OptionLevel.valueOf(Integer.toString(add.getLevel()))).ordinal()+1);
            ps.setInt(7,add.getLanguage().ordinal()+1);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void remove(User remove) {

    }

    @Override
    public void update(User update) {

    }

    @Override
    public List<User> query(Specification specification) {
        List<User> list = new LinkedList<>();

        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(specification.toSqlClauses());

            while(rs.next()) {
                list.add(new UserImpl(rs.getInt(1), rs.getString(2), rs.getString(3),
                        rs.getString(4), rs.getDate(5), rs.getInt(6),
                        Language.values()[rs.getInt(7)-1]));
            }

            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            return list;
        }
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    private PreparedStatement getPreparedStatement(String sql) throws SQLException {
        PreparedStatement ps = null;
        ps = connection.prepareStatement(sql);
        return ps;
    }
}
