import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {

        // classe scanner para inserir os dados na aplicacão.
        Scanner scanner = new Scanner(System.in);

        contaCliente contaCliente = new contaCliente();

        // pedindo informacoes paraentrada o usuario.
        System.out.println("Olá por favor, Dígite o número de sua agência!.");
        contaCliente.numero = scanner.nextInt();
        System.out.println("Dígite o numero de sua agencia!");
        contaCliente.agencia = scanner.next();
        System.out.println("Dígite seu Nome!");
        contaCliente.nomeCliente = scanner.next();
        System.out.println("Dígite o valor inicial que pretende depositar");
        contaCliente.saldo = scanner.nextDouble();

        // exibicao de menssagem final para o1 usuario.
        System.out.println("olá, sr.a. " + contaCliente.nomeCliente
                + " obrigado por criar uma conta em nosso banco, sua agencia é " + contaCliente.agencia + ", conta "
                + contaCliente.numero + " seu saldo " + contaCliente.saldo + " já está disponivel para saque");

    }
}
