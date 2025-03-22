package Ninja;

public class Ninja {

    private String name;
    private int age;

    public Ninja(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void showInfo(){
        System.out.println("Ninja name: " + name + "\nNinja age: " + age);
    }

    public void kunai(){
        System.out.println(name + " threw a kunai");
    }
}
