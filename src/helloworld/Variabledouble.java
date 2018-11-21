package helloworld;

import java.util.Scanner;

public class Variabledouble {
	static Scanner clavier = new Scanner(System.in);

	public static void main(String[] args) {
		String s;
		System.out.print("Entrez du texte : ");
		s = clavier.nextLine();

		System.out.println("Vous avez écrit : " + s);
	}

}