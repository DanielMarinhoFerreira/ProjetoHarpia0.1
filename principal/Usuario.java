package principal;

import menu.Menu;

public class Usuario extends Menu{
    
	private String nome;
	private String senha;
	private String email;

public String getFuncionario() {
	
	return nome + senha + email;
}
	
public String getNome() {
	return nome;
}

public String getSenha() {
	return senha;
}

public void setNome(String nome) {
	this.nome = nome;
}

public void setSenha(String senha) {
	this.senha = senha;
}
public void setFuncionario(String nome, String senha, String email) {
	this.senha = senha;
	this.nome = nome;
	this.email = email;
}

}

