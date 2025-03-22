package Ninja;

public class Hyuuga extends Ninja{

    String byakugan = "Byakugan!";

    public Hyuuga(String name, int age){
        super(name, age);
    }

    public void useByakugan(){
        System.out.println(getName() + " used " + byakugan);
    }
}
