package campoMinado.Tabuleiro;

public class PersonagemModel {
    protected Posicao posicao;
    private Tabuleiro tabuleiro;

    public PersonagemModel(Posicao posicao, Tabuleiro tabuleiro) {
        this.posicao = posicao;
        this.tabuleiro = tabuleiro;
    }

    public Tabuleiro getTabuleiro() {
        return tabuleiro;
    }
}
