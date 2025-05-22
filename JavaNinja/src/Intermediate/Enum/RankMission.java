package Intermediate.Enum;

public enum RankMission {
    D("Simple, low-risk tasks usually assign to genin", 1),
    C("Slightly more challenging missions, but still relatively safe.", 4),
    B("Moderately dangerous missions, such as guarding important people.", 7),
    A("High-risk missions. These are usually assigned to experienced Jonin or ANBU", 10),
    S("The most dangerous and critical missions, often involving national security.", 40);
    ;

    private String description;
    private int difficultLevel;

    RankMission(String description, int difficultLevel) {
        this.description = description;
        this.difficultLevel = difficultLevel;
    }

    public String getDescription() {
        return description;
    }

    public int getDifficultLevel() {
        return difficultLevel;
    }
}
