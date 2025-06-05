package Intermediate.Generics;

import java.util.ArrayList;
import java.util.List;

public class BolsaEquipamentos<T> {
    private List<T> equipamentos;

    public BolsaEquipamentos() {
        this.equipamentos = new ArrayList<>();
    }

    public void adicionarEquipamentos(T item) {
        this.equipamentos.add(item);
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder("Equipamentos na bolsa toString:\n");
        equipamentos.forEach(equipamento -> string.append("- ").append(equipamento).append("\n"));
        return string.toString();
    }

    public void displayItems() {
        System.out.println("Lista de equipamentos:");
        for (T equipamento : equipamentos) {
            System.out.println("- " + equipamento);

        }
    }

    public List<T> getEquipamentos() {
        return equipamentos;
    }

    public void setEquipamentos(List<T> equipamentos) {

        this.equipamentos = equipamentos;
    }
}
