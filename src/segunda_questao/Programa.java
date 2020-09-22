package segunda_questao;

import java.util.Scanner;

import entities.Aluno;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Aluno aluno = new Aluno();
		
		
		System.out.println("Informe seu nome: ");
		aluno.setNome(sc.nextLine());
		System.out.println("Informe sua matricula: ");
		aluno.setMatricula(sc.nextInt());
		System.out.println("Informe sua primeira nota: ");
		aluno.setNota1(sc.nextDouble());
		System.out.println("Informe sua segunda nota: ");
		aluno.setNota2(sc.nextDouble());
		System.out.println("Informe sua nota no trabalho: ");
		aluno.setNotaT(sc.nextDouble());
		
		System.out.println(aluno);
		
		System.out.println("Média: " + String.format("%.2f", aluno.media(aluno.getNota1(), aluno.getNota2(), aluno.getNotaT()))); 
		
		System.out.println("Precisa de: " + aluno.notaFinal(aluno.media(aluno.getNota1(), aluno.getNota2(), aluno.getNotaT())));
		
		
		
		
		
		sc.close();
	}

}
