package campoMinado.Tabuleiro;

public class Tabuleiro {
    private int linhas;
    private int coluna;
    private PersonagemModel[][] peca;

    public Tabuleiro(int linhas, int coluna, PersonagemModel[][] peca) {
        this.linhas = linhas;
        this.coluna = coluna;
        this.peca = new PersonagemModel[linhas][coluna];
    }

    public int getLinhas() {
        return linhas;
    }

    public void setLinhas(int linhas) {
        this.linhas = linhas;
    }

    public int getColuna() {
        return coluna;
    }

    public void setColuna(int coluna) {
        this.coluna = coluna;
    }

    public PersonagemModel[][] getPeca() {
        return peca;
    }

    public void setPeca(PersonagemModel[][] peca) {
        this.peca = peca;
    }
}
