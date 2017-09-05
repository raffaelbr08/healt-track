package model;

import java.io.Serializable;
import java.util.Date;

/**
 * Classe model para Atividades fisicas do usuario
 * @author Rafael
 * @sinse  1.0
 * @version 1.0
 * 
 *
 */

public class Exercices implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String atividade;
	private float tempAtividade;
	private float calGasta;
	private Date data;
	
	public Exercices(String atividade, float tempAtividade, float calGasta, Date data) {
		super();
		this.atividade = atividade;
		this.tempAtividade = tempAtividade;
		this.calGasta = calGasta;
		this.data = data;
	}	


	public String getAtividade() {
		return atividade;
	}

	public void setAtividade(String atividade) {
		this.atividade = atividade;
	}

	public float getTempAtividade() {
		return tempAtividade;
	}

	public void setTempAtividade(float tempAtividade) {
		this.tempAtividade = tempAtividade;
	}

	public float getCalGasta() {
		return calGasta;
	}

	public void setCalGasta(float calGasta) {
		this.calGasta = calGasta;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	
	
	
	
}
