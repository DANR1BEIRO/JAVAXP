package Intermediate.constructor;

public class Main {
    public static void main(String[] args) {

        Uzumaki naruto = new Uzumaki("Naruto Uzumaki", "Hidden Leaf", 16);
        naruto.info();
        naruto.specialAbility();
        naruto.ninjaBattleStrategy();

        Uchiha sasuke = new Uchiha("Sasuke Uchiha", "Hidden Leaf", 17);
        sasuke.info();
        sasuke.specialAbility();
        sasuke.ninjaBattleStrategy();

        Uchiha itachi = new Uchiha("Itachi Uchiha", "Hidden Leaf", 27);
        itachi.info();
        itachi.specialAbility();
    }
}
