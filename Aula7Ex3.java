import java.util.Scanner;

public class Aula7Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o tipo de calculo que deseja fazer (+, -, *, /): ");
        String operacao = scanner.next();
        
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();
        
        double resultado = 0;
        
        switch (operacao) {
            case "+":
                resultado = num1 + num2;
                break;
            case "-":
                resultado = num1 - num2;
                break;
            case "*":
                resultado = num1 * num2;
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                    scanner.close();
                    return; 
                }
                resultado = num1 / num2;
                break;
            default:
                System.out.println("Operação inválida.");
                scanner.close();
                return; 
        }
        
     
        System.out.println("O resultado da operação é: " + resultado);
        
        scanner.close();
    }
}