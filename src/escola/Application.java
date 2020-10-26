package escola;

import java.time.LocalDate;
import java.util.Scanner;

public class Application {
	static Aluno[] aluno;

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		aluno = new Aluno[8];

		for (int i = 0; i < 2; i++) {

			in.nextLine();
			System.out.println("Nome do aluno " + (i + 1) + ": ");
			String nome = in.nextLine();

			System.out.println("Matricula: ");
			int matricula = in.nextInt();

			System.out.println("Data de Ingresso: ");
			String dataDeIngressostr = in.nextLine();

			LocalDate dataDeIngresso = LocalDate.parse(dataDeIngressostr, formatter);

			aluno[i] = new Aluno(nome, matricula, dataDeIngresso);

		}
	}

}
