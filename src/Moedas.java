public class Moedas {
    private double valor;
    private int quantidade;

    public Moedas(double valor, int quantidade) {
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public double getValor() {
        return valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public void addQuantidade(int quant) {
        this.quantidade += quant;
    }
}
