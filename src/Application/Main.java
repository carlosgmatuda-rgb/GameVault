package Application;

import menu.ImprimirMenu;
import menu.menuException;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try { Scanner scanner = new Scanner(System.in);
        ImprimirMenu imprimirmenu = new ImprimirMenu();

        while (imprimirmenu.getEntrada() != 4) {
            try {
                imprimirmenu.imprimir(scanner);
            } catch (menuException e) {
                // erro recuperável: mostra a mensagem e o menu volta
                System.out.println("[!] Erro no menu: " + e.getMessage());
            }
        }
    } catch (NoSuchElementException e) {
        // erro fatal: a entrada acabou (Ctrl+D / Ctrl+Z), não dá para continuar
        System.out.println("[!] Entrada encerrada. Saindo...");
    }
}
}