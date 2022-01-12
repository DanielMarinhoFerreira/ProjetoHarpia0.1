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
	
	System.out.print(dadosProd.getListProduto());
	
	System.out.print("-===================== "+menu.nomeMenu[7]+" ========================-"+"\n");
	
	for (int i=0; i<dadosProd.getListProduto().size(); i++) {
		
		System.out.println("-==  nome: "+dadosProd.getListProduto().get(i));
		System.out.println("-== Valor: "+dadosProd.getListProduto().get(i));
		System.out.println("-==    ID: "+dadosProd.getListProduto().get(i));
		System.out.println("-=====================================================-");
		
		}
		
	}
	
}


