package principal;

import EntradaDados.GravarUsuarios;
import menu.Menu;
<<<<<<< Updated upstream
import validacao.ConsultarArquivo;
=======
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
			
			if(cadastProd.isExe() == false) {
				menu.menuPainel();
			}
		}else if (menu.getInfMenu() == 3) {
			
			lista.lerDadosFuncionario();
			System.out.print(lista.getListProdutos());
			lista.listId();	
				
			}else {
			
				log.setExe(true);
				log.setLogin(false);
			
				log.login(); 
				menu.menuPainel();
			}
		
		}
	}


>>>>>>> Stashed changes

/*
 * AUTOR : Daniel Marinho 
 * GITHUB: DanielMarinhoFerreira
 * E-mail: daniel.marinho.ferreira1@gmail.com
 * */
public class Principal{
	
    public static void main(String[] args) {
    	
    	boolean gatilho = true;
/*
 * INICIALIZAR OS OBJTOS DAS CASSES 
 * */	
    	Menu menu = new Menu();
    	GravarUsuarios gravar = new GravarUsuarios();
    	ConsultarArquivo consulta = new ConsultarArquivo();
    	     		
 /*
  * VERIFICAR SE O NOME E SENHA INFORMADO NÃO TEM NO ARQUIVO. 
  *  OBS: VERIFIAR SE O CLIENTE DIGITOU ERRADO E QUE VILTAR PARA O LOGIN PARA DIGITAR NOAVAMENTE
  *  OU IR PARA REALIZAR O CADASTRO. 
  * */
    	while (gatilho) {	
 		
        	menu.painelLogin();
        	consulta.consultarArquivo("src\\dados\\Funcionario.txt");
        	
        	System.out.print(consulta.getPrimeiroDados());
        	System.out.print(consulta.getSegundoDados());
 		
 		if(menu.getNome().equals(consulta.getPrimeiroDados()) && menu.getSenha().equals(consulta.getSegundoDados())) {
 			
 			gatilho = false;	
 		}
 	}
 		
 		menu.painelDeMenu();
 		menu.informarMenu();
 		
 		if (menu.getInforMenu() == 1) {
 			menu.painelDeCadastro();
 			
 		}else if (menu.getInforMenu() == 2) {
 			menu.painelDePedido();
 			
 		}else if (menu.getInforMenu() == 3) {
 			menu.painelNota();
 			
 		}
 	}
 		
    }
