package Intermediate.challenges.challenge03;

public class Uchiha extends Ninja {
    String specialSkill;

    public Uchiha() {
        this.specialSkill = "Sharingan";
    }

    public void displaySpecialSkill(){
        System.out.println("My special skill is: " + specialSkill);
    }

    @Override
    public void displaysInfo() {
        super.displaysInfo();



    }
}
