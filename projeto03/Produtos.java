/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto03;

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

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the dataValidade
     */
    public String getDataValidade() {
        return dataValidade;
    }

    /**
     * @param dataValidade the dataValidade to set
     */
    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    /**
     * @return the dataFabricacao
     */
    public String getDataFabricacao() {
        return dataFabricacao;
    }

    /**
     * @param dataFabricacao the dataFabricacao to set
     */
    public void setDataFabricacao(String dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    /**
     * @return the preco
     */
    public double getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    @Override
    public String toString(){
        return "\nCodigo: " + getCodigo() +
               "\nNome: " + nome + 
               "\nPreço: " + preco;
    }    
    
    public String getTodosAtributos(){
        
        return "\nCodigo: " + getCodigo() + 
               "\nData de Fabricação: " + dataFabricacao +
               "\nData de Validade: " + dataValidade +
               "\nNome: " + nome + 
               "\nPreço: " + preco;
    }     

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }
}
