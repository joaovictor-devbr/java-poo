package exercicio03;

public class cadastroDeJogadores {
    static void main(String[] args) {

        Jogador jogador1 = new Jogador();
        Jogador jogador2 = new Jogador();
        Jogador jogador3 = new Jogador();

        //Jogador 1
        jogador1.nome = "Gabriel Silva";
        jogador1.numeroDaCamisa = 10;
        jogador1.posicao = "Atacante";
        jogador1.idade = 24;

        jogador1.apresentarJogador();
        jogador1.verificarIdade();
        jogador1.verificarCategoria();
        jogador1.exibirPosicao();

        System.out.println("...................");

        //Jogador 2
        jogador2.nome = "Lucas Oliveira";
        jogador2.numeroDaCamisa = 5;
        jogador2.posicao = "Zagueiro";
        jogador2.idade = 15;

        jogador2.apresentarJogador();
        jogador2.verificarIdade();
        jogador2.verificarCategoria();
        jogador2.exibirPosicao();

        System.out.println("...................");

        //Jogador 3
        jogador3.nome = "Matheus Santos";
        jogador3.numeroDaCamisa = 1;
        jogador3.posicao = "Goleiro";
        jogador3.idade = 16;

        jogador3.apresentarJogador();
        jogador3.verificarIdade();
        jogador3.verificarCategoria();
        jogador3.exibirPosicao();

        System.out.println("...................");
    }
}
