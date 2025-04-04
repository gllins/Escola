package model;

public class Administrativo extends Pessoa {
private String cargo;
private String endereço;
public Administrativo(int id, String nome, int idade) {
	super(id, nome, idade);
	// TODO Auto-generated constructor stub
}
public String getCargo() {
	return cargo;
}
public void setCargo(String cargo) {
	this.cargo = cargo;
}
public String getEndereço() {
	return endereço;
}
public void setEndereço(String endereço) {
	this.endereço = endereço;
}


}
