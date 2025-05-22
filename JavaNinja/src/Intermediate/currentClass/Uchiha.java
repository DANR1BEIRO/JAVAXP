package Intermediate.currentClass;

public class Uchiha extends Ninja implements Sharingan {

    public Uchiha() {
    }

    public Uchiha(String name, int age, String village) {
        super(name, age, village);
    }

    public Uchiha(String name, int age, String village, RankNinja rank, int missionCompleted) {
        super(name, age, village, rank, missionCompleted);
    }

    @Override
    public void specialAbility() {
        System.out.println("I'm " + name + " and this is my fire uchiha attack!");
    }

    /**
     * Method:
     * This method is implemented from the interface Sharingan
     */
    public void sharinganActivated() {
        System.out.println(name + " ativated the sharingan!");
    }
}

