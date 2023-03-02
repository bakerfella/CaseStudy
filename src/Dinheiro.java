public class Dinheiro {
    Moedas cinco;
     Moedas dez;
     Moedas vinte;
     Moedas cinquenta;

    public Dinheiro(int cincoQuantidade, int dezQuantidade, int vinteQuantidade, int cinquentaQuantidade) {
        this.cinco = new Moedas (0.05, cincoQuantidade);
        this.dez = new Moedas(0.1, dezQuantidade);
        this.vinte = new Moedas (0.2, vinteQuantidade);
        this.cinquenta = new Moedas (0.5, cinquentaQuantidade);
    }

    public int cincoQuantidade() {
        return cinco.getQuantidade();
    }

    public int dezQuantidade() {
        return dez.getQuantidade();
    }

    public int vinteQuantidade() {
        return vinte.getQuantidade();
    }

    public int cinquentaQuantidade() {
        return cinquenta.getQuantidade();
    }
}
