package Intermediate.challenges;

public class Ninja {

    String name;
    String village;
    int age;

    public Ninja(String name, String village, int age) {
        this.name = name;
        this.village = village;
        this.age = age;
    }

    public void info() {
        System.out.println("\nName: " + name);
        System.out.println("Age: " + age);
        System.out.println("Village: " + village);
    }

    // generic method
    public void specialAbility() {
        System.out.println("My name is: " + name + " and this is my special attack!");

    }
}

