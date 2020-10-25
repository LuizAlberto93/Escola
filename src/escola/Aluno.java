package escola;


import java.time.LocalDate;

public class Aluno extends Calculavel implements Comparable<Aluno> {

		private String nome;
		private int num_matricula;
		private LocalDate data_de_ingresso;
		private int numero_materias;
		
		public int compareTo(Aluno aluno) {	
			if (aluno.getData_de_ingresso().isAfter(this.getData_de_ingresso())) {
				return 1;
			} else if (aluno.getData_de_ingresso().isBefore(this.getData_de_ingresso())) {
				return -1;
			} else {
				return 0;
			}
		}
		
		//getters and setters
		public int getNumero_materias() {
			return numero_materias;
		}

		public void setNumero_materias(int numero_materias) {
			this.numero_materias = numero_materias;
		}

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
}
