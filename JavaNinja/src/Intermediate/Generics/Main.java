package Intermediate.Generics;

public class Main {
    public static void main(String[] args) {

        Equipamentos kunai = new Equipamentos("Kunai de ferro");
        Equipamentos shuriken = new Equipamentos("Shuriken de ferro");
        Equipamentos pergaminho = new Equipamentos("Pergaminho de invocação");

        BolsaEquipamentos<Equipamentos> bolsa = new BolsaEquipamentos<>();
        bolsa.adicionarEquipamentos(kunai);
        bolsa.adicionarEquipamentos(shuriken);
        bolsa.adicionarEquipamentos(pergaminho);

        System.out.println(bolsa);
    }
}
