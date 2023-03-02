import java.util.Scanner;

public class MaquinaSumos {
    public static void main(String[] args) {
        Dinheiro dinheiroMaquina = new Dinheiro(20, 20, 20, 20);
        Sumos.defaultValues();

        System.out.println("Insira o dinheiro: ");
        System.out.println("\nQuantidade de moedas de 0.05: ");
        int quantidade5 = Leitor.lerInteiro(0, 20);
        System.out.println("\nQuantidade de 0.10: ");
        int quantidade10 = Leitor.lerInteiro(0,20);
        System.out.println("\nQuantidade de 0.20: ");
        int quantidade20 = Leitor.lerInteiro(0,20);
        System.out.println("\nQuantidade de 0.50: ");
        int quantidade50 = Leitor.lerInteiro(0,20);
        dinheiroMaquina.cinco.addQuantidade(quantidade5);
        dinheiroMaquina.dez.addQuantidade(quantidade10);
        dinheiroMaquina.vinte.addQuantidade(quantidade20);
        dinheiroMaquina.cinquenta.addQuantidade(quantidade50);

        Dinheiro dinheiroInserido = new Dinheiro(quantidade5, quantidade10, quantidade20, quantidade50);
        Double quantidadeInserido = quantidade5*0.05 + quantidade10*0.1 + quantidade20*0.2 + quantidade50*0.5;


        System.out.println("\nEscolha o produto: [0-3]");
        System.out.println("\n\t1.Coca-cola 0.7€");
        System.out.println("\n\t2.Pepsi 0.65€");
        System.out.println("\n\t3.Ice Tea 0.60€");
        System.out.println("\n\t0.Cancelar");
        int opcao = Leitor.lerInteiro(0,3);

        Transacao.addTransacao(opcao, quantidadeInserido, dinheiroMaquina);
    }
}
