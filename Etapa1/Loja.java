
public class Loja {
    //atributos 
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    
    //metodos 

    //construtor1
    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }
    //construtor2
    public Loja(String nome, int quantidadeFuncionarios) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
    }

    //get e set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public double getSalarioBaseFuncionario() {
        return salarioBaseFuncionario;
    }

    public void setSalarioBaseFuncionario(double salarioBaseFuncionario) {
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    //toString
    @Override
    public String toString() {
        return "Loja {nome = " + nome + ", quantidadeFuncionarios = " + quantidadeFuncionarios
                + ", salarioBaseFuncionario = " + salarioBaseFuncionario + "}";
    }

    //método gastosComSalario
    public double gastosComSalario() {
        if (salarioBaseFuncionario != -1) {
            return quantidadeFuncionarios * salarioBaseFuncionario;
        } else {
            return -1;
        }
    }

    //método tamanhoDaLoja
    public char tamanhoDaLoja() {
        if (quantidadeFuncionarios < 10){
            return 'P';
        } else if (quantidadeFuncionarios >= 10 && quantidadeFuncionarios <= 30) {
            return 'M';
        } else {
            return 'G';
        }
    }
}
