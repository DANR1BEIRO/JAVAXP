import java.util.Scanner;

public class CalculadoraDeMedias {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] alunos = {"goku", "vegeta", "piccolo", "gohan"};

        int media = calculaMediaDaTurma(alunos, input);

        System.out.printf("Média da turma %d", media);

    }

    public static int calculaMediaDaTurma(String[] alunos, Scanner scanner) {

        int soma = 0;
        for (String aluno : alunos) {
            System.out.printf("Nota do aluno %s: ", aluno);
            int nota = scanner.nextInt();
            soma += nota;
        }

        return soma / alunos.length;
    }
}
