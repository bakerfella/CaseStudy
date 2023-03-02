public class Sumos {
    private String nome;
    private double valor;
    private int stock;

    public Sumos(String nome, double valor, int stock) {
        this.nome = nome;
        this.valor = valor;
        this.stock = stock;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    public static void defaultValues() {
        Sumos cocacola = new Sumos ("Coca-cola", 0.7, 5);
        Sumos pepsi = new Sumos ("Pepsi", 0.65, 6);
        Sumos icetea = new Sumos ("Ice tea", 0.6, 4);
    }

}
