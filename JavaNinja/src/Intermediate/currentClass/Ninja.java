package Intermediate.currentClass;

public abstract class Ninja implements Strategy {

    //TODO: add two new attributes:  missionsCompleted, rank
    //TODO: rank: Genin, Chunin, Jonin, Kage

    String name;
    int age;
    String village;
    RankNinja rank;
    int missionCompleted;

    public Ninja() {
    }

    public Ninja(String name, int age, String village) {
        this.name = name;
        this.age = age;
        this.village = village;
    }

    //TODO: Overload constructor
    public Ninja(String name, int age, String village, RankNinja rank, int missionCompleted) {
        this(name, age, village);
        this.rank = rank;
        this.missionCompleted = missionCompleted;
    }

    public void info() {
        System.out.println("\nName: " + name);
        System.out.println("Age: " + age);
        System.out.println("Village: " + village);
        System.out.println("Rank: " + rank + " - " + rank.getDescription());
        System.out.println("Mission Accomplished: " + missionCompleted);
    }

    // generic method
    public void specialAbility() {
        System.out.println("I'm " + name + " and this is my special attack!");
    }

    @Override
    public void ninjaBattleStrategy() {
        System.out.println("This is my battle strategy");
    }


    public String toString(){
        return "\nName: " + name +
               "\nAge: " + age +
               "\nVillage: " + village +
               "\nRank: " + rank + " - " + rank.getDescription() +
               "\nMission Accomplished: " + missionCompleted;
    }
}

