import java.util.Scanner;

public class MediaAlunos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double soma = 0;
        double nota;

        
        for (int i = 1; i <= 6; i++) {
            System.out.print("Digite a nota do aluno " + i + ": ");
            nota = scanner.nextDouble();
            soma += nota;
        }

        double media = soma / 6;

        System.out.println("A média da turma é: " + media);

        scanner.close();
    }
}