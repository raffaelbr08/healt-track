package br.com.healthtrack;

import java.util.Date;

import model.Exercices;
import model.Food;
import model.User;


/**
*Classe de testes unitários
*@author Rafael
*@version 1.0
*/

public class Teste {
	 public static void main(String[] args) {
		 User user = new User();
		 
		 user.setName("Rafael");
		 user.setAge("18 ");
		 user.setEmail("rafael.hp8");
		 
		 //Metodo retorna info dos usur
		 System.out.println(user.infoUser());		 
		 
		 //Construtor recebendo parametros
		 Exercices objExerc = new Exercices("Corrida", 200, 300, new Date());
		 System.out.println(objExerc.getAtividade());
		 
		 
		 Food objFood = new Food("Almoço","Arroz e feijao", 300, new Date());	
		 objFood.setAlimento("Jantar");
		 System.out.println(objFood.getAlimento());
		 
		
	}

}
