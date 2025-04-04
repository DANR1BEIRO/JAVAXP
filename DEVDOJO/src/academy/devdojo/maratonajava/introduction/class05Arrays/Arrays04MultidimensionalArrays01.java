package academy.devdojo.maratonajava.introduction.class05Arrays;

public class Arrays04MultidimensionalArrays01 {
    public static void main(String[] args) {

        int[][] matrix = new int[3][3];

        //     i  j
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;
        
        matrix[1][0] = 4;
        matrix[1][1] = 5;
        matrix[1][2] = 6;
        
        matrix[2][0] = 7;
        matrix[2][1] = 8;
        matrix[2][2] = 9;

        for (int i = 0; i < matrix.length; i++) { // Loop through rows(i)
            for (int j = 0; j < matrix[i].length; j++) { // Loop through columns(j)
                System.out.println("[" + i + "][" + j + "] = " + matrix[i][j]);
            }
            System.out.println();
        }
    }
}
