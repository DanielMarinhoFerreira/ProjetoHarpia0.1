package lerDados;
/*
 * @Version 09.01.2022
 * @Aouthor Daniel Marinho
 * 
 * */
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class LerProdutos {
	
	private ArrayList<String> listProduto = new ArrayList<>(); 
	
	ArrayList<String> produto = new ArrayList<>();
	
	String desc = null;
	String valor = null;
	String id = null;
	
	public void lerDadosProdutos() {
		Scanner scan;
		
		try {
			
			FileReader arquivo = new FileReader("src\\Dados\\Produtos.txt");
			scan = new Scanner(arquivo);
			
			while (scan.hasNextLine()) {
				
				listProduto.add(id = scan.nextLine());	
			}
			
			
			/*for (int i=0; i<listProduto.hashCode(); i++) {
				
				System.out.println(listProduto.get(i));
					
			}*/
			
		}catch (IOException e) {
				
				System.out.print("Erro verificação Funcionario "+"\n" + e.getMessage());
			}
		}
	
	/*public int  lerId() {// RETORNA O ULTIMO ITEM DA LISTA E TRANSFORMA EM UM INT
		
		lerDadosProdutos(); // EXECUTA A LISTA DE PRODUTOS
		int id = 0;
		
		
		try {
			
			String listId;
			
			if (listProduto != null && !listProduto.isEmpty()) { // VERIFICAS SE ALISTA NÃO ESTAR NULA OU VAZIA 
			
					
					
				}
				
				
			//listId = listProduto.get(listProduto.size() -1); // PEGA O ULTIMO ITEM DA LISTA 
			//id = Integer.parseInt(listId); // CONVERTE EM UM INTEIRO 
			
			
		}catch(NoSuchElementException erro){
			
			System.out.print("Não foi encontrado o ultimo (id) do produto." + erro.getMessage());				
		}
		return id;	// RETORNA O ULTIMO ID DA LISTA.
	}*/	
	
	public ArrayList<String> getListProdutos() {
		return listProduto;
	}
	
	public void setListProdutos(ArrayList<String> listProduto) {
		this.listProduto = listProduto;
	}
	public ArrayList<String> getListProduto() {
		return listProduto;
	}
	
	public void setListProduto(ArrayList<String> listProduto) {
		this.listProduto = listProduto;
	}
	
	public String getDesc() {
		return desc;
	}
	
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	public String getValor() {
		return valor;
	}
	
	public void setValor(String valor) {
		this.valor = valor;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}

}
