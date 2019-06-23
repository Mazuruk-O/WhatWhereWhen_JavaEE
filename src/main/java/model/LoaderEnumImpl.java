package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import bean.AllEnum.*;
import connector.ConnectorDB;

public class LoaderEnumImpl implements LoaderEnum {
    private static final String GET_LANGUAGE_ENUM_SQL = "select name_language from language";
    private static final String GET_TYPE_CONTACT_ENUM_SQL = "select name_type_contact_information from type_contact_information";
    private static final String GET_TYPE_TEAM_ENUM_SQL = "select name_type_team from type_team";
    private static final String GET_OPTIONAL_LEVEL_ENUM_SQL = "select access_level_required from option_access_level";

    @Override
    public boolean loadEnum(Connection connection) {
        try {
            loadLanguageEnum(connection);
            loadTypeContact(connection);
            loadTypeTeamEnum(connection);
            loadOptionalLevel(connection);
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    private ResultSet getResultSet(Connection connection, String sqlRequest) throws SQLException {
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery(sqlRequest);

        return rs;
    }

    private <T extends Enum<?>> void addToEnumWithResultSet(ResultSet rs, Class<T> enumClass) throws SQLException {
        while (rs.next()){
            DynamicEnum.addEnum(enumClass,rs.getString(1));
        }
    }

    private void loadLanguageEnum(Connection connection) throws SQLException {
        addToEnumWithResultSet(getResultSet(connection,GET_LANGUAGE_ENUM_SQL),Language.class);
        return;
    }

    private void loadTypeTeamEnum(Connection connection) throws SQLException {
        addToEnumWithResultSet(getResultSet(connection,GET_TYPE_TEAM_ENUM_SQL),TypeTeam.class);
        return;
    }

    private void loadTypeContact(Connection connection) throws SQLException {
        addToEnumWithResultSet(getResultSet(connection,GET_TYPE_CONTACT_ENUM_SQL),TypeContact.class);
        return;
    }

    private void loadOptionalLevel(Connection connection) throws SQLException {
        addToEnumWithResultSet(getResultSet(connection,GET_OPTIONAL_LEVEL_ENUM_SQL),OptionLevel.class);
        return;
    }
}
