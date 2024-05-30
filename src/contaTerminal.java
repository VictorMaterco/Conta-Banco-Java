import java.util.Locale;
import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o seu nome completo, sem espaços!");
        String nomeCompleto = scanner.next();
        
        System.out.println("Por favor, digite o número da sua Agência!");
        String numeroAgencia = scanner.next();


        System.out.println("Por favor, digite o número da sua Conta!");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite o valor que queria depositar na sua conta!");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCompleto + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo é de R$:" + saldo + " Já disponível para saque!");

    }
}
