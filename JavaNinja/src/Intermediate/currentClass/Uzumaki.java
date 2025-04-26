package Intermediate.currentClass;

public class Uzumaki extends Ninja {

    public Uzumaki() {
    }

    public Uzumaki(String name, int age, String village) {
        super(name, age, village);
    }

    public Uzumaki(String name, int age, String village, RankNinja rank, int missionCompleted) {
        super(name, age, village, rank, missionCompleted);
    }

    @Override
    public void specialAbility() {
        System.out.println("I'm " + name + " and this is my wind uzumaki attack!");
    }
}

