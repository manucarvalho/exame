package exame;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PessoaExame_App {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		List<Pessoa_Classe> listaPessoa = new ArrayList<Pessoa_Classe>();
		List<Exame1_Classe> listaExame = new ArrayList<Exame1_Classe>();
		
		Pessoa_Classe pessoa = new Pessoa_Classe(11, "Pedro Guerra");
		Exame1_Classe exame = new Exame1_Classe("glicose", 90, pessoa);
		listaPessoa.add(pessoa);
		listaExame.add(exame);
		
		pessoa = new Pessoa_Classe(12, "Amanda Gois");
		exame = new Exame1_Classe("glicose", 110, pessoa);
		listaPessoa.add(pessoa);
		listaExame.add(exame);
		
		pessoa = new Pessoa_Classe(13, "Juliana Silva");
		exame = new Exame1_Classe("glicose", 130, pessoa);
		listaPessoa.add(pessoa);
		listaExame.add(exame);
		
		for (int j=0; j< listaExame.size(); j++) {
			for (int i=0; i< listaPessoa.size(); i++) {
				if (listaPessoa.get(i).getDiabetes() == null) {
					listaPessoa.get(i).setDiabetes(listaExame.get(j));
					break;
				}									
			}			
		}
		
		for (Exame1_Classe e : listaExame) {
			System.out.println(e);
		}	
		
		System.out.println();
		
		for (Pessoa_Classe p : listaPessoa) {
			System.out.println(p);
		}		
		
				
		ler.close();

	}

}
