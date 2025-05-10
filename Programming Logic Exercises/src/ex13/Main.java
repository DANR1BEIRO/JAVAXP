package ex13;

enum AgeGroup {
    ADULT("you're an adult"),
    MINOR("you're a minor");

    private String description;

    AgeGroup(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}

class Person {
    private String name;
    private int age;
    private AgeGroup ageGroup;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public AgeGroup ageGroup() {
        return (this.age >= 18) ? AgeGroup.ADULT : AgeGroup.MINOR;
    }

    public void display() {
        System.out.println("============================================");
        System.out.println(name + ", based on your age " + this.age + ", " + ageGroup().getDescription() + ".");

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public AgeGroup getAgeGroup() {
        return ageGroup;
    }
}

public class Main {
    public static void main(String[] args) {

        Person[] persons = {
                new Person("Goku", 20),
                new Person("Goten", 13),
        };

        for (Person person : persons) {
            person.display();
        }
    }
}
