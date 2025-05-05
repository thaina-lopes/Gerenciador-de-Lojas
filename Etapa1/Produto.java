public class Produto {
    //atributos
    private String nome;
    private double preco;

    //construtor
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    //Get e set (métodos de acesso)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    //toString
    @Override
    public String toString() {
        return "Produto {nome = " + nome + ", preco = " + preco + "}";
    }

}
