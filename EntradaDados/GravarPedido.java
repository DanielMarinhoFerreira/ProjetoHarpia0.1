package EntradaDados;

import java.io.FileWriter;
import java.io.PrintWriter;

public class GravarPedido {
	
	private int codigo;
	private String nome;
	private double preco;
	    
public void cadastraItem(int codigo, String nome, double preco) {
	
	PrintWriter arquivo = null;
	
	try {
		
		FileWriter arquivoUsuario = new FileWriter("src\\pedido\\item.txt", true);
		
		arquivo = new PrintWriter(arquivoUsuario);
		arquivo.println(codigo + ";" + nome + ";" + preco);
		
	} catch (Exception e) {
		
		System.out.println("Erro ao cadastrar item. " + e.getMessage());
		
	} finally {
		
		arquivo.close();
		
	}
	
}

public void setCodigo(int codigo) {
	this.codigo = codigo;
	}

public void setNome(String nome) {
	this.nome = nome;
	}

public void setPreco(double preco) {
	this.preco = preco;
	}
public int getCodigo() {
	return codigo;
	}
public String getNome() {
	return nome;
	}
public double getPreco() {
	return preco;
	}


}
