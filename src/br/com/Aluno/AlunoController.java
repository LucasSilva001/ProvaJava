package br.com.Aluno;

import java.util.List;
import java.util.Scanner;

public class AlunoController {
	
	private Scanner tec;
	
	public AlunoController() {
		tec = new Scanner(System.in);
	}
	
	public int leOpcao() {
		System.out.println("> ");
		return tec.nextInt();
	}
	
	public Aluno cadastrarAluno() {
		Aluno aluno = new Aluno();
		
		System.out.println("--- CADASTRAR ALUNOS ---");
		System.out.println("Informe o nome do aluno: ");
		tec.nextLine();
		aluno.setNomeAluno(tec.nextLine());
		
		System.out.println("Informe o Ano de Nascimento: ");
		aluno.setAnoDeNascimento(tec.nextInt());
		
		System.out.println("informe o curso do aluno: ");
		aluno.setCurso(tec.next());
		
		System.out.println("Informe o Pais: ");
		aluno.setPais(tec.next());
		
		System.out.println("Informe o Estado");
		aluno.setEstado(tec.next());
		
		System.out.println("Informe a Cidade");
		aluno.setCidade(tec.next());
		
		return aluno;
	}
	
	public List<Aluno> ListarAlunos(List<Aluno> alunos) {
		
		if(alunos.isEmpty()) {
			System.out.println("Não possui dados cadastrados");
			return null;
		}
		System.out.println("--- Alunos Cadastrados ---");
		
		System.out.printf("| %15s | %12s | %6s | %15s | %14s | %15s | %12s", "Nome", "AnoDeNascimento", "Idade", "Curso", "Pais", "Estado", "Cidade");
		
		for(int i = 0; i < alunos.size(); i++) {
			System.out.printf("| %15s | %4d | %2d | %15s | %14s | %16s | %16s",
			i + 1,
			alunos.get(i).getNomeAluno(),
			alunos.get(i).getAnoDeNascimento(),
			alunos.get(i).getIdadeAluno(),
			alunos.get(i).getCurso(),
			alunos.get(i).getPais(),
			alunos.get(i).getEstado(),
			alunos.get(i).getCidade());
			
		}
		
		return alunos;
	}
	
