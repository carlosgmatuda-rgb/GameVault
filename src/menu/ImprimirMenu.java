package menu;

import java.util.Scanner;

public class ImprimirMenu {
    private int entrada;

    public ImprimirMenu(int entrada) {
        this.entrada = entrada;
    }

    public ImprimirMenu() {
    }

    public int getEntrada() {
        return entrada;
    }

    public void imprimir(Scanner scanner){
    String titulo = "JOGOS EM JAVA";
    String[] opcoes = {
            "1. Campo minado",
            "2. Calculadora",
            "3. Jogo de xadrez",
            "4. Desconectar do Sistema"
    };

    int larguraMenu = 40;

    // Renderiza o menu visual (Apenas uma vez)
    imprimirLinhaBorda(larguraMenu, "┌", "─", "┐");
    imprimirLinhaCentralizada(titulo, larguraMenu);
    imprimirLinhaBorda(larguraMenu, "├", "─", "┤");

        for (String opcao : opcoes) {
        imprimirLinhaAlinhadaEsquerda(opcao, larguraMenu);
    }

    imprimirLinhaBorda(larguraMenu, "└", "─", "┘");

    // Solicita a entrada do usuário
        System.out.print("COMANDO > ");
    entrada = scanner.nextInt();

    // Processa a escolha do usuário
        System.out.println();
        switch (entrada) {
        case 1:
            System.out.println("[+] Iniciando rastreamento...");
            break;
        case 2:
            System.out.println("[+] Conectando ao feed visual...");
            break;
        case 3:
            System.out.println("[+] Acessando registros biométricos...");
            break;
        case 4:
            System.out.println("[-] Desconectando...");
            break;
        default:
            System.out.println("[!] Comando desconhecido.");
            break;
    }

    // Fecha o scanner de forma segura ao terminar as operações
        //scanner.close();
}

// --- MÉTODOS DE RENDERIZAÇÃO VISUAL ---

private static void imprimirLinhaBorda(int largura, String inicio, String preenchimento, String fim) {
    System.out.print(inicio);
    for (int i = 0; i < largura - 2; i++) {
        System.out.print(preenchimento);
    }
    System.out.println(fim);
}

private static void imprimirLinhaCentralizada(String texto, int larguraTotal) {
    int espacoDisponivel = larguraTotal - 2;
    int espacosEsquerda = (espacoDisponivel - texto.length()) / 2;
    int espacosDireita = espacoDisponivel - texto.length() - espacosEsquerda;

    System.out.print("│");
    System.out.print(" ".repeat(Math.max(0, espacosEsquerda)));
    System.out.print(texto);
    System.out.print(" ".repeat(Math.max(0, espacosDireita)));
    System.out.println("│");
}

private static void imprimirLinhaAlinhadaEsquerda(String texto, int larguraTotal) {
    int espacoDisponivel = larguraTotal - 4;
    int espacosDireita = espacoDisponivel - texto.length();

    System.out.print("│ ");
    System.out.print(texto);
    System.out.print(" ".repeat(Math.max(0, espacosDireita)));
    System.out.println(" │");
}
}