package menu;

import java.util.Scanner;

public class Menu {
	
	String []nomeMenu = {"Login", "Cadastro","Menu","Cadastrar Pedido","Sair", "Cadastrar Usuario","Produto"};
	int infMenu;
	
	/*
	 * PAINEL DEPOIS QUE REALIZAR O MENU
	 * 
	 * */
	public void menuPainel() {
		
		 System.out.println("-===================== "+nomeMenu[2]+" ==========================-"+"\n");
		 System.out.println("-= "+nomeMenu[5]+" [1]: ============================-");
		 System.out.println("-= "+nomeMenu[6]+" 	     [2]: ============================-");
		 System.out.println("-= "+nomeMenu[4]+" 	     [5]: ============================-"+"\n");
		 System.out.println("-=====================================================-");
		 System.out.print("Informe qual rotina gostaria de acessar: ");
		 informarMenu();
		
	}
	/*
	 * FUNÇÃO PARA RETORNAR O MENU QUE FOR ENTRAR 
	 * */
	public int informarMenu() { 
		
		Scanner scan = new Scanner(System.in);
		
		infMenu = scan.nextInt();
		 
		 return infMenu;
	 }

	public int getInfMenu() {
		return infMenu;
	}

	public void setInfMenu(int infMenu) {
		this.infMenu = infMenu;
	}
	
}


