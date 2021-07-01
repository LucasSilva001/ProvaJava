package br.com.Curso;

import java.util.List;
import java.util.Scanner;

public class CursoController {
	
	private Scanner tec;
	
	public CursoController() {
		tec = new Scanner(System.in);
	}
	
	public int leOpcao() {
		System.out.println("> ");
		return tec.nextInt();
	}
	
	public Curso cadastrarCurso() {
		Curso curso = new Curso();
		
		System.out.println("--- Cadastrar Curso ---");
		System.out.println("Informe o nome do curso: ");
		tec.nextLine();
		curso.setNomeCurso(tec.next());
		
		return curso;
		
	}
	
	public List<Curso> listarCursos(List<Curso> cursos) {
		
		if(cursos.isEmpty()) {
			System.out.println(" Não possui dados cadastrados!!");
			return null;
		}
		System.out.println("--- Cursos cadastrados ---");
		
		System.out.printf("| %12s", "Curso");
		
		for(int i = 0; i < cursos.size(); i++) {
			System.out.printf("| 12s",
			i + 1,
			cursos.get(i).getNomeCurso());
		}
		
		return cursos;
	}
	
	public List<Curso> editarCurso(List<Curso> cursos) {
		
		Curso curso = new Curso();
		listarCursos(cursos);
		
		if(cursos.isEmpty()) {
			System.out.println("Não possui dados cadastrados");
			return null;
		}
		
		System.out.println("Insira o Id do curso para editar: ");
		int idCurso = tec.nextInt() - 1;
		
		System.out.println("1) Curso");
		
		int opcao = tec.nextInt();
		
		switch(opcao) {
		
		case 1:
			System.out.println("Editar o nome do Curso");
			System.out.println("Insira o novo nome: ");
			tec.nextLine();
			curso.setNomeCurso(tec.next());
			
			cursos.set(idCurso, curso);
			
			break;
		
		default:
			System.out.println("Opção Inválida!!");
			break;
				
		}
		
		return cursos;
		
	}
	
	public void excluirCurso(List<Curso> cursos) {
		
		listarCursos(cursos);
		
		if(cursos.isEmpty()) {
			System.out.println("Sem dados cadastrados!!");
			return;
		}
		
		System.out.println("--- Excluir Curso ---");
		System.out.println("Selecione o Id do Curso a ser editado: ");
		int idCurso = tec.nextInt() - 1;
		
		if(cursos.size() <= idCurso) {
			System.out.println("Curso não cadastrado");
			return; 
		}
		
		cursos.remove(idCurso);
	}
	
	public void menu(List<Curso> cursos) {
		
		System.out.println("\nMenu");
		System.out.println("1) Cadastrar Curso");
		System.out.println("2) Listar Curso");
		System.out.println("3) Editar Curso");
		System.out.println("4) Excluir Curso");
		
		boolean sair = false;
		
		do {
			
			int opcao = tec.nextInt();
		
		switch(opcao) {
		case 1:
			cursos.add(cadastrarCurso());
			break;
		
		case 2:
			listarCursos(cursos);
			break;
			
		case 3:
			editarCurso(cursos);
			break;
		
		case 4:
			excluirCurso(cursos);
			break;
		
		default:
			System.out.println("Opção Inválida!!");
			break;
		}
		
		} while(!sair);
	
	}

}
