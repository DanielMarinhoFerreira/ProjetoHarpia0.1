package menu;

import lerDados.LerProdutos;

/*
 * @Version 10.01.2022
 * @Aouthor Daniel Marinho
 * 
 * */

public class PainelProdutos {
	
	Menu menu = new Menu();
	LerProdutos dadosProd = new LerProdutos();
	
	
	public void verProdutos(){
		
	int cont = 0;	
	dadosProd.lerDadosProdutos();
	
	System.out.print("-===================== "+menu.nomeMenu[7]+" ========================-"+"\n");
	
	for (int i=0; i<dadosProd.getListProduto().size(); i++) {
		
		if (cont == i) {
			
			System.out.println("-==  nome: "+dadosProd.getListProduto().get(i));
			cont = +cont;
		}if (1 == i) {
			
			System.out.println("-== Valor: "+dadosProd.getListProduto().get(i));
			cont = +cont;
		}if (2 == i) {
			
			System.out.println("-==    ID: "+dadosProd.getListProduto().get(i));
			cont = +cont;
		}
		System.out.println("-=====================================================-");
		
		}
	}
}


