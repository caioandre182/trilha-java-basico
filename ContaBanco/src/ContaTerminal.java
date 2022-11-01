import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        String agencia;
        int numeroConta;
        String nomeCliente;
        double saldo;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Por favor, digite o número da Conta: ");
        numeroConta = scanner.nextInt();

        System.out.print("Por favor, digite o número da Agência: ");
        agencia = scanner.next();

        System.out.print("Por favor, digite o nome do Cliente: ");
        nomeCliente = scanner.next();

        System.out.print("Por favor, digite o Saldo: ");
        saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " +
                numeroConta + " e seu saldo: " + saldo + " já está disponível para saque.");




    }
}