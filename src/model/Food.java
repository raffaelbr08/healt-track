package model;

import java.io.Serializable;
import java.util.Date;

/**
 * Classe model para Alimentação do usuario
 * @author Rafael
 * @sinse  1.0
 * @version 1.0
 * 
 *
 */

public class Food implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	
	private String typeFood;
	private String descFood;
	private float calorias;
	private Date Data;
	
	public Food(String alimento, String descFood, float calorias, Date data) {
		super();
		this.typeFood = alimento;
		this.descFood = descFood;
		this.calorias = calorias;
		Data = data;
	}

	public String getAlimento() {
		return typeFood;
	}

	public void setAlimento(String alimento) {
		this.typeFood = alimento;
	}

	public float getCalorias() {
		return calorias;
	}

	public void setCalorias(float calorias) {
		this.calorias = calorias;
	}

	public Date getData() {
		return Data;
	}

	public void setData(Date data) {
		Data = data;
	}

	public String getDescFood() {
		return descFood;
	}

	public void setDescFood(String descFood) {
		this.descFood = descFood;
	}
	
	
	
	
}
