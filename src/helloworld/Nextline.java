package helloworld;

import java.util.Scanner;

public class Nextline {

	static Scanner clavier = new Scanner(System.in);

	public static void main(String[] args) {
		// création d'un entier et 2 chaines de caractères
		int n = 0;
		String str1 = "";
		String str2 = "";

		// je demande à l'utilisateur d'entrer un entier que je stocke dans n

		System.out.println("Entrez un entier : ");
		n = clavier.nextInt();
		clavier.nextLine();

		System.out.println("Entrez du texte 1 : ");
		str1 = clavier.nextLine();

		System.out.println("Entrez du texte 2 : ");
		str2 = clavier.nextLine();

		System.out.println("n = " + n);
		System.out.println("str1 : " + str1);
		System.out.println("str2 :  " + str2);

	}

}
