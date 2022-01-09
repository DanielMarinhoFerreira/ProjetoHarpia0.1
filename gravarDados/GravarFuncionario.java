package gravarDados;
/*
 * @Version 09.01.2022
 * @Aouthor Daniel Marinho
 * 
 * */
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class GravarFuncionario {
	
	public void  gravarUsuario(String nome, String senha) {
		
		PrintWriter gravarArq = null;
		
		try {
			 
			FileWriter arquivo = new FileWriter("src\\dados\\Funcionario.txt", true); // PRODURA O CAMINHO DO ARQUIVO E SE NÃO TIVER GERA O ARQUIVO
		
			 gravarArq = new PrintWriter(arquivo); // GRAVAR OS DADOS NO ARQUIVO
			
			gravarArq.println(nome);
			gravarArq.println(senha);
			
			System.out.printf("\nDados gravados com sucesso..\n");
		
		}catch (IOException erro) {
			System.out.print("erro! arquivo não encontrado"+ erro.getMessage());
		
		}finally {
			
			gravarArq.close();
		}
	}
}
