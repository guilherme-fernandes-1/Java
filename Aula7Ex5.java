import java.util.Scanner;

public class Aula7Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selecione a região de destino:");
        System.out.println("1 - Região Norte");
        System.out.println("2 - Região Nordeste");
        System.out.println("3 - Região Centro-Oeste");
        System.out.println("4 - Região Sul");
        System.out.print("Digite o número da opção desejada: ");
        int destino = scanner.nextInt();
        
        System.out.print("A viagem inclui retorno? (sim/nao): ");
        String tipoViagem = scanner.next();
        
        double preco = 0.0;
        String nomeDestino = "";

        switch (destino) {
            case 1:
                nomeDestino = "Região Norte";
                if (tipoViagem.equalsIgnoreCase("sim")) {
                    preco = 900.00;
                } else {
                    preco = 500.00;
                }
                break;
            case 2:
                nomeDestino = "Região Nordeste";
                if (tipoViagem.equalsIgnoreCase("sim")) {
                    preco = 650.00;
                } else {
                    preco = 350.00;
                }
                break;
            case 3:
                nomeDestino = "Região Centro-Oeste";
                if (tipoViagem.equalsIgnoreCase("sim")) {
                    preco = 600.00;
                } else {
                    preco = 350.00;
                }
                break;
            case 4:
                nomeDestino = "Região Sul";
                if (tipoViagem.equalsIgnoreCase("sim")) {
                    preco = 550.00;
                } else {
                    preco = 600.00;
                }
                break;
            default:
                System.out.println("Destino inválido.");
                scanner.close();
                return;
        }

        System.out.println("\n--- Resumo da Viagem ---");
        System.out.println("Destino: " + nomeDestino);
        System.out.println("Preço da passagem: R$ " + String.format("%.2f", preco));
        
        scanner.close();
    }
}