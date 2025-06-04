package Intermediate.Generics;

import java.util.ArrayList;
import java.util.List;

public class BolsaEquipamentos<T> {
    private List<T> equipamentos;

    public BolsaEquipamentos() {
        this.equipamentos = new ArrayList<>();
    }

    public void adicionarEquipamentos(T equipamento) {
        this.equipamentos.add(equipamento);
    }

    public List<T> getEquipamentos() {
        return equipamentos;
    }

    public void setEquipamentos(List<T> equipamentos) {
        this.equipamentos = equipamentos;
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder("Equipamentos na bolsa:\n");
        equipamentos.forEach(equipamento -> string.append("- ").append(equipamento).append("\n"));
        return string.toString();
    }
}
