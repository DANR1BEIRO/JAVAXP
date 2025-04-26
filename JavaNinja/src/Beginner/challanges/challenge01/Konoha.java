package Beginner.challanges.challenge01;

public class Konoha {
    public static void main(String[] args) {

        Ninja naruto = new Ninja("Naruto Uzumaki", 13);
        naruto.setMission("Remove the paint from the Hokage Monument");
        naruto.setMissionRank('D');
        naruto.setMissionAccomplished(false);

        Ninja kakashi = new Ninja("Kakashi Hatake", 25);
        kakashi.setMission("Infiltrate enemy base and gather intel. Eliminate key targets if needed.");
        kakashi.setMissionRank('A');
        kakashi.setMissionAccomplished(true);

        Ninja jiraiya = new Ninja("Jiraiya", 50);
        jiraiya.setMission("Protect the village from an incoming large-scale invasion," +
                " ensuring that no enemy forces breach the gates");
        jiraiya.setMissionRank('S');
        jiraiya.setMissionAccomplished(true);

        System.out.println("Ninja: " + naruto.getName() + "\nCurrent mission: " + naruto.getMission() +
                "\nMission rank: " + naruto.getMissionRank());

        if (naruto.isMissionAccomplished() == true) {
            System.out.println("Mission status: Accomplished!");
        } else {
            System.out.println("Mission status: Not accomplished.");
        }

        System.out.println("\nNinja: " + kakashi.getName() + "\nCurrent mission: " + kakashi.getMission() +
                "\nMission rank: " + kakashi.getMissionRank());

        if (kakashi.isMissionAccomplished() == true) {
            System.out.println("Mission status: Accomplished!");
        } else {
            System.out.println("Mission status: Not accomplished.");
        }

        System.out.println("\nNinja: " + jiraiya.getName() + "\nCurrent mission: " + jiraiya.getMission() +
                "\nMission rank: " + jiraiya.getMissionRank());

        if (jiraiya.isMissionAccomplished() == true) {
            System.out.println("Mission status: Accomplished!");
        } else {
            System.out.println("Mission status: Not accomplished.");
        }
    }
}
