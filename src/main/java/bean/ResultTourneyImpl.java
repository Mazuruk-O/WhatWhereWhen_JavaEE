package bean;

import bean.intfc.ResultTourney;
import bean.intfc.Team;
import bean.intfc.Tourney;

import java.io.Serializable;

public class ResultTourneyImpl implements ResultTourney, Serializable,Cloneable {
    public static final ResultTourney NULL_RESULT_TOURNEY = new ResultTourneyImpl();

    private long id;
    private Tourney tourney;
    private Team team;
    private long rightAnswer;

    public ResultTourneyImpl() {
        this.id = 0;
        this.tourney = TourneyImpl.NULL_TOURNEY;
        this.team = TeamImpl.NULL_TEAM;
        this.rightAnswer = 0;
    }

    public ResultTourneyImpl(long id, Tourney tourney, Team team, long rightAnswer) {
        this.id = id;
        this.tourney = tourney;
        this.team = team;
        this.rightAnswer = rightAnswer;
    }

    public ResultTourney clone(){
        try {
            return (ResultTourney) super.clone();
        } catch (CloneNotSupportedException ignored) {
            return NULL_RESULT_TOURNEY;
        }
    }

    public ResultTourney clone(long newId){
        if (this == NULL_RESULT_TOURNEY) return NULL_RESULT_TOURNEY;

        return new ResultTourneyImpl(newId,tourney,team,rightAnswer);
    }

    @Override
    public long getId() {
        return id;
    }

    @Override
    public Tourney getTourney() {
        return tourney;
    }

    @Override
    public Team getTeam() {
        return team;
    }

    @Override
    public long getRightAnswer() {
        return rightAnswer;
    }

    @Override
    public void setTourney(Tourney tourney) {
        this.tourney = tourney;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    @Override
    public void setRightAnswer(long rightAnswer) {
        this.rightAnswer = rightAnswer;
    }
}
