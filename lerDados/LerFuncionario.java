package lerDados;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import menu.PainelLogin;

public class LerFuncionario {
	
	//private String nome = null;
	//private String senha = null;
	
	private ArrayList<String> listNome = new ArrayList<String>(); 

	public void lerDadosFuncionario() {
		
		Scanner scan;
		
		try {
			
			FileReader arquivo = new FileReader("src\\Dados\\Funcionario.txt");
			scan = new Scanner(arquivo);
			
			while (scan.hasNextLine()) {
				
				listNome.add(scan.next());
				listNome.add(scan.next());
			}
			
		}catch (IOException e) {
				
				System.out.print("Erro verificação Funcionario "+"\n" + e.getMessage());
			}
		}
	
	String nomeList = null;
	String senhaList = null;
	
	public void validaLogin(String nome, String senha) {
		
		
		PainelLogin log = new PainelLogin();  
		
		for(String i : listNome) {
			
			
			if(i.equals(nome)) {
				
				nomeList = i;
				System.out.print(nomeList);
				
			}if(i.equals(senha)){
				
				senhaList = i;
				System.out.print(senhaList);
			}
			
		}
		
	}
		
	public ArrayList<String> getListNome() {
		return listNome;
	}
	
	public void setListNome(ArrayList<String> listNome) {
		this.listNome = listNome;
	}
	
	public String getNome() {
		return nomeList;
	}
	
	public String getSenha() {
		return senhaList;
	}	
}
