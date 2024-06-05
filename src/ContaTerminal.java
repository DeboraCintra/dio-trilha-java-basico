import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //criando o scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite a sua numero da conta: ");
        int numero = scanner.nextInt();

        System.out.println("Digite a sua numero da agencia: ");
        String agencia = scanner.next();

        System.out.println("Digite o nome da conta: ");
        String nomeConta = scanner.next();

        System.out.println("Digite o saldo da conta: ");
        double saldo = scanner.nextDouble();

        //imprimindo as variaveis 
        System.out.println("Olá "+ nomeConta + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + "já está disponível para saque");
    }
    

}