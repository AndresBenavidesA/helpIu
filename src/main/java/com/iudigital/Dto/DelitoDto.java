package com.iudigital.Dto;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

public class DelitoDto implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5543741556136008173L;
	
	@NotNull(message = "Nombre es obligatorio")
	private Long id;
	
	private String nombre;
	
	private String descripcion;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
}
