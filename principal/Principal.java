package principal;

import lerDados.LerProdutos;
import menu.Menu;
import menu.PainelCadastroProdutos;
import menu.PainelCadastroUsuarios;
import menu.PainelLogin;
import menu.PainelProdutos;
import produtos.Produtos;

public class Principal {

	public static void main(String[] args) {
		
		PainelLogin  log = new PainelLogin();
		Menu menu = new Menu();
		Produtos produto = new Produtos();
		PainelCadastroProdutos cadastProd = new PainelCadastroProdutos();
		PainelCadastroUsuarios cadastUser = new PainelCadastroUsuarios();
		LerProdutos lista = new LerProdutos();
		PainelProdutos dadosProd = new PainelProdutos();
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
			
			
			if(cadastProd.isExe() == false) {
				menu.menuPainel();
			}
		}else if (menu.getInfMenu() == 3) {
			
			dadosProd.verProdutos();
				
			}else {
			
				log.setExe(true);
				log.setLogin(false);
			
				log.login(); 
				menu.menuPainel();
			}
		
		}
	}