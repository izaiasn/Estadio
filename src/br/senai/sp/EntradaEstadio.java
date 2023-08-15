package br.senai.sp;

import java.util.Scanner;

public class EntradaEstadio {
    public static void main(String[] args) {
        String nome;
        int camisa;
        int idade;

        System.out.println("----------Bem vindo a Arena Camisa Colorida----------");
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        nome = teclado.nextLine();
        System.out.println(nome);
        System.out.print("Digite sua idade: ");
        idade = teclado.nextInt();
        System.out.println("Sua idade: "+ idade);
        System.out.println("Digite a cor da sua Camisa: 1 Azul - 2 Branca - 3 Vermelha - 4 Preta - 5 Amarela - 6 Verde ");
        camisa = teclado.nextInt();
        switch (camisa) {
            case 1:
                System.out.println(nome+" Vá para Arquibancada A");
                break;
            case 2:
                System.out.println(nome+" Vá para Arquibancada B");
                break;
            case 3:
                System.out.println(nome+" Vá para Arquibancada C");
                break;
            case 4:
                System.out.println(nome+" Vá para Arquibancada D");
                break;
            case 5:
                System.out.println(nome+" Vá para Arquibancada E");
                break;
            case 6:
                System.out.println(nome+" Vá para Arquibancada F");
                break;
            default:
                System.out.println("Vá embora");
                break;


        }

    }
}
