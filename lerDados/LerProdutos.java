package lerDados;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class LerProdutos {
	
	private ArrayList<String> listProduto = new ArrayList<String>(); 

	public void lerDadosProdutos() {
		
		 String id = null;
		 String desc = null;
		 String valor = null;
		
		Scanner scan;
		
		try {
			
			FileReader arquivo = new FileReader("src\\Dados\\Produtos.txt");
			scan = new Scanner(arquivo);
			
			while (scan.hasNextLine()) {
				
				listProduto.add(id = scan.nextLine());
				listProduto.add(desc = scan.nextLine());
				listProduto.add(valor = scan.nextLine());
			/*	
				System.out.print(id);
				System.out.print(desc);
				System.out.print(valor);
			*/
			}
			
		}catch (IOException e) {
				
				System.out.print("Erro verificação Funcionario "+"\n" + e.getMessage());
			}
		}
	
	public void lerId() {
		
		int id, i, j;
		boolean exe = true;
		for (i=0; i<listProduto.size(); i++) {
			
			
			if(i == 0) {
				
				id = Integer.parseInt(listProduto.get(i));
				
				i = 3;
				
				for (j = 3; j <listProduto.size(); j = 3) {	
				
					 id = Integer.parseInt(listProduto.get(i));
				}
					 System.out.println("id " +id );						 
				 }
				
			}	
		}
	
	public ArrayList<String> getListProdutos() {
		return listProduto;
	}
	
	public void setListProdutos(ArrayList<String> listProduto) {
		this.listProduto = listProduto;
	}

}
