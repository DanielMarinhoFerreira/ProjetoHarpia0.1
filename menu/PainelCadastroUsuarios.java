package menu;

import java.util.Scanner;

import gravarDados.GravarFuncionario;

public class PainelCadastroUsuarios {

	Scanner scan = new Scanner(System.in);	
	Menu menu = new Menu();
	GravarFuncionario gravar = new GravarFuncionario();
	
	
	private String lerNome;
	private String lerSenha;
	
	public void cadastrarUsuario(){
		
		
		System.out.println("-=============== "+menu.nomeMenu[5]+ " ===================-"); 	
	    System.out.print("Nome: ");
	    lerNome = lerNome();    
	    
	    System.out.print("Senha: ");
	    lerSenha = lerSenha();
	    System.out.println("-=====================================================-");
	    
	    // METODO QUE GRAVAR LOGIN
	    gravar.gravarUsuario(lerNome, lerSenha);

	}
	
	private String lerNome(){
		lerNome = scan.nextLine();	
		return lerNome;
	}
	
	 private String lerSenha() {
		lerSenha = scan.nextLine();
		return lerSenha;
	}

}
