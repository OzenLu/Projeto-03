/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto03;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 12724141297
 */
public class Principal {
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
        
        String encerrarPrograma = "x";
        
        while(!"sair".equals(encerrarPrograma)){
            System.out.println("algo: ");
            encerrarPrograma = sc.nextLine();
            
        }    
        
//        for(String x = "0"; x != "sair";){
//            System.out.println("algo: ");
//            encerrarPrograma = sc.nextLine();
//        }
        
        
//        for (int x = 0; x < listaDeProdutos.size(); x++) {
//            System.out.println(listaDeProdutos.get(x));
//        }
        
    }      
}
