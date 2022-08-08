package com.generation.lojaJogos.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="tb_categoria")
public class CategoriaModel {
	
	private Long id;
	
	private String nomeCategoria;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeCategoria() {
		return nomeCategoria;
	}

	public void setNomeCategoria(String categoria) {
		this.nomeCategoria = categoria;
	}

}
