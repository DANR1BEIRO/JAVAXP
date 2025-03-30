package Intermediate.challenges.challenge04;

public class Main {
    public static void main(String[] args) {

        Genin shikamaru = new Genin("Shikamaru Nara", 15, "Kage Mane no Jutsu", NinjaAbility.SHADOW_POSSESSION);
        shikamaru.displayInfo();
        shikamaru.useSkill();

        Genin sasuke = new Genin("Sasuke Uchiha", 15, "Katon: Gokakyu no Jutsu", NinjaAbility.SHURIKENJUTSU);
        sasuke.displayInfo();
        sasuke.useSkill();

        Jonin kakashi = new Jonin("Kakashi Hatake", 25, "Copy Technique", NinjaAbility.CHIDORI);
        kakashi.specialty = "Sharingan Mastery";
        kakashi.displayInfo();
        kakashi.useSkill();
    }
}
