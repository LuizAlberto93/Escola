package escola;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;
import java.util.Arrays;

public class Aluno implements Comparable<Aluno> {
	private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy")
			.withResolverStyle(ResolverStyle.STRICT);

	private String nome;
	private int num_matricula;
	private LocalDate data_de_ingresso;

	public Aluno() {

	}

	public Aluno(String nome, int num_matricula, LocalDate data_de_ingresso) {
		super();
		this.nome = nome;
		this.num_matricula = num_matricula;
		this.data_de_ingresso = data_de_ingresso;
	}

	public int compareTo(Aluno aluno) {
		if (aluno.getData_de_ingresso().isAfter(this.getData_de_ingresso())) {
			return 1;
		} else if (aluno.getData_de_ingresso().isBefore(this.getData_de_ingresso())) {
			return -1;
		} else {
			return 0;
		}
	}

	public <T extends Comparable<Aluno>> void ordenarVetor(T vet[]) {
		Arrays.sort(vet);
	}

	// getters and setters

	public void setData_de_ingresso(LocalDate data_de_ingresso) {
		this.data_de_ingresso = data_de_ingresso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNum_matricula() {
		return num_matricula;
	}

	public void setNum_matricula(int num_matricula) {
		this.num_matricula = num_matricula;
	}

	public LocalDate getData_de_ingresso() {
		return data_de_ingresso;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome 
				+ ", num_matricula=" 
				+ num_matricula + ", data_de_ingresso="
				+ data_de_ingresso.format(formatter) + "]";
	}

}
