package Intermediate.Enum;

public enum RankNinja {
    GENIN("Lowest official ninja rank; beginner ninja."),
    CHUNIN("intermediate ninja; can lead teams and missions"),
    JONIN("Elite and highly skilled ninja."),
    ANBU("Elite ninja in covert operations"),
    KAGE("Leader of the ninja village.");

    private String description;

    RankNinja(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
