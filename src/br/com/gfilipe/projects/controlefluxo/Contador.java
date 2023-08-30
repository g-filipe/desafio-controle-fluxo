package br.com.gfilipe.projects.controlefluxo;

import exceptions.ParametrosInvalidosException;
import java.util.Scanner;

public class Contador {
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String BLUE = "\u001B[34m";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro parâmetro: ");
        int parametroUm = sc.nextInt();
        System.out.println("Digite o segundo parâmetro: ");
        int parametroDois = sc.nextInt();

        try {
            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException e) {
              System.out.println(RED + "O segundo parâmetro deve ser maior que o primeiro!" + RESET);
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroDois <= parametroUm) {
            throw new ParametrosInvalidosException();
        } else {
            int contagem = parametroDois - parametroUm;
            System.out.println(BLUE + "Contando..." + RESET);
            for (int i = 1; i <= contagem; i++) {
                System.out.println(i);
            }
        }
    }
}
