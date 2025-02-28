public class Uchiha extends Ninja implements Sharingan {

    public void sharinganActivated() {

        System.out.println("Sharingan activated!");
    }

    //@Override annotation indicates that a method is intended to override a method declared in a superclass.
    @Override
    public void basicAttack(){

        System.out.println("Throw a fire kunai");
    }

    public void basicAttack(String newAttack){

        System.out.println("Powering up " + newAttack);
    }
}




