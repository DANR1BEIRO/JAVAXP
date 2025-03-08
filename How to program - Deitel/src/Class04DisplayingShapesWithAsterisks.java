public class Class04DisplayingShapesWithAsterisks {
    public static void main(String[] args) {
        drawBox();
        drawElipse();
        drawArrow();
        drawDiamond();
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
        System.out.println("\nELIPSE: ");

        System.out.println("    *   *  ");
        System.out.println(" *         * ");
        System.out.println("*           *");
        System.out.println("*           *");
        System.out.println(" *         * ");
        System.out.println("    *   *  ");
    }

    // arrow
    public static void drawArrow() {
        System.out.println("\nARROW: ");
        System.out.println("   *");
        System.out.println("  ***");
        System.out.println(" *****");
        System.out.println("   *");
        System.out.println("   *");
        System.out.println("   *");
        System.out.println("   *");
        System.out.println("   *");

    }

    // Diamond
    public static void drawDiamond() {
        System.out.println("\nDIAMOND: ");
        System.out.println("      *");
        System.out.println("    *   *");
        System.out.println("   *     *");
        System.out.println("  *       *");
        System.out.println(" *         *");
        System.out.println("  *       *");
        System.out.println("   *     *");
        System.out.println("    *   *");
        System.out.println("      *");

    }
}
