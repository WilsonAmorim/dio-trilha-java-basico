import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numero;
        String agencia;
        String cliente;
        Double saldo;

        String texto1 = "";
        String texto2 = "";
        String texto3 = "";
        String texto4 = " ";

        Scanner in = new Scanner(System.in);

        System.out.println("Por favor, Digite o número do Banco ? ");
        numero = in.nextInt();

        System.out.println("Por favor, Digite o número da Agência ? ");
        agencia = in.next();

        System.out.println("Por favor, Digite o Nome do Cliente? ");
        cliente = in.next();

        System.out.println("Por favor, Digite o Saldo? ");
        saldo = in.nextDouble();
        in.close();

        texto1 = "Olá " + cliente;
        texto2 = ", obrigado por criar uma conta em nosso banco, sua agência é: " + agencia;
        texto3 = ", conta " + numero;
        texto4 = " e seu saldo " + saldo + " já está disponível para saque";

        System.out.println(texto1.concat(texto2).concat(texto3).concat(texto4));

    }
}
