package Intermediate.currentClass;

public class Uzumaki extends Ninja {

    Biju biju;

    public Uzumaki() {
    }

    public Uzumaki(String name, int age, String village) {
        super(name, age, village);
    }

    public Uzumaki(String name, int age, String village, RankNinja rank, int missionCompleted) {
        super(name, age, village, rank, missionCompleted);
    }

    public Uzumaki(String name, int age, String village, RankNinja rank, int missionCompleted, Biju biju) {
        super(name, age, village, rank, missionCompleted);
        this.biju = biju;
    }

    @Override
    public void ninjaBattleStrategy() {
        super.ninjaBattleStrategy();
    }
}
