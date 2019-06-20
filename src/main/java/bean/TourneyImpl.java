package bean;

import bean.AllEnum.TypeTeam;
import bean.intfc.Question;
import bean.intfc.Team;
import bean.intfc.Tourney;
import bean.intfc.User;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDate;
import java.util.Collection;
import java.util.LinkedList;

public class TourneyImpl implements Tourney, Serializable, Cloneable {
    public static final Tourney NULL_TOURNEY = new TourneyImpl();
    private long id;
    private String nameTourney;
    private Date dateBeginTourney;
    private long numberQuestion;
    private TypeTeam typeTeam;
    private User userCreator;
    private Collection<Team> teams;
    private Collection<Question> questions;

    public TourneyImpl() {
        this.id = 0;
        this.nameTourney = "";
        this.dateBeginTourney = Date.valueOf(LocalDate.MIN);
        this.numberQuestion = 0;
        this.typeTeam = TypeTeam.values()[0];
        this.userCreator = UserImpl.NULL_USER;
        this.teams = new LinkedList<>();
        this.questions = new LinkedList<>();
        return;
    }

    public TourneyImpl(long id, String nameTourney, Date dateBeginTourney, long numberQuestion, TypeTeam typeTeam, User userCreator, Collection<Team> teams, Collection<Question> questions) {
        this.id = id;
        this.nameTourney = nameTourney;
        this.dateBeginTourney = dateBeginTourney;
        this.numberQuestion = numberQuestion;
        this.typeTeam = typeTeam;
        this.userCreator = userCreator;
        this.teams = teams;
        this.questions = questions;
        return;
    }

    public Tourney clone(){
        try {
            return (Tourney) super.clone();
        } catch (CloneNotSupportedException ignored) {
            return NULL_TOURNEY;
        }
    }

    public Tourney clone(long newId){
        if(this == NULL_TOURNEY) return NULL_TOURNEY;

        return new TourneyImpl(newId,nameTourney,dateBeginTourney,numberQuestion,typeTeam,userCreator,teams,questions);
    }

    public long getId() {
        return id;
    }

    public String getNameTourney() {
        return nameTourney;
    }

    public Date getDateBeginTourney() {
        return dateBeginTourney;
    }

    public long getNumberQuestion() {
        return numberQuestion;
    }

    public TypeTeam getTypeTeam() {
        return typeTeam;
    }

    public User getUserCreator() {
        return userCreator;
    }

    public Collection<Team> getTeams() {
        return teams;
    }

    public Collection<Question> getQuestions() {
        return questions;
    }

    public void setNameTourney(String nameTourney) {
        this.nameTourney = nameTourney;
    }

    public void setDateBeginTourney(Date dateBeginTourney) {
        this.dateBeginTourney = dateBeginTourney;
    }

    public void setNumberQuestion(long numberQuestion) {
        this.numberQuestion = numberQuestion;
    }

    public void setTypeTeam(TypeTeam typeTeam) {
        this.typeTeam = typeTeam;
    }

    public void setUserCreator(User userCreator) {
        this.userCreator = userCreator;
    }

    public void setTeams(Collection<Team> teams) {
        this.teams = teams;
    }

    public void setQuestions(Collection<Question> questions) {
        this.questions = questions;
    }
}
