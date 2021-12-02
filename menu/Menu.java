package menu;

import java.util.Scanner;

import EntradaDados.GravarPedido;
import EntradaDados.GravarUsuarios;
import pedido.Item;
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
	 System.out.println("-= PRODUTO           [2]: ============================-");
	 System.out.println("-= REALIZAR PEDIDO   [3]: ============================-");
	 System.out.println("-= NOTA FILCAL       [4]: ============================-");
	 System.out.println("-= SAIR              [5]: ============================-"+"\n");
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
	
	boolean gatilho = true;
	
	Scanner scan = new Scanner(System.in);
	GravarPedido pedido = new GravarPedido(); 
	
	 System.out.println("-================= PRODUTO ===========================-"+"\n");
	 System.out.println("-= FAZER PEDIDO      [1]: ============================-");
	 System.out.println("-= CADASTRAR PRODUTO [2]: ============================-");
	 System.out.println("-= SAIR              [5]: ============================-"+"\n");
	 System.out.println("-=====================================================-");
	 
	 System.out.print("Informe qual rotina gostaria de acessar: ");
     int opcao = scan.nextInt();
       
	if(opcao == 2) {
		
		while (gatilho) {
		System.out.println("-====================-");
		System.out.print("-=    CODIGO[]:");
		int codigo = scan.nextInt();
		System.out.println("-====================-");
	    System.out.print("-= DESCRIÇÃO[]:");
	    String descricao = scan.next();
	    System.out.println("-====================-");
	    System.out.print("-=     VALOR[]:");
	    double valor = scan.nextDouble();
	    System.out.println("-====================-");
	    System.out.print("-=      SAIR[]:");
	    String sair = scan.next();
	    pedido.cadastraItem(codigo,descricao,valor);
	    
	    if(sair.equals("s")|| sair.equals("S")) {
	    	gatilho = false;
	    
	    }
	}
		
	
	}
}

//============================== PAINEL NOTA FISCAL ====================================

public void painelNota () {
	
	System.out.printf("Cod | Produto................ Quant | Valor | Valor Total.\n");
    System.out.printf("----------------------------------------------------------\n");
	
	
}

//============================== PAINEL DE CADASTRO ====================================
public void painelDeCadastro() {
	
	GravarUsuarios gravar = new GravarUsuarios();
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
      
      gravar.gravarUsuario(cadastNome, cadastSenha);
	}	
}
//============================== PAINEL DE LOGIN ====================================
/*
 * DANIEL -> METODO LOGIN DE USUÁRIO. APÓS INSERIR O NOME E SENHA FERIFICA LOGIN SE ESTÁ NULO OU NÃO 
 * TROQUEI (menuLogin) PARA (painelLogin)
 *
 * */
public void painelLogin() {
	
	System.out.println("-===================== Login =========================-");
    System.out.print("Nome: ");
    painelLoginNome(); // METODO DE RETORNO DO NOME.
	
    System.out.print("Senha: ");
    painelLoginSenha(); // METODO DE RETORNO DA SENHA.
    System.out.println("-=====================================================-");
    
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

