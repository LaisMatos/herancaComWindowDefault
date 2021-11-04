package br.senai.sp.jandira.model;

import java.time.LocalDate;

public class Pessoa {
	
	private String nome;
	private String email;
	private LocalDate dataDeNasimento;
	private int peso;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail() {
		return email;
	}
	
	public void setDataDeNasimento(LocalDate dataDeNasimento) {
		this.dataDeNasimento = dataDeNasimento;
	}
	public LocalDate getDataDeNasimento() {
		return dataDeNasimento;
	}
	
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public int getPeso() {
		return peso;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
