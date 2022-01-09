package gravarDados;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class GravarProdutos {
		
		public void  CadastrarProdutos(int id, String desc, float valor) {
			
			PrintWriter gravarArq = null;
			
			try {
				 
				FileWriter arquivo = new FileWriter("src\\dados\\Produtos.txt", true); // PRODURA O CAMINHO DO ARQUIVO E SE N�O TIVER GERA O ARQUIVO
			
				 gravarArq = new PrintWriter(arquivo); // GRAVAR OS DADOS NO ARQUIVO
				
				gravarArq.println(id);
				gravarArq.println(desc);
				gravarArq.println(valor);
				
				System.out.printf("\nDados gravados com sucesso..\n");
			
			}catch (IOException erro) {
				System.out.print("erro! arquivo n�o encontrado"+ erro.getMessage());
			
			}finally {
				
				gravarArq.close();
			}
		}
	}
