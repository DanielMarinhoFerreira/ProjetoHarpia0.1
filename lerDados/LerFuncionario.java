package lerDados;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import menu.PainelLogin;

public class LerFuncionario {

	String nomeList = null;
	String senhaList = null;
	private ArrayList<String> listNome = new ArrayList<String>(); 

	public void lerDadosFuncionario() {
		
		 String nome = null;
		 String senha = null;
		
		Scanner scan;
		
		try {
			
			FileReader arquivo = new FileReader("src\\Dados\\Produtos.txt");
			scan = new Scanner(arquivo);
			
			while (scan.hasNextLine()) {
				
				listNome.add(nome = scan.nextLine());
				listNome.add(senha = scan.nextLine());
			}
			
		}catch (IOException e) {
				
				System.out.print("Erro verificação Funcionario "+"\n" + e.getMessage());
			}
		}
		
	public void validaLogin(String nome, String senha) {
		
		PainelLogin log = new PainelLogin();  
		
		for(String i : listNome) {
				
			if(i.equals(nome)) {
				
				nomeList = i;
				
			}if(i.equals(senha)){
				
				senhaList = i;
			}	
		}	
	}
			
	public String getNome() {
		return nomeList;
	}
	
	public String getSenha() {
		return senhaList;
	}	
	
	public ArrayList<String> getListNome() {
		return listNome;
	}
	
	public void setListNome(ArrayList<String> listNome) {
		this.listNome = listNome;
	}
}
