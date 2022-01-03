package principal;

import menu.Menu;
import menu.PainelCadastroUsuarios;
import menu.PainelLogin;

public class Principal {

	public static void main(String[] args) {
		
		PainelLogin  log = new PainelLogin();
		Menu menu = new Menu();
		PainelCadastroUsuarios cadastro = new PainelCadastroUsuarios();
		
		/*
		 * teste de leitura
		 * */
		//LerFuncionario ler = new LerFuncionario();
		
		//System.out.print(ler.getNome());
		//System.out.print(ler.getSenha());
		
		/*if(log.login() == true) {
				
			menu.menuPainel();
			
		}*/if(menu.getInfMenu() == 1) {
			
			cadastro.cadastrarUsuario();
			
			log.setExe(true);
			log.setLogin(false);
		
			log.login(); 
			menu.menuPainel();
		
		}else if (menu.getInfMenu() == 2) {
				
			}else if (menu.getInfMenu() == 3) {
				
			}else {
			
				log.setExe(true);
				log.setLogin(false);
			
				log.login(); 
				menu.menuPainel();
			}
		
		}
	}



