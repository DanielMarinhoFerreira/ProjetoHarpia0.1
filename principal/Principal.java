package principal;

import lerDados.LerProdutos;
import menu.Menu;
import menu.PainelCadastroProdutos;
import menu.PainelCadastroUsuarios;
import menu.PainelLogin;
import produtos.Produtos;

public class Principal {

	public static void main(String[] args) {
		
		PainelLogin  log = new PainelLogin();
		Menu menu = new Menu();
		Produtos produto = new Produtos();
		PainelCadastroProdutos cadastProd = new PainelCadastroProdutos();
		PainelCadastroUsuarios cadastUser = new PainelCadastroUsuarios();
		LerProdutos lista = new LerProdutos();
		
		if(log.login() == true) {
				
			menu.menuPainel();
			
		}if(menu.getInfMenu() == 1) {
			
			cadastUser.cadastrarUsuario();
			
			log.setExe(true);
			log.setLogin(false);
		
			log.login(); 
			menu.menuPainel();
		
		}else if (menu.getInfMenu() == 2) {
				
			cadastProd.cadastrarProduto();
			
			//System.out.print(lista.lerId());
			
			if(cadastProd.isExe() == false) {
				menu.menuPainel();
			}
		}else if (menu.getInfMenu() == 3) {
			
			lista.lerDadosProdutos();
			System.out.print(lista.getListProdutos());
			//lista.lerDadosProdutos();
			
				
			}else {
			
				log.setExe(true);
				log.setLogin(false);
			
				log.login(); 
				menu.menuPainel();
			}
		
		}
	}



