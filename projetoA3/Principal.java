package com.mycompany.projetoA3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Equipe: ***
 * Projeto: ***
 *  Esse é um projeto de cadastro de produtos em um supermercado, que tem como opções cadastrar e listar produtos, fornecendo
 *  informações como: codigo, nome, data de fabricação, data de validade e preço. O programa inicia com 7 objetos sendo criados
 *  e adicionados ao ArrayList: listaDeProdutos.
 */
public class Principal {
    /*
     * Uma função que recebe como parametro um ArrayList e ao ser chamada, nos mostra uma lista de todos os objetos contidos
     * dentro dela.
     */
    public static void lista(ArrayList listaDeProdutos){
        System.out.println("CODIGO |  NOME  |  PREÇO");

        for (int y = 0; y < listaDeProdutos.size(); y++) {
            System.out.println(listaDeProdutos.get(y));
        }
    }

    public static void main(String[] args) {
        boolean codigoCadastrado = false;
        Scanner sc = new Scanner(System.in);
        ArrayList<Produtos> listaDeProdutos = new ArrayList();

        Produtos item1 = new Produtos(1, "macarrao", "16/05/2024", "16/05/2025", 12.50);
        Produtos item2 = new Produtos(2, "sabonete", "16/05/2024", "16/05/2025", 2.50);
        Produtos item3 = new Produtos(3, "papel higienico", "16/05/2024", "16/05/2025", 10.99);
        Produtos item4 = new Produtos(4, "agua sanitaria", "16/05/2024", "16/05/2025", 1.89);
        Produtos item5 = new Produtos(5, "Nescau", "16/05/2024", "16/05/2025", 12.99);
        Produtos item6 = new Produtos(6, "Café", "16/05/2024", "16/05/2025", 21.50);
        Produtos item7 = new Produtos(7, "Coca cola", "16/05/2024", "16/05/2025", 10.00);

        listaDeProdutos.add(item1);
        listaDeProdutos.add(item2);
        listaDeProdutos.add(item3);
        listaDeProdutos.add(item4);
        listaDeProdutos.add(item5);
        listaDeProdutos.add(item6);
        listaDeProdutos.add(item7);

        String encerrarPrograma = "";
        String encerrarCadastro;
        /*
         Aqui criamos a váriavel novoCodigo e iniciamos ela com 8, porque ela vai ser responsavel por atribuir um codigo
         novo para cada um dos objetos criados a seguir. o ultimo objeto cadastrado foi o item7, que tem o codigo: 7,
         por isso ela começa com 8.
         */
        int novoCodigo = 8;

        /*
            Aqui temos um While, com um menu de opções que é ativado com o 'switch' que vem logo em seguida. quando o usuario
            seleciona a opção 3 - o programa é finalizado.
            ao acessar a opção 1 - é iniciado mais um while, esse sendo para
            cadastro de produtos. o dado de codigo é gerado automaticamente e o programa só solicida - nome - data de fabricação
             - data de validade e preço. o usuario escolhe se deseja continuar cadastrando produtos ou não, caso deseje parar
             o programa volta para o primeiro menu de opções.
             ao acessar o menu 2 - o usuario recebe um segundo menu, que pergunta se ele deseja acessar a opção de ver
             todos os produtos, que só mostra codigo, nome e preço, ou se ele deseja ver os dados de apenas 1 produto, mas completos.
             no final o usuario é redirecionado para o primeiro menu, novamente.
         */
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
                        int codigo = novoCodigo;

                        System.out.println("Informe o nome: ");
                        String nome = sc.nextLine();

                        System.out.println("Informe a data de fabricação: [00/00/00]");
                        String dataFabricacao = sc.nextLine();

                        System.out.println("Informe a data de validade: [00/00/00]");
                        String dataValidade = sc.nextLine();

                        System.out.println("Informe o preço: [00,00]");

                        double preco = sc.nextDouble();
                        sc.nextLine();

                        Produtos item = new Produtos(codigo, nome, dataFabricacao, dataValidade, preco); //aqui é aonde criamos o novo objeto
                        listaDeProdutos.add(item); // aqui adicionamos o objeto ao ArrayList
                        novoCodigo++;

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
                        lista(listaDeProdutos); //aqui mostramos a função que foi criada no começo da classe.
                    }else if(opcaoItem == 2) {
                        System.out.println("Informe o codigo do Item: ");
                        int item = sc.nextInt();

                        codigoCadastrado = false;
                        /*
                            Esse laço de repetição é necessario para percorrer toda, ou quase toda, a nossa ArrayList em busca
                            de um código que seja identico ao que o usuario escolheu para ver as informações. caso esse codigo
                            de produto não exista na lista, a váriavel 'codigoCadastrado' permanece falsa e entra no segundo 'if'
                            assim ela imprimi que o codigo não está cadastrado.
                         */
                        for (int z = 0; z < listaDeProdutos.size(); z++){
                            int s = listaDeProdutos.get(z).getCodigo();
                            if (s == item){
                                codigoCadastrado = true;
                                System.out.println(listaDeProdutos.get(z).getTodosAtributos());
                                break;
                            }else{}
                        }
                        if (codigoCadastrado == false){
                            System.out.println("Codigo não cadastrado");
                        }else{}
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
