
package com.mycompany.projetoA3;

/**
 *
 *
 */
public class Produtos {
    private int codigo;
    private String nome, dataValidade, dataFabricacao;
    private double preco;
    
    public Produtos(int codigo, String nome,String dataFabricacao, String dataValidade, double preco ){
        this.codigo = codigo;
        this.nome = nome;
        this.dataFabricacao = dataFabricacao;
        this.dataValidade = dataValidade;
        this.preco = preco;
    }

    public int getCodigo() { return codigo; }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    public String getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(String dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    /*
        Override de uma função que já existe. essa função faz parte do .get() na nossa ArrayList, se não tivessemos
        esse Override aqui, a função apenas retornaria o endereço de memoria na qual esses objetos estão armazenados.
        com o Override é possivel subscrever essa função e colocarmos para que ela mostre os dados desejados, no caso são
        o codigo, o nome e o preço.
     */
    @Override
    public String toString(){
        return "   " + getCodigo() + "    " + getNome() + "    " + getPreco();
    }

    /*
        Essa função é semelhante a função de cima, mas ela devolve os dados mais detalhados. Para ela ser chamada, é necessario
        chamar a partir de um objeto, como utilizamos ela junto com a ArrayList, ela normalmente fica assim:
         listaDeProdutos.get(index).getTodosAtributos();
     */
    public String getTodosAtributos(){
        return "\nCodigo: " + getCodigo() +
                "\nNome: " + nome +
                "\nData de Fabricação: " + dataFabricacao +
                "\nData de Validade: " + dataValidade +
               "\nPreço: R$" + preco;
    }
}
