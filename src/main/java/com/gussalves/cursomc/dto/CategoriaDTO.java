package com.gussalves.cursomc.dto;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.gussalves.cursomc.domain.Categoria;

public class CategoriaDTO implements Serializable { // Returns only Categorias obj
	private static final long serialVersionUID = 1L;

	private Integer id;
	
	@NotEmpty(message="Preenchimento obrigatório")
	@Size(min=5, max=80, message="O tamanho deve ser de 5 a 80 caracteres")
	private String name;
	
	public CategoriaDTO () {	
	}
	
	public CategoriaDTO (Categoria obj) {
		this.id = obj.getId();
		this.name = obj.getNome();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
		
}