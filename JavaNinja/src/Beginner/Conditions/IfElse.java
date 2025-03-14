package Beginner.Conditions;

public class IfElse {
    public static void main(String[] args) {

        String name = "Naruto Uzumaki";
        int age = 16;
        boolean isHokage = false;
        short completedMissions = 19;

        // if (condition is true) {do this}
        if (completedMissions > 10 && age > 15) {
            System.out.println(name + " is eligible for the Chunin exams based\non the number" +
                    " of missions he has completed!");
        } else {
            System.out.println(name + " isn't eligible to rank up from Genin to Chunin\n" +
                    " because he hasn't completed the minimum number of missions");
        }

    }
}
