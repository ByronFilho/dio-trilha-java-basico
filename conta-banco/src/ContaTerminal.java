import java.util.Locale;
import java.util.Scanner;


public class ContaTerminal{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o seu nome");
        String nome = scanner.next();

        System.out.println("Por favor, digite o número da conta");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da agencia");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o saldo");
        double saldo = scanner.nextDouble();

        System.out.println("Olá ".concat(nome).concat(", obrigado por criar uma conta em nosso banco, sua agencia é ").concat(agencia).concat(", conta ").concat(Integer.toString(numero)).concat(" e seu saldo é ").concat(Double.toString(saldo).concat(".")));
        
    }
}
