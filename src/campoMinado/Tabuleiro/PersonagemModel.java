package campoMinado.Tabuleiro;

public class PersonagemModel {
    protected Posicao posicao;
    private Tabuleiro tabuleiro;

    public PersonagemModel(Tabuleiro tabuleiro) {
        this.posicao = null;
        this.tabuleiro = tabuleiro;
    }

    public PersonagemModel() {
    }

    public Tabuleiro getTabuleiro() {
        return tabuleiro;
    }
}
