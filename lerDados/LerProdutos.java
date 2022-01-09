package lerDados;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class LerProdutos {
	
	private ArrayList<String> listProduto = new ArrayList<>(); 

	public void lerDadosProdutos() {
		
		 String desc = null;
		 String valor = null;
		 String id = null;
		
		Scanner scan;
		
		try {
			
			FileReader arquivo = new FileReader("src\\Dados\\Produtos.txt");
			scan = new Scanner(arquivo);
			
			while (scan.hasNextLine()) {
				
				listProduto.add(desc = scan.nextLine());
				listProduto.add(valor = scan.nextLine());
				listProduto.add(id = scan.nextLine());
			}
			
		}catch (IOException e) {
				
				System.out.print("Erro verificação Funcionario "+"\n" + e.getMessage());
			}
		}
	
	public int  lerId() {
		
		lerDadosProdutos(); // EXECUTA A LISTA DE PRODUTOS
		int id = 0;
		
		try {
			
			String listId;
			
			if (listProduto != null && !listProduto.isEmpty()) {
			
			listId = listProduto.get(listProduto.size() -1);
			
			id = Integer.parseInt(listId);
			
			}
			
		}catch(NoSuchElementException erro){
			
			System.out.print("Não foi encontrado o ultimo (id) do produto." + erro.getMessage());				
		}
		return id;	
	}	
	
	public ArrayList<String> getListProdutos() {
		return listProduto;
	}
	
	public void setListProdutos(ArrayList<String> listProduto) {
		this.listProduto = listProduto;
	}

}
