package validacao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import principal.Usuario;

public class ConsultarArquivo {
	
	private Scanner scan = null;
	private String arquivo = null;
	private String primeiroDados = null;
	private String segundoDados = null;
	
/*
 * DANIEL -> CONSULTA O ARQUIVO GRAVADO COM OS USUARIOS 
 * */    
public void  consultarUsuario() {
		
		String caminhoUsuario = "src\\dados\\usuario.txt"; 
		consultaDoArquivo(caminhoUsuario);
		
}

public void consultaDoArquivo(String arquivo) {
	
	try {
			
		FileReader ler = new FileReader(arquivo);
		scan = new Scanner (ler);
		
		while(scan.hasNext()) {
		
			/*if (primeiroDados == null || segundoDados == null) {
				
				System.err.checkError();
			}else if (primeiroDados == "" || segundoDados == ""){
				
				System.err.checkError();
			}else {*/
				
				primeiroDados = scan.next();
				segundoDados = scan.next();
		
		
	}
	} catch (FileNotFoundException e) {
			
		e.printStackTrace();	
	}
}
/*
 * DANIEL -> CONSULTA O ARQUIVO INFORMARDO NA STRING (CaminhoUsuario) 
 * */


public void setArquivo(String arquivo) {
		
	this.arquivo = arquivo;
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

public String getArquivo() {
		return arquivo;
	}

	

}
