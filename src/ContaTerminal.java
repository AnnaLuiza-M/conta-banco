import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando e lendo os dados da conta
        System.out.println("Por favor, digite o número da sua conta:");
        int numeroConta = scanner.nextInt();
        
        System.out.println("Por favor, digite o número da sua agência:");
        scanner.nextLine();  // Consumir a nova linha deixada por nextInt()
        String agencia = scanner.nextLine();
        
        System.out.println("Por favor, digite o seu nome:");
        String nome = scanner.nextLine();
        
        System.out.println("Por favor, digite o seu saldo:");
        double saldo = scanner.nextDouble();
        
        // Exibindo a mensagem final com os dados fornecidos
        System.out.println("Olá " + nome + ", obrigadoo por criar uma conta em nosso banco. Sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");

        // Fechando o scanner
        scanner.close();
    }
}