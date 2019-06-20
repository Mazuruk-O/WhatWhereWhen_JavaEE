package bean.intfc;

public interface ResultTourney {
    ResultTourney clone();
    ResultTourney clone(long newId);

    long getId();
    Tourney getTourney();
    Team getTeam();
    long getRightAnswer();

    void setTourney(Tourney tourney);
    void setTeam(Team team);
    void setRightAnswer(long rightAnswer);
}
