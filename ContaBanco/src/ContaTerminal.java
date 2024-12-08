
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
    //TODO: conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    //Mensagem para os usuarios
    // capturar os valores digitados
       // variaveis
       System.out.println("Digite seu Nome:");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome:");
        String sobrenome = scanner.next();

        System.out.println("Digite sua agencia:");
        String agencia = scanner.next();

        System.out.println("Digite sua conta:");
        String conta = scanner.next();

        double saldo = 237.48;

        String nomeInteiro = nome.concat(" ").concat(sobrenome);
        
    //saída, mensagens aos usuarios
    // olá + nomeCliente , obrigado por criar uma conta em nosso banco, sua argencia é +argencia , conta + conta e seu saldo + saldo já esta disponivel para saque.
        
System.out.println("Olá " + nomeInteiro + " , obrigado por criar uma conta em nosso banco, sua argencia é " + agencia +", conta" + conta +" e seu saldo de " + saldo +" já está disponível para saque.");
}
}
