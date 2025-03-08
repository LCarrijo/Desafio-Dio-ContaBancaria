import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definir o locale para o Brasil
        scanner.useLocale(Locale.forLanguageTag("pt-BR"));

        //solicitar e armazenar agência
        System.out.print("Digite a agência da conta:");
        String agencia = scanner.next();

        //solicitar e armazenar conta
        System.out.print("Por favor, digite o número da conta: ");
        int numeroConta = scanner.nextInt();

        // Consumir a quebra de linha restante do buffer
        scanner.nextLine();

        //solicitar e armazenar nome do titular
        System.out.print("Digite o nome do titular da conta:");
        String nomeTitular = scanner.nextLine();

        //solicitar e armazenar saldo
        System.out.print("Digite o saldo da conta:");
        Double saldo = scanner.nextDouble();


        //exibir mensagem personalizada ao usuário
        String mensagem = "Olá " + nomeTitular +
                ", obrigado por abrir sua conta conosco. Sua agência é: " + agencia +
                " e o número da sua conta é: " + numeroConta +
                ". Seu saldo atual é de: " + saldo +
                " já está disponível para saque.";
        System.out.println(mensagem);
        scanner.close();
    }
}