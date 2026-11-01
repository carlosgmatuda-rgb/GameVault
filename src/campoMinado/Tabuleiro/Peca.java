package campoMinado.Tabuleiro;

public class Peca {
    protected Posicao posicao;
    private Tabuleiro tabuleiro;

    public Peca(Posicao posicao, Tabuleiro tabuleiro) {
        this.posicao = posicao;
        this.tabuleiro = tabuleiro;
    }

    public Tabuleiro getTabuleiro() {
        return tabuleiro;
    }
}
