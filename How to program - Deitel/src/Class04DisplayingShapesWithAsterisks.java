public class Class04DisplayingShapesWithAsterisks {
    public static void main(String[] args) {
        drawBox();
        drawElipse();
    }

    // drawns a box
    public static void drawBox() {
        System.out.println("BOX: ");
        for (int i = 0; i < 5; i ++){
            if (i == 0 || i  == 4) {
                System.out.println("************");
            } else {
                System.out.println("*          *");
            }
        }
    }

    // draws a elipse
    public static void drawElipse() {
        System.out.println("ELIPSE: ");

        System.out.println("    *   *  ");
        System.out.println(" *         * ");
        System.out.println("*           *");
        System.out.println("*           *");
        System.out.println(" *         * ");
        System.out.println("    *   *  ");
    }
}
