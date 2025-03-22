package Ninja;

public class Main {
    public static void main(String[] args) {

        Uchiha sasuke = new Uchiha("Sasuke Uchiha", 17);
        sasuke.showInfo();
        sasuke.useSharingan();
        System.out.println("");

        Uchiha itachi = new Uchiha("Itachi Uchiha", 20);
        itachi.showInfo();
        itachi.useSharingan();
        System.out.println("");

        Hyuuga neji = new Hyuuga("Neji Hyuuga", 17);
        neji.showInfo();
        neji.useByakugan();
    }
}
