package exercicio01;

public class Cadastrodeprodutos {
    static void main(String[] args) {

        Produto[] produtos = new Produto[3];

        Produto produto1 = new Produto();
        Produto produto2 = new Produto();
        Produto produto3 = new Produto();

        //PRODUTO 1
        produto1.nome = "Notebook";
        produto1.marca = "Apple";
        produto1.preco = 5.999;
        produto1.quantidadeDeEstoque = 15;
        produto1.codigo = 847291;

        //PRODUTO 2
        produto2.nome = "Tablet";
        produto2.marca = "Samsung";
        produto2.preco = 2.975;
        produto2.quantidadeDeEstoque = 28;
        produto2.codigo = 593817;

        //PRODUTO 3
        produto3.nome = "Notebook";
        produto3.marca = "ASUS";
        produto3.preco = 3.399;
        produto3.quantidadeDeEstoque = 8;
        produto3.codigo = 726405;

        produtos[0] = produto1;
        produtos[1] = produto2;
        produtos[2] = produto3;

        for (int i = 0; i < produtos.length; i++){
            System.out.println("Produto: " + produtos[i].nome);
            System.out.println("Marca do Produto: " + produtos[i].marca);
            System.out.println("Preço do Produto: " + produtos[i].preco);
            System.out.println("Quantidade de Estoque: " + produtos[i].quantidadeDeEstoque);
            System.out.println("Código do Produto: " + produtos[i].codigo);
            System.out.println("--------------------");
        }
    }
}
