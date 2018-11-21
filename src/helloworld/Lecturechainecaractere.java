package helloworld;

import java.util.Scanner;

public class Lecturechainecaractere {
	static Scanner clavier = new Scanner(System.in);

	public static void main(String[] args) {
		double var = 0.0;
		System.out.print("Entrer un nombre réél : ");
		var = clavier.nextDouble();

		System.out.println("Vous avez tapé : " + var);

	}

}
