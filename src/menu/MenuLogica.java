package menu;

import java.util.Scanner;

public class MenuLogica {
    private final String titulo;
    private final String[] opcoes;
    private int entrada;

    public MenuLogica(String titulo, String[] opcoes) {
        this.titulo = titulo;
        this.opcoes = opcoes;
    }

    public String getTitulo() {
        return titulo;
    }

    public String[] getOpcoes() {
        return opcoes;
    }

    public int getEntrada() {
        return entrada;
    }

    public int lerEntrada(Scanner scanner) {
        System.out.print("COMANDO > ");
        String linha = scanner.nextLine().trim();
        try {
            entrada = Integer.parseInt(linha);
        } catch (NumberFormatException e) {
            entrada = -1; // cai em "comando desconhecido" em vez de quebrar
        }
        return entrada;
    }

    public void processar() {
        switch (entrada) {
            case 1:
                System.out.println("[+] Iniciando Campo minado...");
                break;
            case 2:
                System.out.println("[+] Iniciando Calculadora...");
                break;
            case 3:
                System.out.println("[+] Iniciando Jogo de xadrez...");
                break;
            case 4:
                System.out.println("[-] Desconectando...");
                break;
            default:
                System.out.println("[!] Comando desconhecido.");
                break;
        }
    }
}