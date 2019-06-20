package bean;

import bean.AllEnum.TypeTeam;
import bean.intfc.Team;
import bean.intfc.User;

import java.io.Serializable;
import java.util.Collection;
import java.util.LinkedList;

public class TeamImpl implements Team, Serializable, Cloneable {
    public static final Team NULL_TEAM = new TeamImpl();
    private long id;
    private String nameTeam;
    private TypeTeam typeTeam;
    private User captain;
    private Collection<User> member;

    public TeamImpl() {
        this.id = 0;
        this.nameTeam = "";
        this.typeTeam = TypeTeam.values()[0];
        this.captain = UserImpl.NULL_USER;
        this.member = new LinkedList<>();
    }

    public TeamImpl(long id, String nameTeam, TypeTeam typeTeam, User captain, Collection<User> member) {
        this.id = id;
        this.nameTeam = nameTeam;
        this.typeTeam = typeTeam;
        this.captain = captain;
        this.member = member;
    }

    @Override
    public Team clone() {
        try {
            return (Team) super.clone();
        } catch (CloneNotSupportedException ignored) {
            return NULL_TEAM;
        }
    }

    @Override
    public Team clone(long newId) {
        if (this == NULL_TEAM) return NULL_TEAM;

        return new TeamImpl(newId, nameTeam, typeTeam, captain, member);
    }

    @Override
    public long getId() {
        return id;
    }

    @Override
    public String getNameTeam() {
        return nameTeam;
    }

    @Override
    public TypeTeam getTypeTeam() {
        return typeTeam;
    }

    @Override
    public User getCaptain() {
        return captain;
    }

    @Override
    public Collection<User> getMember() {
        return member;
    }

    @Override
    public void setNameTeam(String nameTeam) {
        this.nameTeam = nameTeam;
    }

    @Override
    public void setTypeTeam(TypeTeam typeTeam) {
        this.typeTeam = typeTeam;
    }

    @Override
    public void setCaptain(User captain) {
        this.captain = captain;
    }

    public void setMember(Collection<User> member) {
        this.member = member;
    }
}
