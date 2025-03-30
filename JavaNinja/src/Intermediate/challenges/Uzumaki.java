package Intermediate.challenges;

public class Uzumaki extends Ninja {

    public Uzumaki(String name, String village, int age) {
        super(name, village, age);
    }

    @Override
    public void specialAbility() {
        System.out.println("My name is: " + name + " and this is my wind uzumaki attack!");
    }
}
