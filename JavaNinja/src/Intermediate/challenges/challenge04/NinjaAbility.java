package Intermediate.challenges.challenge04;

public enum NinjaAbility {
    CHIDORI("Lightening technique"),
    KAGE_BUNSHIN("Creates clones with real power"),
    SHURIKENJUTSU("Ability to throw shurikens"),
    SHADOW_POSSESSION("Controls the enemy with shadow");

    String description;

    NinjaAbility(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
