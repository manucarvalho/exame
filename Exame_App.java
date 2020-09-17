package exame;

import java.util.Scanner;

public class Exame_App {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int idExame;
		String tipoExame;
		int nivelGlicose;
		Exame_Classe exame;
		
		System.out.println("Dados do exame:");
		System.out.print("id do exame: ");
		idExame = ler.nextInt();
		ler.nextLine();
		System.out.print("tipo do exame: ");
		tipoExame = ler.nextLine();
		System.out.print("nível de glicose: ");
		nivelGlicose = ler.nextInt();
		
		exame = new Exame_Classe(idExame, tipoExame, nivelGlicose);
		
		System.out.print("\nDiagnostico: " + exame.obterDiagnostico());
				
		ler.close();
	}

}
