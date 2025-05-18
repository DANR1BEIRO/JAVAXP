package ex18;

public class Main {
    public static void main(String[] args) {
        double franciscoHeight = 150;
        double saraHeight = 110;

        int years = 0;

        while(saraHeight <= franciscoHeight) {
            years ++;
            saraHeight += 3;
            franciscoHeight += 2;
        }
        System.out.println("It will take " + years + " years for Sara to become taller than Francisco");
    }
}
