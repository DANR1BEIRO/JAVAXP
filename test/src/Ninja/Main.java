package Ninja;

public class Main {
    public static void main(String[] args) {

        Uchiha sasuke = new Uchiha("Sasuke Uchiha", 17);
        sasuke.useSharingan();
        Uchiha itachi = new Uchiha("Itachi Uchiha", 20);
        itachi.useSharingan();

        Hyuuga neji = new Hyuuga("Neji Hyuuga", 17);
        neji.useByakugan();
    }
}
