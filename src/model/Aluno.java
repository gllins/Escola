package model;

public class Aluno extends Pessoa{
private String turma;
private String turno;
public Aluno(int id, String nome, int idade) {
	super(id, nome, idade);
	// TODO Auto-generated constructor stub
}
public String getTurma() {
	return turma;
}
public void setTurma(String turma) {
	this.turma = turma;
}
public String getTurno() {
	return turno;
}
public void setTurno(String turno) {
	this.turno = turno;
}


}
