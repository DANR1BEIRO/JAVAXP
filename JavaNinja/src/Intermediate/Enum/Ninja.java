package Intermediate.Enum;

public class Ninja {
    private String name;
    private RankNinja rankNinja;
    private RankMission rankMission;

    public Ninja(String name, RankNinja rankNinja, RankMission rankMission) {
        this.name = name;
        this.rankNinja = rankNinja;
        this.rankMission = rankMission;
    }

    public Ninja(String name, RankNinja rankNinja) {
        this.name = name;
        this.rankNinja = rankNinja;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RankNinja getRankNinja() {
        return rankNinja;
    }

    public static void main(String[] args) {
        Ninja naruto = new Ninja("Naruto", RankNinja.GENIN, RankMission.D);
        Ninja iruka = new Ninja("Iruka", RankNinja.CHUNIN, RankMission.C);
        Ninja kakashi = new Ninja("Kakashi", RankNinja.JONIN, RankMission.B);
        Ninja itachi = new Ninja("Itachi", RankNinja.ANBU, RankMission.A);
        Ninja minato = new Ninja("Minato", RankNinja.KAGE, RankMission.S);

        Ninja[] ninjas = {naruto, iruka, kakashi, itachi, minato};

        for (Ninja ninja : ninjas) {
            System.out.println("Name: " + ninja.name);
            System.out.println("Rank: " + ninja.rankNinja + "\n" + ninja.rankNinja.getDescription());
            System.out.println("Mission rank: " + ninja.rankMission + "\nMission description: " + ninja.rankMission.getDescription());
            System.out.println("===============++++++++++++=====================");
        }
    }
}
