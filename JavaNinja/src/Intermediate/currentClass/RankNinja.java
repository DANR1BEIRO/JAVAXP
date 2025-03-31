package Intermediate.currentClass;

public enum RankNinja {
    GENIN("Rookie ninjas handling basic missions under a Jonin’s guidance."),
    CHUUNIN("Skilled ninjas capable of leading teams and taking on tougher missions."),
    JONIN("Elite ninjas assigned to high-risk missions and mentoring Genin."),
    KAGE("The village leader, the strongest ninja, responsible for protection and governance.");

    String description;

    RankNinja(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
