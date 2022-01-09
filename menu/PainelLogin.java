package menu;

import java.util.Scanner;
import lerDados.LerFuncionario;

public class PainelLogin {
	
	boolean exe = true; // VARIAVEL PARA CONDIÇÃO DE LOOP DO LOGIN
	Menu menu = new Menu();
	Scanner scan = new Scanner(System.in);

	private String lerSenha = null;
	private String lerNome = null;

	LerFuncionario lerDados = new LerFuncionario();
	
	public String lerNome(){ // FUNÇÃO QUE LER NOME 
		lerNome = scan.nextLine();	
		return lerNome;
	}
	
	public String lerSenha() { // FUNÇÃO QUE LER SENHA
		lerSenha = scan.nextLine();
		return lerSenha;
	}
	
//============================================ Login ========================================================	
	
	public boolean login() {
		
		lerDados.lerDadosFuncionario(); // REALIZAR A LEITURA DOS DADOS
		
		while (exe) {
		
			System.out.println("-===================== "+menu.nomeMenu[0]+ " =========================-"); 	
			System.out.print("Nome: ");
			lerNome();    
		
			System.out.print("Senha: ");
			lerSenha();
			System.out.println("-=====================================================-");
			
			lerDados.validaLogin(lerNome, lerSenha);
			
			/*
			 * VERIFICAR OS USUÁRIO DENTRO QUE UM ARQUIVO, RETORNA SE LOGIN É VERDADEIRO. 
			 * CONDIÇÃO DE PARA DA DO LOOP
			 * */
			
			if(getLerNome().equals(lerDados.getNome()) && getLerSenha().equals(lerDados.getSenha())) {
		
				exe = false;
				login = true;
				
				}	
			}
			
		return login;
		
	}			
	
	public String getLerSenha() {
		return lerSenha;
	}

	public String getLerNome() {
		return lerNome;
	}
	
	public boolean isLogin() {
		return login;
	}
	
	public void setLogin(boolean login) {
		this.login = login;
	}
	
	public boolean isExe() {
		return exe;
	}
	
	public void setExe(boolean exe) {
		this.exe = exe;
	}
	
	boolean login = false;
	
//===========================================================================================================
	
}
