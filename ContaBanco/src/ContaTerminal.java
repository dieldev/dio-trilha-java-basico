import java.util.Scanner;

import Model.DadosConta;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        DadosConta conta = new DadosConta();
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência:");
        int verificaNumero = sc.nextInt();

        if (verificaNumero == 1021) {
            System.out.println(conta.toString());
        } else {
            System.out.println("A conta bancária não foi encontrada!");
        }

        sc.close();
    }
}
