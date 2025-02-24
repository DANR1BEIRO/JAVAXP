public class Uzimaki extends Ninja {

    public void startRasengan() {
        System.out.println("Starting Rasengan");
    }

    //@Override annotation indicates that a method is intended to override a method declared in a superclass.
    @Override 
    public void basicAttack(){
        System.out.println("Throw a wind kunai");
    }

}
