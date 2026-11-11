package campoMinado.Tabuleiro;

public class Tabuleiroo {
    int linha;
    int coluna;
    Posicao[][] posicao;

    public Tabuleiroo(int linha, int coluna, Posicao[][] posicao) {
        this.linha = linha;
        this.coluna = coluna;
        this.posicao = posicao;
    }

    public int getLinha() {
        return linha;
    }

    public int getColuna() {
        return coluna;
    }

    public Posicao posicao(int linha, int coluna) {
        return posicao[linha][coluna];
    }

    public Posicao posicao() {
        return posicao[getLinha()][ getColuna()];
    }

    p
}
