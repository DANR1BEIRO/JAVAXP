package Ninja;

class Uchiha extends Ninja{

    String sharingan = "Sharingan!";

    public Uchiha(String name, int age) {
        super(name, age);
    }

    public void useSharingan(){
        System.out.println(getName() + " used " + sharingan);
    }
}