public class TenGreenBottles {
    public static void main(String[] args) {
        int bottles = 10;
        String x = "bottles";

        while (bottles > 0) {
            if (bottles == 1) {
                x = "bottle";
            }
            System.out.println("\n" + bottles + " green " + x + " hanging on the wall");
            System.out.println(bottles + " green " + x + " hanging on the wall");
            System.out.println("And if one green bottle should accidentally fall");
            bottles--;

            if (bottles > 0) {
                System.out.println("There'll be " + bottles + " green " + x + " hanging on the wall");
            } else {
                System.out.println("There'll be no green bottles hanging on the wall");
            }
        }
    }
}
