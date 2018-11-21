package helloworld;

import java.util.Scanner;

public class Lecture {
	// acquisition depuis le clavier
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);

		int n = 0;

		System.out.print("Entrez un nombre: ");
		n = clavier.nextInt();

		System.out.println("Le carré de " + n + " est " + (n * n));
	}

}
