package Intermediate.currentClass;

public class Main {
    public static void main(String[] args) {

        Uzumaki naruto = new Uzumaki("Naruto Uzumaki", 15, "Hidden Leaf", RankNinja.GENIN, 5);
        naruto.info();
        naruto.specialAbility();
        naruto.ninjaBattleStrategy();

        Uchiha itachi = new Uchiha("Itachi Uchiha", 27, "Hidden Leaf", RankNinja.JONIN, 350);
        itachi.info();
        itachi.specialAbility();
        itachi.sharinganActivated();

        Hatake kakashi = new Hatake("Kakashi Hatake", 35, "Hidden Leaf", RankNinja.JONIN, 500);
        kakashi.info();
        kakashi.specialAbility();
        kakashi.sharinganActivated();
        kakashi.EliteNinja();

        Uchiha madara = new Uchiha("Madara Uchiha", 45, "Hidden Leaf", RankNinja.JONIN, 900);
        madara.info();
        madara.specialAbility();
        madara.ninjaBattleStrategy();

        System.out.println(" ");
        System.out.println("Iterating through the RankNinja enum:");
        for (RankNinja rank : RankNinja.values()) {
            System.out.println(rank + ": " + rank.getDescription());
        }
    }
}
