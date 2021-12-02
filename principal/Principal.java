package principal;

import EntradaDados.GravarUsuarios;
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
    	GravarUsuarios gravar = new GravarUsuarios();
    	ConsultarArquivo consulta = new ConsultarArquivo();
    	
        		
 	/*
 	 * VERIFICAR SE O NOME E SENHA INFORMADO NÃO TEM NO ARQUIVO.
 	 * 
 	 *  OBS: VERIFIAR SE O CLIENTE DIGITOU ERRADO E QUE VILTAR PARA O LOGIN PARA DIGITAR NOAVAMENTE
 	 *  OU IR PARA REALIZAR O CADASTRO. 
 	 * */
        while (gatilho) {	
 		
        	menu.painelLogin();
        	consulta.consultarArquivo("src\\dados\\Funcionario.txt");
 		
 		if(menu.getNome().equals(consulta.getPrimeiroDados()) && menu.getSenha().equals(consulta.getSegundoDados())) {
 			
 			gatilho = false;	
 		}
 		
 		menu.painelDeMenu();
 		menu.informarMenu();
 		
 		if (menu.getInforMenu() == 1) {
 			
 			menu.painelDeCadastro();
 		}
 	}
 		//gravar.gravarUsuario(menu.getNome(), menu.getSenha());  
 		//("src\\dados\\usuario.txt"); 
    }
    
}
