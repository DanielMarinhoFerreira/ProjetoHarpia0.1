package principal;

import menu.Menu;
import validacao.ConsultarArquivo;

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
    	Usuario usuario = new Usuario();
    	ConsultarArquivo consulta = new ConsultarArquivo();
        	
 	
 	/*
 	 * VERIFICAR SE O NOME E SENHA INFORMADO NÃO TEM NO ARQUIVO. SE NÃO TIVER REALIZAR O CADASTRO 
 	 * 
 	 *  OBS: VERIFIAR SE O CLIENTE DIGITOU ERRADO E QUE VILTAR PARA O LOGIN PARA DIGITAR NOAVAMENTE
 	 *  OU IR PARA REALIZAR O CADASTRO. 
 	 * */
 	
 	while (gatilho) {
 		
 		menu.painelLogin();
 		consulta.consultarUsuario();
 		//usuario.consultarUsuario();
 		
 		//System.out.print(menu.getNome());
 		System.out.print(consulta.getPrimeiroDados());
 		//System.out.print(menu.getSenha());
 		System.out.print(consulta.getSegundoDados());
 		
 	if(!menu.getNome().equals(consulta.getPrimeiroDados()) && !menu.getSenha().equals(consulta.getSegundoDados())) {
        	
        menu.painelDeCadastro();
        
        
        }else { 
        	
        	gatilho = false;
        	
        	
        }
 	}
 	/*
 	 * TELA DE MENU  
 	 */
 		menu.painelDeMenu();
 		menu.informarMenu();
 		
 		if(1 == menu.getInforMenu()) {
 				
 			menu.painelDeCadastro();
 			menu.painelLogin();
 		}
 		
    }
    
}
