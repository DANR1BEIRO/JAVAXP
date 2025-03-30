package Intermediate.challenges.challenge04;

public class Genin extends NinjaTemplate implements Ninja {

    public Genin(String name, int age, String skill, NinjaAbility ability) {
        super(name, age, skill, ability);
    }

    @Override
    public void displayInfo() {
        System.out.println("");
        System.out.println("Ninja name: " + name);
        System.out.println("Ninja age: " + age);
        System.out.println("Ninja classification: Genin ");
    }

    @Override
    public void useSkill() {
        System.out.println("Ninja skill: " + skill);
        System.out.println("Special ability: " + ability + " - " + ability.getDescription());

    }
}
