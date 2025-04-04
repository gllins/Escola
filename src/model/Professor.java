package model;

public class Professor extends Pessoa{
private String disciplina;
private String turno;

public Professor(int id, String nome, int idade) {
	super(id, nome, idade);
	// TODO Auto-generated constructor stub
}
public Professor(int id, String nome, int idade, String disciplina, String turno) {
	super(id, nome, idade);
	this.disciplina = disciplina;
	this.turno = turno;
}
public String getDisciplina() {
	return disciplina;
}
public void setDisciplina(String disciplina) {
	this.disciplina = disciplina;
}
public String getTurno() {
	return turno;
}
public void setTurno(String turno) {
	this.turno = turno;
}

}
