import java.util.Scanner;

public class Principal {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int opcao;
            Loja loja = null;
            Produto produto = null;
            Data dataReferencia = new Data(20, 10, 2023);

            do {
                System.out.println("\nMenu:");
                System.out.println("1 - Criar uma loja");
                System.out.println("2 - Criar um produto");
                System.out.println("3 - Sair");
                System.out.print("Escolha uma opção: ");

                opcao = scanner.nextInt();
                scanner.nextLine();

                switch (opcao) {
                    case 1:
                        loja = criarLoja(scanner);
                        System.out.println("Loja criada: " + loja.getNome());
                        break;
                        
                    case 2:
                        produto = criarProduto(scanner);
                        System.out.println("Produto criado: " + produto.getNome());
                        
                        // Verifica validade
                        if (produto.estaVencido(dataReferencia)) {
                            System.out.println("PRODUTO VENCIDO");
                        } else {
                            System.out.println("PRODUTO NÃO VENCIDO");
                        }
                        break;
                        
                    case 3:
                        System.out.println("Saindo...");
                        break;
                        
                    default:
                        System.out.println("Opção inválida!");
                }
            } while (opcao != 3);
            
            scanner.close();
        }
// Método para criar Loja (inputs via teclado)
public static Loja criarLoja(Scanner scanner) {
    System.out.print("Nome da Loja: ");
    String nome = scanner.nextLine();

    System.out.print("Quantidade de Funcionários: ");
    int qtdFunc = scanner.nextInt();

    System.out.print("Salário Base (-1 se não souber): ");
    double salario = scanner.nextDouble();
    scanner.nextLine(); // Limpa buffer

    // Endereço (simplificado)
    System.out.print("Rua: ");
    String rua = scanner.nextLine();

    System.out.print("Cidade: ");
    String cidade = scanner.nextLine();

    System.out.print("Estado: ");
    String estado = scanner.nextLine();

    Endereco endereco = new Endereco(rua, cidade, estado, "Brasil", "00000-000", "0", "");

    // Data de fundação
    System.out.print("Dia de Fundação: ");
    int dia = scanner.nextInt();

    System.out.print("Mês de Fundação: ");
    int mes = scanner.nextInt();

    System.out.print("Ano de Fundação: ");
    int ano = scanner.nextInt();
    scanner.nextLine(); // Limpa buffer

    Data dataFundacao = new Data(dia, mes, ano);

    if (salario == -1) {
        return new Loja(nome, qtdFunc, endereco, dataFundacao);
    } else {
        return new Loja(nome, qtdFunc, salario, endereco, dataFundacao);
    }
}

// Método para criar Produto (inputs via teclado)
public static Produto criarProduto(Scanner scanner) {
    System.out.print("Nome do Produto: ");
    String nome = scanner.nextLine();

    System.out.print("Preço: ");
    double preco = scanner.nextDouble();

    // Data de validade
    System.out.print("Dia de Validade: ");
    int dia = scanner.nextInt();

    System.out.print("Mês de Validade: ");
    int mes = scanner.nextInt();

    System.out.print("Ano de Validade: ");
    int ano = scanner.nextInt();
    scanner.nextLine(); // Limpa buffer

    Data dataValidade = new Data(dia, mes, ano);

    return new Produto(nome, preco, dataValidade);
}
}