	public List<Aluno> EditarAluno(List<Aluno> alunos) {
		
		Aluno aluno = new Aluno();
		ListarAlunos(alunos);
		
		if(alunos.isEmpty()) {
			return null;
		}
		
		System.out.println("informe o id do aluno para editar: ");
		int idAluno = tec.nextInt() - 1;
		
		System.out.println("1) Nome do Aluno");
		System.out.println("2) Ano de Nascimento");
		System.out.println("3) Curso do Aluno");
		System.out.println("4) Pais");
		System.out.println("5) Estado");
		System.out.println("6) Cidade");
		
		int opcao = tec.nextInt();
		
		switch(opcao) {
		case 1:
			System.out.println("Editar o nome do aluno");
			System.out.println("Insira o novo nome: ");
			tec.nextLine();
			aluno.setNomeAluno(tec.next());
			
			aluno.setAnoDeNascimento(alunos.get(idAluno).getAnoDeNascimento());
			aluno.setCurso(alunos.get(idAluno).getCurso());
			aluno.setPais(alunos.get(idAluno).getPais());
			aluno.setEstado(alunos.get(idAluno).getEstado());
			aluno.setCidade(alunos.get(idAluno).getCidade());
			
			alunos.set(idAluno, aluno);
			
			break;
		
		case 2:
			System.out.println("Editar o Ano de Nascimento ");
			System.out.println("Insira o novo Ano: ");
			aluno.setAnoDeNascimento(tec.nextInt());
			
			aluno.setNomeAluno(alunos.get(idAluno).getNomeAluno());
			aluno.setCurso(alunos.get(idAluno).getCurso());
			aluno.setPais(alunos.get(idAluno).getPais());
			aluno.setEstado(alunos.get(idAluno).getEstado());
			aluno.setCidade(alunos.get(idAluno).getCidade());
			
			alunos.set(idAluno, aluno);
			
			break;
		
		case 3:
			System.out.println("Editar o nome do curso");
			System.out.println("Insira o novo curso: ");
			tec.nextLine();
			aluno.setCurso(tec.next());
			
			aluno.setNomeAluno(alunos.get(idAluno).getNomeAluno());
			aluno.setAnoDeNascimento(alunos.get(idAluno).getAnoDeNascimento());
			aluno.setPais(alunos.get(idAluno).getPais());
			aluno.setEstado(alunos.get(idAluno).getEstado());
			aluno.setCidade(alunos.get(idAluno).getCidade());
			
			alunos.set(idAluno, aluno);
			
			break;
		
		case 4:
			System.out.println("Editar o Pais");
			System.out.println("Insira o novo Pais: ");
			tec.nextLine();
			aluno.setPais(tec.next());
			
			aluno.setNomeAluno(alunos.get(idAluno).getNomeAluno());
			aluno.setAnoDeNascimento(alunos.get(idAluno).getAnoDeNascimento());
			aluno.setCurso(alunos.get(idAluno).getCurso());
			aluno.setEstado(alunos.get(idAluno).getEstado());
			aluno.setCidade(alunos.get(idAluno).getCidade());
			
			alunos.set(idAluno, aluno);
			
			break;
		
		case 5:
			System.out.println("Editar o Estado");
			System.out.println("Insira o novo Estado");
			tec.nextLine();
			aluno.setEstado(tec.next());
			
			aluno.setNomeAluno(alunos.get(idAluno).getNomeAluno());
			aluno.setAnoDeNascimento(alunos.get(idAluno).getAnoDeNascimento());
			aluno.setCurso(alunos.get(idAluno).getCurso());
			aluno.setPais(alunos.get(idAluno).getPais());
			aluno.setCidade(alunos.get(idAluno).getCidade());
			
			alunos.set(idAluno, aluno);
			
			break;
			
		case 6:
			System.out.println("Editar a Cidade");
			System.out.println("Insira a nova Cidade: ");
			tec.nextLine();
			aluno.setCidade(tec.next());
			
			aluno.setNomeAluno(alunos.get(idAluno).getNomeAluno());
			aluno.setAnoDeNascimento(alunos.get(idAluno).getAnoDeNascimento());
			aluno.setCurso(alunos.get(idAluno).getCurso());
			aluno.setPais(alunos.get(idAluno).getPais());
			aluno.setEstado(alunos.get(idAluno).getEstado());
			
			alunos.set(idAluno, aluno);
			
			break;
		
		default:
			System.out.println("Opção Inválida!!");
			break;
		
		}
		
		return alunos;
	}
	
	public void excluirAluno(List<Aluno> alunos) {
		
		ListarAlunos(alunos);
		
		if(alunos.isEmpty()) {
			System.out.println("Sem dados cadastrados");
			return;
		}
	
		System.out.println("--- Excluir Aluno ---");
		System.out.println("Selecione o Id do aluno a ser excluída: ");
		int idAluno = tec.nextInt() - 1;
		
		if(alunos.size() <= idAluno) {
			System.out.println("Aluno não cadastrado!!");
			return;
		}
		
		alunos.remove(idAluno);
		
	}
	
	public void menu(List<Aluno> alunos) {
		
		System.out.println("\nMenu");
		System.out.println("1) Cadastrar Aluno");
		System.out.println("2) Listar Aluno");
		System.out.println("3) Editar Aluno");
		System.out.println("4) Excluir Aluno");
		System.out.println("Escolha a opção desejada: ");
		
		boolean sair = false;
		
		do {
			
			int opcao = tec.nextInt();
			
		switch(opcao) {
		
		case 1:
			alunos.add(cadastrarAluno());
			break;
		
		case 2:
			ListarAlunos(alunos);
			break;
		case 3:
			EditarAluno(alunos);
			break;
		case 4:
			excluirAluno(alunos);
			break;
		}
		} while(!sair);
			
	}

}
