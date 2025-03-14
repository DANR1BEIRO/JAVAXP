package Beginner.Conditions.challenge01;

public class Ninja {

    private String name;
    private int age;
    private String mission;
    private char missionRank;
    private boolean MissionAccomplished;

    public Ninja(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMission() {
        return mission;
    }

    public void setMission(String mission) {
        this.mission = mission;
    }

    public char getMissionRank() {
        return missionRank;
    }

    public void setMissionRank(char missionRank) {
        this.missionRank = missionRank;
    }

    public boolean isMissionAccomplished() {
        return MissionAccomplished;
    }

    public void setMissionAccomplished(boolean missionAccomplished) {
        MissionAccomplished = missionAccomplished;
    }
}