public class Informatica extends Loja {

    private double seguroEletronicos;

    public Informatica (String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, double seguroEletronicos, int maxProdutos) {
        super(nome, quantidadeFuncionarios, endereco, dataFundacao, maxProdutos);
        this.seguroEletronicos = seguroEletronicos;
    }

    public double getSeguroEletronicos() {
        return seguroEletronicos;
    }

    public void setSeguroEletronicos(double seguroEletronicos) {
        this.seguroEletronicos = seguroEletronicos;
    }

    @Override
    public String toString() {
        return "Informatica [seguroEletronicos=" + seguroEletronicos + "]";
    }

}
