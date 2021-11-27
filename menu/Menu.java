package menu;

import java.util.Scanner;
import principal.Usuario;

/*
 * AUTOR : Daniel Marinho 
 * GITHUB: DanielMarinhoFerreira
 * E-mail: daniel.marinho.ferreira1@gmail.com
 * */

public class Menu {

   Usuario usuario = new Usuario();
   private String nome = null;
   private String senha = null;
   private int inforMenu;
   Scanner scan = new Scanner(System.in);

 public void painelDeMenu() {
	 
	 System.out.println("-===================== MENU ==========================-"+"\n");
	 System.out.println("-= CADASTRAR USUARIO [1]: ============================-");
	 System.out.println("-=== REALIZAR PEDIDO [2]: ============================-");
	 System.out.println("-======= NOTA FILCAL [3]: ============================-");
	 System.out.println("-============== SAIR [4]: ============================-"+"\n");
	 System.out.println("-=====================================================-");
	 System.out.print("Informe qual rotina que acessar: ");
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

String cadastNome = null;
String cadastSenha = null;

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
     
	 usuario.cadastrarUsuario(cadastNome, cadastSenha);
	 
	}
	
}
/*
 * DANIEL -> METODO LOGIN DE USUÁRIO. APÓS INSERIR O NOME E SENHA FERIFICA LOGIN SE ESTÁ NULO OU NÃO
 * 
 * TROQUEI (menuLogin) PARA (painelLogin)
 * */
 public void painelLogin(){
	 
	 boolean gatilho = true;
	try {
		
		while (gatilho) {
		
            System.out.println("-===================== Login =========================-");
            System.out.print("Nome: ");
            nome = scan.nextLine();

            System.out.print("Senha: ");
            senha = scan.nextLine();
            System.out.println("-=====================================================-");
          
           /* 
            * DANIEL -> CONDIÇÃO QUE VERIFICAR SE INSERIRAM VALORES VAZIO NO LOGIN E SENHA SENDO QUE SE UM OU OUTRO FOR VAZIO 
            * RETORNA A REALIZAR O NOME E SENHA. 
           * */ 
            if (nome.equals("") || senha.equals("")) {
        	  
            	System.out.println("Erro!, inofrmar um usuário.");
            }else {
            	
            	gatilho = false; 	
            }
            usuario.cadastrarUsuario(nome, senha);
		}		
		
	} catch (Exception e) {
		System.out.println("ocorreu algum erro inesperado, por favor inofrmar TI! "+"\n"+ e.getMessage() +"\n"+e.getClass());
		
        }
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

