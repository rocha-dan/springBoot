package com.example.document;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="test")
public class Imagem {

	private String nome;
	private String url;
	private String descricao;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Imagem(String nome, String url, String descricao) {
		super();
		this.nome = nome;
		this.url = url;
		this.descricao = descricao;
	}
	
}
