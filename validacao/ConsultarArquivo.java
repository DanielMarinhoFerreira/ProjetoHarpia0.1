package validacao;

import java.io.BufferedReader;
import java.io.FileReader;

public class ConsultarArquivo {
	
	private String primeiroDados;
	private String segundoDados;
	boolean gatilho = true;
	
public void consultarArquivo(String arquivo) {
	
	try {
		
	      FileReader arq = new FileReader(arquivo);
	      BufferedReader lerArq = new BufferedReader(arq);

	      primeiroDados = lerArq.readLine(); // lê a primeira linha
	      
	      if(primeiroDados != null || primeiroDados != "") {
	    	  segundoDados = lerArq.readLine(); // lê da segunda até a última linha
	      
	      }else {
	    	  
	    	  
	      }
	      lerArq.close();

	} catch (Exception erro) {
		System.out.println(erro);
}
	}
	
public void setPrimeiroDados(String primeiroDados) {
	
	this.primeiroDados = primeiroDados;
}
	
public void setSegundoDados(String segundoDados) {
	
	this.segundoDados = segundoDados;
}

public String getPrimeiroDados() {
	
	return primeiroDados;
}

public String getSegundoDados() {
		
	return segundoDados;
}
}
