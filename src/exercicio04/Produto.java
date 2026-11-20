package exercicio04;

public class Produto {
    String nome;
    double preco;
    int quantidadeEstoque;

    void cadastrarProduto(String nome, double preco, int quantidadeEstoque){
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    void exibirProduto() {
        System.out.println("Produto: " + this.nome);
        System.out.println("Preço: " + this.preco);
        System.out.println("Estoque: " + this.quantidadeEstoque);
    }

    void venderProduto(int quantidade){

        if (quantidade < 0){
            System.out.println("Valor inadequado!");
        }
        if (quantidade <= quantidadeEstoque){
            quantidadeEstoque = quantidadeEstoque - quantidade;
            System.out.println("Venda concluida");
        } else {
            System.out.println("Estoque insuficiente!");
        }
    }

    void calcularValorEstoque() {

        double valor = 0;

        valor = preco * quantidadeEstoque;

        System.out.println("Valor total do estoque: R$ " + valor);
    }
}
