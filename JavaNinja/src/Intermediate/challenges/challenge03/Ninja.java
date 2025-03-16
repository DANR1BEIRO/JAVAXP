package Intermediate.challenges.challenge03;

public class Ninja {
    private int age;
    private String name,
                   village,
                   mission,
                   missionRank,
                   missionStatus;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public String getMission() {
        return mission;
    }

    public void setMission(String mission) {
        this.mission = mission;
    }

    public String getMissionRank() {
        return missionRank;
    }

    public void setMissionRank(String missionRank) {
        this.missionRank = missionRank;
    }

    public String getMissionStatus() {
        return missionStatus;
    }

    public void setMissionStatus(String missionStatus) {
        this.missionStatus = missionStatus;
    }

    public void displaysInfo(){
        System.out.println("Ninja: " +name+ "\nAge: " +age+ "\nVillage: " +village+ "\nCurrent mission: " +mission+
                "\nMission rank: " +missionRank+ "\nMission status: " +missionStatus);
    }
}
