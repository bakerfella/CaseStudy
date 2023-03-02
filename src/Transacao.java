public class Transacao {
    static void addTransacao(int bebida, double dinheiro, Dinheiro dinheiroMaquina) {
        double preco = 0;

        switch (bebida) {
            case 1:
                preco = 0.7;
                break;
            case 2:
                preco = 0.65;
                break;
            case 3:
                preco = 0.60;
                break;
            case 0:
                preco = 0;
                break;
        }
        double troco = dinheiro - preco;
        double trocoFinal = troco;

        int contador50 = 0;
        int contador20 = 0;
        int contador10 = 0;
        int contador5 = 0;
        int limite = 999;

        for (int i = 0; i < limite; i++) {
            if (troco >= 50 && dinheiroMaquina.cinquentaQuantidade() > 0) {
                troco = -0.50;
                contador50++;
            }
            if (troco >= 20 && dinheiroMaquina.vinteQuantidade() > 0) {
                troco = -0.20;
                contador20++;
            }
            if (troco >= 10 && dinheiroMaquina.dezQuantidade() > 0) {
                troco = -0.10;
                contador10++;
            }
            if (troco >= 0.05 && dinheiroMaquina.cincoQuantidade() > 0) {
                troco = -0.05;
                contador5++;
            }
            if (troco == 0 || (dinheiroMaquina.cincoQuantidade() == 0 && dinheiroMaquina.dezQuantidade() == 0
                    && dinheiroMaquina.vinteQuantidade() == 0 && dinheiroMaquina.cinquentaQuantidade() == 0))
                limite = 0;
        }

        if (troco != 0) {
            System.out.println("Impossivel finalizar a operação: Troco insuficiente");
        } else {
            System.out.println("Troco a dispensar: ");
            System.out.println();
        }

    }
}