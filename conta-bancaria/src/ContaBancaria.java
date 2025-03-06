import java.util.Scanner;
import java.util.Locale;


public class ContaBancaria {
    public static void main (String [] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Informe o número da agência: ");
        int numero = scanner.nextInt();
        System.out.println("Digite a agência: ");
        String agencia = scanner.next();
        System.out.println("Digite o seu nome completo: ");
        String nome = scanner.next();

        scanner.nextLine();
        
        System.out.println("Insira o saldo da conta: ");
        double saldo = scanner.nextDouble();

        scanner.close();

        
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " conta " + numero + " e seu saldo: " + saldo + " já está disponível para saque");

    }
}