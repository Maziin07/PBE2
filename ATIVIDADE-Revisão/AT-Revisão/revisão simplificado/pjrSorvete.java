package com.example.demo;

import java.math.BigDecimal;

public class pjrSorvete {
	
	//Atributos
	
    private String nome;
    private String tipo;
    private String sabor;
    private BigDecimal preco;
	
    
    //Construtores
    
    pjrSorvete(){
    }
    pjrSorvete(String nome, String tipo, String sabor, BigDecimal preco){	
    	this.nome = nome;
    	this.preco = preco;
    	this.sabor = sabor;
    	this.tipo = tipo;
    
    }
    
    
    //Getters and Setters
    
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getSabor() {
		return sabor;
	}
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	public BigDecimal getPreco() {
		return preco;
	}
	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
	

}
