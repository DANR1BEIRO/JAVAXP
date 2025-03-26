public class TenGreenBottles {
    public static void main(String[] args) {
        int bottles = 10;
        String word = "bottles";

        while (bottles > 0) {
            if (bottles == 1) {
                word = "bottle";
            }
            System.out.println("\n" + bottles + " green " + word + " hanging on the wall");
            System.out.println(bottles + " green " + word + " hanging on the wall");
            System.out.println("And if one green bottle should accidentally fall");
            bottles--;

            if (bottles > 0) {
                System.out.println("There'll be " + bottles + " green " + word + " hanging on the wall");
            } else {
                System.out.println("There'll be no green bottles hanging on the wall");
            }
        }
    }
}
