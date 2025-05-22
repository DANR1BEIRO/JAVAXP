package Intermediate.currentClass;

public class Hatake extends Ninja implements Sharingan, Anbu {

    public Hatake() {
    }

    public Hatake(String name, int age, String village) {
        super(name, age, village);
    }

    public Hatake(String name, int age, String village, RankNinja rank, int missionCompleted) {
        super(name, age, village, rank, missionCompleted);
    }

    /**
     * Method:
     * This method is implemented from the interface Sharingan
     */
    public void sharinganActivated() {
        System.out.println(name + " ativated the sharingan!");
    }

    public void EliteNinja() {
        System.out.println("I'm an Anbu elite ninja");
    }
}
