package Ninja;

class Uchiha extends Ninja implements Jutsu{

    String sharingan = "Sharingan!";

    public Uchiha(String name, int age) {
        super(name, age);
    }

    public void useSharingan(){
        System.out.println(getName() + " used " + sharingan);
    }

    @Override
    public void kunai(){
        System.out.println("Threw a fire kunai");
    }

    public void genericKunai(){
        super.kunai();
    }

    @Override
    public void taijutsu(){
        System.out.println(getName() + " punched");
    }

    @Override
    public void genjutsu() {
    }
}