package model;

import java.util.Date;

/**
 * Classe model para Peso do usuario
 * @author Rafael
 * @sinse  1.0
 * @version 1.0
 * 
 *
 */

public class Weight {
	private int peso;
	private float imc;
	private String status;
	private Date data;
	
	public Weight(int peso, float imc, String status, Date data) {
		super();
		this.peso = peso;
		this.imc = imc;
		this.status = status;
		this.data = data;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public float getImc() {
		return imc;
	}

	public void setImc(float imc) {
		this.imc = imc;
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
