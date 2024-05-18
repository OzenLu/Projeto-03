/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto03;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 *
 */
public class Principal {

    public static void lista(ArrayList listaDeProdutos){
        for (int y = 0; y < listaDeProdutos.size(); y++) {
            System.out.println(listaDeProdutos.get(y));
        }
    }
    public static void main(String[] args) {
        ArrayList<Produtos> listaDeProdutos = new ArrayList();
        Produtos item1 = new Produtos(1, "macarrao", "16/05/2024", "16/05/2025", 12.50);
        Produtos item2 = new Produtos(2, "macarrao", "16/05/2024", "16/05/2025", 12.50);
        Produtos item3 = new Produtos(3, "macarrao", "16/05/2024", "16/05/2025", 12.50);
        Produtos item4 = new Produtos(4, "macarrao", "16/05/2024", "16/05/2025", 12.50);
        Produtos item5 = new Produtos(5, "macarrao", "16/05/2024", "16/05/2025", 12.50);
        Produtos item6 = new Produtos(6, "macarrao", "16/05/2024", "16/05/2025", 12.50);
        Produtos item7 = new Produtos(7, "macarrao", "16/05/2024", "16/05/2025", 12.50);
        
        listaDeProdutos.add(item1);
        listaDeProdutos.add(item2);
        listaDeProdutos.add(item3);
        listaDeProdutos.add(item4);
        listaDeProdutos.add(item5);
        listaDeProdutos.add(item6);
        listaDeProdutos.add(item7);
        Scanner sc = new Scanner(System.in);


        String encerrarPrograma = "";
        String encerrarCadastro = "";
        int x = 8;
        double preco = 0;
        while(!"sair".equals(encerrarPrograma)) {

            System.out.println("\n[1] Para cadastrar um Item"
                             + "\n[2] Para acessar a lista de itens"
                             + "\n[3] para sair");

            int opcaoMenu = sc.nextInt();
            sc.nextLine(); //para limpar

            switch (opcaoMenu) {
                case 1:
                    encerrarCadastro = "";
                    while (!"n".equals(encerrarCadastro)) {
                        int codigo = x;

                        System.out.println("Informe o nome: ");
                        String nome = sc.nextLine();

                        System.out.println("Informe a data de fabricação:");
                        String dataFabricacao = sc.nextLine();

                        System.out.println("Informe a data de validade:");
                        String dataValidade = sc.nextLine();

                        System.out.println("Informe o preço: ");

                        preco = sc.nextDouble();
                        sc.nextLine();

                        Produtos item = new Produtos(codigo, nome, dataFabricacao, dataValidade, preco);
                        listaDeProdutos.add(item);
                        x++;

                        System.out.println("Deseja continuar cadastrando itens? [s/n]");
                        encerrarCadastro = sc.nextLine().toLowerCase();
                    }
                    break;
                case 2:
                    System.out.println("\n[1] Para acessar a lista de todos os itens"
                                      +"\n[2] Para acessar apenas um item");
                    int opcaoItem = sc.nextInt();
                    sc.nextLine();
                    if (opcaoItem == 1){
                        lista(listaDeProdutos);
                    }else if(opcaoItem == 2) {
                        System.out.println("Informe o codigo do Item: ");
                        int item = sc.nextInt();
                        sc.nextLine();
                        System.out.println(listaDeProdutos.get(item).getTodosAtributos());
                    }
                    break;
                case 3:
                    System.out.println("Encerrando o programa");
                    encerrarPrograma = "sair";
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }
}
