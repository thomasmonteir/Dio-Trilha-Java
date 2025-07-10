import java.util.Scanner;

public class contaTerminal {

    public static void main(String[] args) throws Exception {

        var scanner = new Scanner(System.in);

        System.out.println("\nPor favor, digite o número da Agência: ");
        var numero = scanner.nextInt();

        System.out.println("\nPor favor, digite sua conta com o digito após o ''-''' : ");
        var agencia = scanner.next();

        System.out.println("\nPor favor, digite o seu primeiro nome: ");
        var nome = scanner.next();

        System.out.println("\nPor favor, digite o seu sobrenome: ");
        var sobrenome = scanner.next();

        var nomec = nome.concat(" " +sobrenome);

        System.out.println("\nPor favor, digite o saldo da sua conta: ");
        var saldo  = scanner.nextFloat();

        System.out.printf("Olá %s ,obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.",nomec,agencia,numero,saldo);

    }
    
}
