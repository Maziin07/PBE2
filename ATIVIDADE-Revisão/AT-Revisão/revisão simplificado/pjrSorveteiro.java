package com.example.demo;

public class pjrSorveteiro {
	
	
	//Atributos
	
	private String nome;
	private String especializacao;
	private int cargaHoraria;
	private int salario;
	
	
	//Construtores
	
	pjrSorveteiro(){
    }
    pjrSorveteiro(String nome, String especializacao, int cargaHoraria, int salario){	
    	this.nome = nome;
    	this.especializacao = especializacao; 
    	this.cargaHoraria = cargaHoraria;
    	this.salario = salario;    	
    }
    
    //Getters and Setters
    
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEspecializacao() {
		return especializacao;
	}
	public void setEspecializacao(String especializacao) {
		this.especializacao = especializacao;
	}
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	public int getSalario() {
		return salario;
	}
	public void setSalario(int salario) {
		this.salario = salario;
	}
			
    
}
