package menu;

import java.util.Scanner;
import principal.Usuario;
import validacao.ConsultarArquivo;

/*
 * AUTOR : Daniel Marinho 
 * GITHUB: DanielMarinhoFerreira
 * E-mail: daniel.marinho.ferreira1@gmail.com
 * */
public class Menu {
	
	//ConsultarArquivo consulta = new ConsultarArquivo();
   private String nome = null;
   private String senha = null;
   private int inforMenu;
   String cadastNome = null;
   String cadastSenha = null;
   Scanner scan = new Scanner(System.in);
   
 //=============================== MENU DO SISTEMA ===================================
 public void painelDeMenu() {
	 
	 System.out.println("-===================== MENU ==========================-"+"\n");
	 System.out.println("-= CADASTRAR USUARIO [1]: ============================-");
	 System.out.println("-= REALIZAR PEDIDO   [2]: ============================-");
	 System.out.println("-= NOTA FILCAL       [3]: ============================-");
	 System.out.println("-= SAIR              [4]: ============================-"+"\n");
	 System.out.println("-=====================================================-");
	 System.out.print("Informe qual rotina gostaria de acessar: ");
   } 
public int informarMenu() { 
 
	inforMenu = scan.nextInt();
	
	return inforMenu;
 }
 public int getInforMenu() {
	return inforMenu;
}

public void setInforMenu(int inforMenu) {
	this.inforMenu = inforMenu;
}

//============================== PAINEL DE PEDIDOS ====================================
public void painelDePedido() {
	
	System.out.println("-=================== REALIZAR PEDIDO ==================-"+"\n");
	System.out.println("-= TESTE01 ============================ [1]:");
	System.out.println("-= TESTE02 ============================ [2]:");
	System.out.println("-= TESTE03 ============================ [3]:");
	System.out.println("-= SAIR =============================== [4]:");
		
}

//============================== PAINEL DE CADASTRO ====================================
public void painelDeCadastro() {
	
	boolean gatilhoCadastro = true;
	
	while (gatilhoCadastro) {
	 System.out.println("-============== CADASTRAR USUARIO: ===================-");
	 System.out.print("Nome: ");
	 cadastNome = scan.nextLine();

     System.out.print("Senha: ");
     cadastSenha = scan.nextLine();
     
     /* 
      * DANIEL -> CONDIÇÃO QUE VERIFICAR SE INSERIRAM VALORES VAZIO NO LOGIN E SENHA SENDO QUE SE UM OU OUTRO FOR VAZIO 
      * RETORNA A REALIZAR O NOME E SENHA. 
     * */ 
      if (cadastNome.equals("") || cadastSenha.equals("")) {
  	  
      	System.out.println("Erro!, inofrmar um usuário.");
      }else {
      	
    	  gatilhoCadastro = false; 	
      }      
	}	
}
//============================== PAINEL DE LOGIN ====================================
/*
 * DANIEL -> METODO LOGIN DE USUÁRIO. APÓS INSERIR O NOME E SENHA FERIFICA LOGIN SE ESTÁ NULO OU NÃO 
 * TROQUEI (menuLogin) PARA (painelLogin)
 *
 * */
public void painelLogin() {
	
	//boolean gatilho =true;
	
 // while (gatilho) // liberar esse condição quando criar a classe para ler o arquivo
	
	System.out.println("-===================== Login =========================-");
    System.out.print("Nome: ");
    painelLoginNome(); // METODO DE RETORNO DO NOME.
	
    System.out.print("Senha: ");
    painelLoginSenha(); // METODO DE RETORNO DA SENHA.
    System.out.println("-=====================================================-");
    
  /* if(painelLoginNome().equals(consulta.getPrimeiroDados()) && painelLoginSenha().equals(consulta.getSegundoDados())) {
    	
    	gatilho = false;
    }*/
}
 public String painelLoginNome(){
	 nome = scan.nextLine();       
           return nome;
 }
 public String painelLoginSenha() {          
	 senha = scan.nextLine();
            return senha;
 }  
public String getNome() {
		return nome;
	}
public void setNome(String nome) {
		this.nome = nome;
	}
public String getSenha() {
		return senha;
	}
public void setSenha(String senha) {
		this.senha = senha;
	}

		
    }

