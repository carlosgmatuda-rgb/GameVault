package Application;

import menu.ImprimirMenu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ImprimirMenu menu = new ImprimirMenu();
        while(menu.getEntrada() != 4) {
            menu.imprimir(scanner);
        }
        scanner.close();
    }
}