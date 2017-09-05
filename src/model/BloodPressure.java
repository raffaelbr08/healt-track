package model;

import java.io.Serializable;
import java.util.Date;

/**
 * Classe model para Pressao Arterial do usuario
 * @author Rafael
 * @sinse  1.0
 * @version 1.0
 * 
 *
 */

public class BloodPressure implements Serializable{	
	
	private static final long serialVersionUID = 1L;
	
	User user = new User();
	
	private float presSistolica;
	private float presDiastolica;
	private String status;
	private Date data;
	
	public BloodPressure(float presSistolica, float presDiastolica, String status, Date data) {
		super();
		this.presSistolica = presSistolica;
		this.presDiastolica = presDiastolica;
		this.status = status;
		this.data = data;
	}

	public float getPresSistolica() {
		return presSistolica;
	}

	public void setPresSistolica(float presSistolica) {
		this.presSistolica = presSistolica;
	}

	public float getPresDiastolica() {
		return presDiastolica;
	}

	public void setPresDiastolica(float presDiastolica) {
		this.presDiastolica = presDiastolica;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
	
	
	
	
	
}
