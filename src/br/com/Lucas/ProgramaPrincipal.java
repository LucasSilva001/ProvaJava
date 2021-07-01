package br.com.Lucas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.Aluno.Aluno;
import br.com.Aluno.AlunoController;
import br.com.Curso.Curso;
import br.com.Curso.CursoController;

public class ProgramaPrincipal {
	
	public static void main(String[] args) {
		List<Aluno> alunos = new ArrayList<Aluno>();
		List<Curso> cursos = new ArrayList<Curso>();
		
		AlunoController alunoController = new AlunoController();
		CursoController cursoController = new CursoController();
		
		boolean sair = false;
		
		do {
			menu();
			
			int opcao = alunoController.leOpcao();
			
			switch(opcao) {
			
			case 1:
				alunoController.menu(alunos);
				break;
			
			case 2:
				cursoController.menu(cursos);
				break;
			
			case 0:
				sair = true;
				break;
			
			default:
				System.out.println("Opção Inválida");
				break;
			}
			
		} while(!sair);
		
		
	}
	private Scanner tec;
	
	public ProgramaPrincipal() {
		tec = new Scanner(System.in);
	}
	
	public int leOpcao() {
		System.out.println("> ");
		return tec.nextInt();
	}
	
	public static void menu() {
		System.out.println("Menu");
		System.out.println("1) Aluno");
		System.out.println("2) Curso");
		System.out.println("0) Sair do sistema");
		
		System.out.println("Informe a opção desejada: ");
		
			}
	
	
}
