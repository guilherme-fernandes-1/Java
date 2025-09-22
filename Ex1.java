import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) {
        // Criação de um objeto Scanner para ler a entrada do usuário
        Scanner input = new Scanner(System.in);

        // Declaração de variáveis
        String nomeAluno;
        double nota1, nota2, nota3, media;

        // 1. Entrada de dados
        System.out.println("--- Sistema de Notas de Alunos ---");
        System.out.print("Digite o nome do aluno: ");
        nomeAluno = input.nextLine();

        System.out.print("Digite a primeira nota: ");
        nota1 = input.nextDouble();

        System.out.print("Digite a segunda nota: ");
        nota2 = input.nextDouble();

        System.out.print("Digite a terceira nota: ");
        nota3 = input.nextDouble();

        // 2. Processamento: cálculo da média
        media = (nota1 + nota2 + nota3) / 3;

        // 3. Saída de dados e lógica condicional
        System.out.println("\n--- Resultado ---");
        System.out.println("Aluno: " + nomeAluno);
        System.out.printf("Média: %.2f%n", media);

        if (media >= 7.0) {
            System.out.println("Situação: Aprovado!");
        } else if (media >= 5.0) {
            System.out.println("Situação: Em Recuperação.");
        } else {
            System.out.println("Situação: Reprovado.");
        }

        // Fechamento do objeto Scanner para evitar vazamento de recursos
        input.close();
    } // Chave de fechamento do método main
} // Chave de fechamento da classe Ex1