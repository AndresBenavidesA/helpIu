package com.iudigital.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;

@Entity
@Table(name= "usuarios")
public class Usuario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5719002051941656199L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name ="username", length = 120, nullable = false)
	private String username ;
	
	@Column (name = "apellido", length=120)
	private String apellido;
	
	@Column (name = "password", length=250)
	private String password;
	
	@Column (name= "fecha_nacimiento")
	private LocalDate fechaNacimiento;
	
	@Column (columnDefinition = "Default 1")
	private Boolean enabled;
	
	@Column (name = "red_social")
	private Boolean redSocial;
	
	
	private String image;
	
	
	@PrePersist
	public void persist() {
		if(redSocial == null) {
			redSocial = false;
			
		}
		if (image == null || "".equals(image)) {
			image = "https://us.123rf.com/450wm/tuktukdesign/tuktukdesign1606/tuktukdesign160600119/59070200-icono-de-usuario-hombre-perfil-hombre-de-negocios-avatar-icono-persona-en-la-ilustraci%C3%B3n-vectorial.jpg";
		}
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}


	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}


	public Boolean getEnabled() {
		return enabled;
	}


	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}


	public Boolean getRedSocial() {
		return redSocial;
	}


	public void setRedSocial(Boolean redSocial) {
		this.redSocial = redSocial;
	}


	public String getImage() {
		return image;
	}


	public void setImage(String image) {
		this.image = image;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
