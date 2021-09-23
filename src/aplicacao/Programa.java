package aplicacao;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa(1, "Edson Rego", "edsonxrego@gmail.com");
		Pessoa p2 = new Pessoa(2, "Eva Alves", "evanusiaalves@gmail.com");
		Pessoa p3 = new Pessoa(3, "Camilly Alves", "camillyalvesrego@gmail.com");
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
		

	}

}
