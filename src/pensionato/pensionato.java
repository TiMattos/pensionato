package pensionato;

import java.util.Locale;
import java.util.Scanner;

import estudante.estudante;

public class pensionato {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe a quantidade de quartos a serem alugados: ");
		
		int numQuartos = sc.nextInt();
		estudante[] estudante = new estudante[10];
		
		for (int i=0; i < numQuartos; i++) {
			sc.nextLine();
			System.out.print("Informe o nome: ");
			String name = sc.nextLine();
			System.out.println("Informe o email: ");
			String email = sc.nextLine();
			System.out.println("Informe o quarto: ");
			int quarto = sc.nextInt();
			
			estudante[quarto] = new estudante(name,email,quarto);			
		}
		
		for (int y = 0; y < estudante.length; y++) {
			if (estudante[y] != null) {
				System.out.println("Nome: " + estudante[y].getName() 
						+ " Email: " + estudante[y].getEmail()
						+ " Quarto: " + estudante[y].getQuarto());	
			}	
		}		
		sc.close();
		

	}

}
