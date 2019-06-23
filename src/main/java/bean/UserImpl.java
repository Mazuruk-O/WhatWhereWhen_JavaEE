package bean;

import bean.AllEnum.Language;
import bean.intfc.User;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDate;
import java.util.Map;
import java.util.TreeMap;

public class UserImpl implements User, Serializable,Cloneable {
    public static final User NULL_USER = new UserImpl();
    private long id;
    private Map<String, String> contact;
    private String firstname;
    private String surname;
    private String lastname;
    private Date dateBirthday;
    private int level;
    private Language language;

    public UserImpl(long id, String firstname, String surname, String lastname, Date dateBirthday, int level, Language language) {
        this.id = id;
        this.contact = contact;
        this.firstname = firstname;
        this.surname = surname;
        this.lastname = lastname;
        this.dateBirthday = dateBirthday;
        this.level = level;
        this.language = language;
        return;
    }

    public UserImpl() {
        this.id = 0;
        this.contact = new TreeMap<>();
        this.firstname = "";
        this.surname = "";
        this.lastname = "";
        this.dateBirthday = Date.valueOf(LocalDate.MIN);
        this.level = 0;
        this.language = Language.values()[0];
        return;
    }

    /**
     * ToDo: check it's new User
     * @return
     */
    @Override
    public boolean isNew() {
        return false;
    }

    @Override
    public User clone() {
        try {
            return (User) super.clone();
        } catch (CloneNotSupportedException ignored) {
            return NULL_USER;
        }
    }

    @Override
    public User clone(long newId) {
        if (this == NULL_USER) return NULL_USER;

        return new UserImpl(newId, firstname, surname, lastname, dateBirthday, level, language);
    }

    @Override
    public long getId() {
        return id;
    }

    @Override
    public Map<String, String> getContacts() {
        return contact;
    }

    @Override
    public String getFirstName() {
        return firstname;
    }

    @Override
    public String getLastName() {
        return lastname;
    }

    @Override
    public String getSurnameName() {
        return surname;
    }

    @Override
    public Date getDateBirtday() {
        return dateBirthday;
    }

    @Override
    public int getLevel() {
        return level;
    }

    @Override
    public Language getLanguage() {
        return language;
    }

    @Override
    public void setContact(Map<String, String> contacts) {
        if(contacts == null || contacts.size() == 0)
            return;

        this.contact = contacts;
        return;
    }

    @Override
    public void setFirstName(String firstname) {
        if(!isNullOrEmpty(firstname)){
            this.firstname = firstname;
        }

        return;
    }

    @Override
    public void setLastName(String lastName) {
        if(!isNullOrEmpty(lastName)){
            this.firstname = lastName;
        }

        return;
    }

    @Override
    public void setSurnameName(String surname) {
        if(!isNullOrEmpty(surname)){
            this.firstname = surname;
        }

        return;
    }

    @Override
    public void setDateBirthday(Date dateBirthday) {
        if(!(dateBirthday == null)){
            this.dateBirthday = dateBirthday;
        }

        return;
    }

    @Override
    public void setLevel(int level) {
        if(!(level < 0)){
            this.level = level;
        }

        return;
    }

    @Override
    public void setLanguage(Language language) {
        this.language = language;
    }

    /**
     * @param s - string reference to check
     * @return true if the string is null or is the empty string
     */
    private static boolean isNullOrEmpty(String s){
        if(s == null || s.equals(""))
            return true;

        return false;
    }
}
