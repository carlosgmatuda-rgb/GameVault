package campoMinado.Tabuleiro;

public class Tabuleiro {
    private int linhas;
    private int coluna;
    private Peca[][] peca;

    public Tabuleiro(int linhas, int coluna, Peca[][] peca) {
        this.linhas = linhas;
        this.coluna = coluna;
        this.peca = new Peca[linhas][coluna];
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

    public Peca[][] getPeca() {
        return peca;
    }

    public void setPeca(Peca[][] peca) {
        this.peca = peca;
    }
}
