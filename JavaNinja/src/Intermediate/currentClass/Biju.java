package Intermediate.currentClass;

public enum Biju {
    SHUKAKU("Shukaku", "Gaara", 1),
    MATATABI("Matatabi", "Yugito Nii", 2),
    ISOBU("Isobu", "Yagura", 3),
    SON_GOKU("Son Goku", "Roshi", 4),
    KOKUO("Kokuo", "Han", 5),
    SAIKEN("Saiken", "Utakata", 6),
    CHOMEI("Chomei", "Fuu", 7),
    GYUKI("Gyuki", "Killer Bee", 8),
    KURAMA("Kurama", "Naruto Uzumaki", 9);

    String nameBiju;
    String jinchuriki;
    int numberOfTails;

    Biju() {
    }

    Biju(String nameBiju, String jinchuriki, int numberOfTails) {
        this.nameBiju = nameBiju;
        this.jinchuriki = jinchuriki;
        this.numberOfTails = numberOfTails;
    }
}
