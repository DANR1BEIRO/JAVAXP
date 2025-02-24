public class Main {
    public static void main(String[] args) throws Exception {
        
        Uzimaki naruto = new Uzimaki();
        naruto.setName("Naruto Uzimaki");
        naruto.setVillage("Hidden Leaf");
        naruto.setAge(13);
        System.out.print("My name is " + naruto.getName() + "\nI'm from " + naruto.getVillage() + "\n");
        naruto.startRasengan();
        naruto.basicAttack();

        Uchiha sasuke = new Uchiha();
        sasuke.setName("Sasuke Uchiha");
        sasuke.setVillage("Hidden Leaf");
        sasuke.setAge(13);
        System.out.println("\nMy name is " + sasuke.getName() + "\nI'm from " + sasuke.getVillage());
        sasuke.sharinganActivated();
        sasuke.basicAttack();
        sasuke.basicAttack("Chidori!");;
        
        Hatake kakashi = new Hatake();
        kakashi.setName("Kakashi Hatake");
        kakashi.setVillage("Hidden Leaf");
        kakashi.setAge(26);
        System.out.println("\nMy name is " + kakashi.getName() + "\nI'm from " + kakashi.getVillage());
        kakashi.sharinganActivated();
    }

    
}
