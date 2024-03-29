package br.com.Aluno;

import java.util.Calendar;

import br.com.Endereco.Endereco;

public class Aluno extends Endereco {
	private String nomeAluno;
	private int anoDeNascimento;
	private int idadeAluno;
	private String curso;
	public String getNomeAluno() {
		return nomeAluno;
	}
	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}
	public int getAnoDeNascimento() {
		return anoDeNascimento;
	}
	public void setAnoDeNascimento(int anoDeNascimento) {
		this.anoDeNascimento = anoDeNascimento;
		setIdadeAluno();
	}
	public int getIdadeAluno() {
		return idadeAluno;
	}
	public void setIdadeAluno() {
		Calendar calendar = Calendar.getInstance();
		this.idadeAluno = calendar.get(Calendar.YEAR) - getAnoDeNascimento();
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	
	
	

}
