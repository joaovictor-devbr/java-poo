package exercicio02;

public class CadastroVeiculos {
    static void main(String[] args) {

        Veiculo veiculo1 = new Veiculo();
        Veiculo veiculo2 = new Veiculo();
        Veiculo veiculo3 = new Veiculo();

        veiculo1.marca = "Chevrolet";
        veiculo1.modelo = "Onix";
        veiculo1.ano  = 2022;
        veiculo1.cor = "Preto";
        veiculo1.preco = 65000.0;

        veiculo2.marca = "Volkswagen";
        veiculo2.modelo = "Gol";
        veiculo2.ano = 2019;
        veiculo2.cor = "Branco";
        veiculo2.preco = 48000.0;

        veiculo3.marca = "Toyota";
        veiculo3.modelo = "Corolla";
        veiculo3.ano =  2021;
        veiculo3.cor = "Prata";
        veiculo3.preco = 105000.0;

        System.out.println("Marca do veículo: " + veiculo1.marca);
        System.out.println("Modelo do veículo: " + veiculo1.modelo);
        System.out.println("Ano do veículo: " + veiculo1.ano);
        System.out.println("Cor do veículo: " + veiculo1.cor);
        System.out.printf("Preço: R$ %.2f%n", veiculo1.preco);
        System.out.println("........................");

        System.out.println("Marca do veículo: " + veiculo2.marca);
        System.out.println("Modelo do veículo: " + veiculo2.modelo);
        System.out.println("Ano do veículo: " + veiculo2.ano);
        System.out.println("Cor do veículo: " + veiculo2.cor);
        System.out.printf("Preço: R$ %.2f%n", veiculo2.preco);
        System.out.println("........................");

        System.out.println("Marca do veículo: " + veiculo3.marca);
        System.out.println("Modelo do veículo: " + veiculo3.modelo);
        System.out.println("Ano do veículo: " + veiculo3.ano);
        System.out.println("Cor do veículo: " + veiculo3.cor);
        System.out.printf("Preço: R$ %.2f%n", veiculo3.preco);
        System.out.println("........................");

    }
}
