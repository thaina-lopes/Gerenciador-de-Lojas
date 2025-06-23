public class Produto {
    //atributos
    private String nome;
    private double preco;
    private Data dataValidade;

    //construtor
    public Produto(String nome, double preco, Data dataValidade) {
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
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

    public Data getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Data dataValidade) {
        this.dataValidade = dataValidade;
    }

    //toString
    @Override
    public String toString() {
        return "Produto {nome = " + nome + ", preco = " + preco + ", dataValidade = " + dataValidade + "}";
    }

    //método estaVencido
    public boolean estaVencido(Data dataAtual) {
        if (dataValidade.getAno() < dataAtual.getAno()) {
            return true;
        } else if (dataValidade.getAno() == dataAtual.getAno()) {
            if (dataValidade.getMes() < dataAtual.getMes()) {
                return true;
            } else if (dataValidade.getMes() == dataAtual.getMes()) {
                if (dataValidade.getDia() < dataAtual.getDia()) {
                    return true;
                }
            }
        } 
        return false;
    }

}
