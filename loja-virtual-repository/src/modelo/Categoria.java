package modelo;

import java.util.ArrayList;
import java.util.List;

public class Categoria {

    private Integer id;
    private String nome;

    private List<Produto> produtos = new ArrayList<>();

    public Categoria(Integer id, String nome){
        this.id = id;
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public List<Produto> getProdutos(){
        return produtos;
    }

    public void adicionar(Produto produto){
        produtos.add(produto);
    }
}
