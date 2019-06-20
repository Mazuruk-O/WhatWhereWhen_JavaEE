package bean.intfc;

import bean.AllEnum.TypeTeam;

import java.util.Collection;
import java.util.List;

public interface Team {
    Team clone();
    Team clone(long newId);

    long getId();
    String getNameTeam();
    TypeTeam getTypeTeam();
    User getCaptain();
    Collection<User> getMember();

    void setNameTeam(String nameTeam);
    void setTypeTeam(TypeTeam typeTeam);
    void setCaptain(User captain);
    void setMember(Collection<User> member);
}
