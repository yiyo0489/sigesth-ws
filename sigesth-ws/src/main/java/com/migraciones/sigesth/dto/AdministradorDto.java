package com.migraciones.sigesth.dto;

import java.io.Serializable;

public class AdministradorDto implements Serializable {

	private static final long serialVersionUID = 1L;
	private String cedula;
	private String username;
	private String password;
	private int tipo;

	public AdministradorDto() {
	}

	public AdministradorDto(String cedula, String username, String password, int tipo) {
		this.cedula = cedula;
		this.username = username;
		this.password = password;
		this.tipo = tipo;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

}
