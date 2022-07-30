package com.iudigital.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.JoinColumn;


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
	
	@Column(name ="username", length = 120, nullable = false, unique = true)
	private String username ;
	
	@Column(name = "nombre", length = 120, nullable = false)
	private String nombre;
	
	@Column (name = "apellido", length=120)
	private String apellido;
	
	@Column (name = "password", length=250)
	private String password;
	
	@Column (name= "fecha_nacimiento")
	private LocalDate fechaNacimiento;
	
	//@Column (columnDefinition = "Default 1")
	private Boolean enabled;
	
	@Column (name = "red_social")
	private Boolean redSocial;
	
	
	private String image;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "roles_usuarios", 
			  joinColumns = {
					  @JoinColumn(name = "usuarios_id")
			  },
			  inverseJoinColumns = {
					  @JoinColumn(name = "roles_id")
			  })
	private List<Role> roles;
	
	@PrePersist
	public void persist() {
		if(enabled == null) {
			enabled = true;
		}
		if(redSocial == null) {
			redSocial = false;
		}
		if(image == null || "".equals(image)) {
			image = "https://happytravel.viajes/wp-content/uploads/2020/04/146-1468479_my-profile-icon-blank-profile-picture-circle-hd.png";
		}
	}
	
	
	public List<Role> getRoles() {
		return roles;
	}


	public void setRoles(List<Role> roles) {
		this.roles = roles;
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


		
	
	
}
