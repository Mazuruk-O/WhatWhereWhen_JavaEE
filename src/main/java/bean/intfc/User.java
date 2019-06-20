package bean.intfc;

import bean.AllEnum.Language;

import java.sql.Date;
import java.util.Map;

public interface User{
    boolean isNew();
    User clone();
    User clone(long newId);

    long getId();
    Map<String,String> getContacts();
    String getFirstName();
    String getLastName();
    String getSurnameName();
    Date getDateBirtday();
    int getLevel();
    Language getLanguage();

    void setContact(Map<String, String> contacts);
    void setFirstName(String name);
    void setLastName(String name);
    void setSurnameName(String name);
    void setDateBirthday(Date dateBirthday);
    void setLevel(int level);
    void setLanguage(Language language);
}
