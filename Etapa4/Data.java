public class Data {
    //atributos
    private int dia;
    private int mes;
    private int ano;

    //construtor
    public Data(int dia, int mes, int ano) {
        if (verificaData(dia, mes, ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            System.out.println("Data inválida!");
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        }
    }

    public boolean verificaAnoBissexto() {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }

    private boolean verificaData(int dia, int mes, int ano) {
        if (mes < 1 || mes > 12) {
            return false;
        }
    
        int[] diasMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    
        if (mes == 2 && verificaAnoBissexto()) {
            diasMes[1] = 29;
        }
    
        return dia >= 1 && dia <= diasMes[mes - 1];
    }

    //get e set
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    //toString
    @Override
    public String toString() {
        return "Data {dia=" + dia + ", mes=" + mes + ", ano=" + ano + "}";
    }
    
}
