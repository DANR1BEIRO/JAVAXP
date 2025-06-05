package Intermediate.Generics;

public class Main {
    public static void main(String[] args) {

        BolsaEquipamentos<Object> bolsaEquipamentos = new BolsaEquipamentos<>();
        bolsaEquipamentos.adicionarEquipamentos(new Kunai("Kunai de fogo"));
        bolsaEquipamentos.adicionarEquipamentos(new Shuriken("Shuriken de ferro"));
        bolsaEquipamentos.adicionarEquipamentos(new Pergaminho("Pergaminho de invocacao do sapo"));

        bolsaEquipamentos.displayItems();
        System.out.println("-----------------------------");
        System.out.println(bolsaEquipamentos.toString());
    }
}
