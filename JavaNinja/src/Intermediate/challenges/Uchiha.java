package Intermediate.challenges;

public class Uchiha extends Ninja {

    public Uchiha(String name, String village, int age) {
        super(name, village, age);
    }

    @Override
    public void specialAbility() {
        System.out.println("My name is: " + name + " and this is my fire uchiha attack!");
    }
}
