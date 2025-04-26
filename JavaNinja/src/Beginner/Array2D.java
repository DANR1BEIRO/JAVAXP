package Beginner;

public class Array2D {
    public static void main(String[] args) {

        String[][] villagesAndNinjas = new String[3][4]; // 3 rows and 4 columns

        villagesAndNinjas[0][0] = "Konoha";
        villagesAndNinjas[0][1] = "Naruto";
        villagesAndNinjas[0][2] = "Sasuke";
        villagesAndNinjas[0][3] = "Kakashi";

        villagesAndNinjas[1][0] = "Suna";
        villagesAndNinjas[1][1] = "Gaara";
        villagesAndNinjas[1][2] = "Temari";
        villagesAndNinjas[1][3] = "Kankuro";

        villagesAndNinjas[2][0] = "Kumo";
        villagesAndNinjas[2][1] = "A (Raikage)";
        villagesAndNinjas[2][2] = "Killer Bee";
        villagesAndNinjas[2][3] = "Darui";

        for (int village = 0; village < villagesAndNinjas.length; village++) {
            System.out.println("\nVillage: " + villagesAndNinjas[village][0]);

            for (int ninja = 1; ninja < villagesAndNinjas[village].length; ninja++) {
                System.out.println("- " + villagesAndNinjas[village][ninja]);
            }
        }
    }
}
