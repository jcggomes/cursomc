package com.juliocesar.cursomc.domain;

import java.io.Serializable;

public class Categoria implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String nome; //checklist: Atributos basicos
	
	public Categoria() { //checklist: Construtores
		
	}

	public Categoria(Integer id, String nome) {
		super();
		this.id = id;
		this.nome = nome; 
	}//checklist: Construtores. botao direito=>source=>Generate Const using fields

	public Integer getId() { //checklist: Getters e Setters. botao direito=>source=>Generate Getters e Setters
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	} //checklist: hashCode e equals. botao direito=>source=>Generate hashCode e equals

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Categoria other = (Categoria) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}