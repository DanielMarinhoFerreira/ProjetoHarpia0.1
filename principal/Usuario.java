package principal;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import menu.Menu;
import validacao.ConsultarArquivo;

public class Usuario {
    
	private String login;
	private String senha;

/*
  * DANIEL -> VERIFICA CADASTRO DO USU¡RIO ANTES DE INSERIR NO ARQUIVO (USUARIO.TXT)
  * */
public void cadastrarUsuario(String nome ,String pass) {
	
	PrintWriter arquivo = null;  
	login = nome;
	senha = pass;

	try {
		
		FileWriter arquivoUsuario = new FileWriter("src\\dados\\usuario.txt", true);
		arquivo = new PrintWriter(arquivoUsuario);
           
          arquivo.println(login);
          arquivo.println(senha);
          
       } catch(IOException e){
           System.out.println("Erro ao cadastrar"+ e.getMessage());
           
       }catch (NullPointerException e) {
           System.out.println("Erro! O login e senha n√£o podem estar vazios.");
           
       }finally {
           arquivo.close();
       }
    }

public String getLogin() {
	return login;
}

public String getSenha() {
	return senha;
}

public void setLogin(String login) {
	this.login = login;
}

public void setSenha(String pass) {
	this.senha = pass;
}

}

