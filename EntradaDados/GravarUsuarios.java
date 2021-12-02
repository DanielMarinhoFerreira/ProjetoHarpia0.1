package EntradaDados;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import menu.Menu;

public class GravarUsuarios {

	Menu menu = new Menu();
	
	String nome;
	String senha;
	
	public void gravarUsuario(String nome, String senha) { // METODO QUE GRAVAR O ARQUIVO 
		
		PrintWriter grava = null;
		this.nome = nome;
		this.senha = senha;
		
		try {
			
		FileWriter arquivo = new FileWriter("src\\dados\\Funcionario.txt", true); // PRODURA O CAMINHO DO ARQUIVO E SE NÃO TIVER GERA O ARQUIVO
 
		grava = new PrintWriter(arquivo); // GRAVAR OS DADOS NO ARQUIVO
	
		grava.printf("%n"+this.nome+"%n"+this.senha+"%n"); // GRAVAR "NOME" E "SENHA", FORMATADA 
		
		
		}catch(IOException erro){
		
			System.out.print("erro! arquivo não encontrado"+ erro.getMessage());
	}finally {
		
		grava.close(); // FECHA A PASTA 
	}
}

}
