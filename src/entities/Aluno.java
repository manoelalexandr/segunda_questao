package entities;

public class Aluno {
	
	private int matricula;
	private String nome;
	private double nota1;
	private double nota2;
	private double notaT;
	
	public Aluno() {
		
	}
	
	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getNotaT() {
		return notaT;
	}

	public void setNotaT(double notaT) {
		this.notaT = notaT;
	}

	public double media(double nota1, double nota2,double notaT) {
		double media = (nota1*3 + nota2*3 + notaT *4)/10;
		return media;
	}
	
	public double notaFinal(double media) {
		double nota = 0;
		if(media<6) {
			nota = 6 - media;
			return nota;
		}
		return nota;
	}

	public String toString() {
		return "Aluno [matricula = " + matricula + 
				", nome = " + nome + 
				", nota1 = " + nota1 + 
				", nota2 = " + nota2 + 
				", notaT = " + notaT + "]";
	}
	
	
}
