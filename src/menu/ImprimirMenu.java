package menu;

import java.util.Scanner;

public class ImprimirMenu {
    private final MenuVisual visual;
    private final MenuLogica logica;

    public ImprimirMenu() {
        this.visual = new MenuVisual(40);
        this.logica = new MenuLogica(
                "JOGOS EM JAVA",
                new String[] {
                        "1. Campo minado",
                        "2. Calculadora",
                        "3. Jogo de xadrez",
                        "4. Desconectar do Sistema"
                });
    }

    public int getEntrada() {
        return logica.getEntrada();
    }

    public void imprimir(Scanner scanner) {
        visual.desenhar(logica.getTitulo(), logica.getOpcoes());
        logica.lerEntrada(scanner);
        System.out.println();
        logica.processar();
    }

    public static void limpar() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}