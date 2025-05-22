package Intermediate.List;

import java.util.ArrayList;
import java.util.List;

public class NarutoList {
    public static void main(String[] args) {

        /**
         * ARRAY:
         * Tamanho fixo: O tamanho é definido na criação e não pode ser alterado
         * Armazena tipos primitivos ou objetos(e.g: int[], String[], etc).
         * Acesso rápido por índices
         * Sem métodos utilitários: não possui métodos como: `add`, `remove`, etc.
         * Mais eficiente em uso de memória para grandes quantidades de dados simples.
         * Ideal para: Estruturas de dados fixas, como matrizes e vetores.
         */

        // Array de tamanho fixo
        String[] team7 = new String[3];

        team7[0] = "Naruto";
        team7[1] = "Sasuke";
        team7[2] = "Sakura";

        // Acesso por índice
        System.out.println("Primeiro membro: " + team7[0]);

        // Percorrendo o Array
        for (String ninja : team7) {
            System.out.println("Ninja - " + ninja);
        }

        /**
         * LIST:
         * Tamanho dinâmico: Pode crescer ou diminuir conforme necessário.
         * Só armazena objetos: Não pode armazenar tipos primitivos diretamente(usa wrappers como Integer, Double, etc).
         * Possui métodos utilitários, como: add(), remove(), contains(), size(), etc.
         * Mais flexível: Ideal para coleções que mudam de tamanho ou precisam de manipulação frequente.
         */

        // Lista dinâmica (não é necessário definir o tamanho da lista)
        List<String> Sennin = new ArrayList<>();

        Sennin.addFirst("Orochimaru");
        Sennin.add("Tsunade");
        Sennin.addLast("Jiraya");

        // Acesso por índice
        System.out.println("Primeiro membro: " + Sennin.get(0));

        // Percorrendo a lista
        for (String ninja : Sennin) {
            System.out.println(ninja);
        }
    }
}
