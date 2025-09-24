import java.util.Scanner;
public class Aula7Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--Sistema para identificar o dia do rodizio--:");
        System.out.print("Digite a placa do carro de quatro digitos (número final): ");
        int placa = scanner.nextInt();
        int diaRodizio;

        switch (placa % 10) {
            case 1, 2:
                diaRodizio = 1; // Segunda-feira
                break;
            case 3, 4:
                diaRodizio = 2; // Terça-feira
                break;
            case 5, 6:
                diaRodizio = 3; // Quarta-feira
                break;
            case 7, 8:
                diaRodizio = 4; // Quinta-feira
                break;
            case 9, 0:
                diaRodizio = 5; // Sexta-feira
                break;
            default:
                System.out.println("Número de placa inválido.");
                scanner.close();
                return;
        }

        
        String[] diasSemana = {"Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira"};
        System.out.println("O dia do rodízio é: " + diasSemana[diaRodizio - 1]);
        scanner.close();
        
    }

}
