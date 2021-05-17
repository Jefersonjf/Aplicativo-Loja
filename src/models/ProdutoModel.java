package models;

public class ProdutoModel {

    public String nome;
    public String codigoMercadoria;
    public float valor;
    public int estoque;

    public ProdutoModel(String codigoMercadoria, String nome, float valor, int estoque) {
        this.nome = nome;
        this.codigoMercadoria = codigoMercadoria;
        this.valor = valor;
        this.estoque = estoque;
    }

}