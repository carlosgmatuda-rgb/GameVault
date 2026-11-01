package menu;

public class MenuVisual {
    private final int largura;

    public MenuVisual(int largura) {
        if (largura < 10) {
            throw new menuException("Largura do menu muito pequena: " + largura);
        }
        this.largura = largura;
    }

    public void desenhar(String titulo, String[] opcoes) {
        linhaBorda("┌", "─", "┐");
        linhaCentralizada(titulo);
        linhaBorda("├", "─", "┤");
        for (String opcao : opcoes) {
            linhaEsquerda(opcao);
        }
        linhaBorda("└", "─", "┘");
    }

    private void linhaBorda(String inicio, String preenchimento, String fim) {
        System.out.println(inicio + preenchimento.repeat(largura - 2) + fim);
    }

    private void linhaCentralizada(String texto) {
        int espaco = largura - 2;
        int esquerda = Math.max(0, (espaco - texto.length()) / 2);
        int direita = Math.max(0, espaco - texto.length() - esquerda);
        System.out.println("│" + " ".repeat(esquerda) + texto + " ".repeat(direita) + "│");
    }

    private void linhaEsquerda(String texto) {
        int direita = Math.max(0, (largura - 4) - texto.length());
        System.out.println("│ " + texto + " ".repeat(direita) + " │");
    }
}
