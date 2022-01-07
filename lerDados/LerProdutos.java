package lerDados;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class LerProdutos {
	
	private ArrayList<String> listProduto = new ArrayList<String>(); 

	public void lerDadosFuncionario() {
		
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
	
	public ArrayList<String> getListProdutos() {
		return listProduto;
	}
	
	public void setListProdutos(ArrayList<String> listProduto) {
		this.listProduto = listProduto;
	}

}
