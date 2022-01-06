package menu;

import gravarDados.GravarProdutos;
import produtos.Produtos;

public class PainelCadastroProdutos {
	
	boolean exe = true;

	int id = 01;
	Menu menu = new Menu();
	Produtos produto = new Produtos(); 
	GravarProdutos cadastrar = new GravarProdutos();
	
	public int proximoId() {
		return id++;
	}
	
	public void cadastrarProduto(){
		
		while (exe) {
		
		System.out.println("-=============== "+menu.nomeMenu[3]+ " ===================-"); 	
		System.out.println("-==    ID: " +id);
		System.out.print("-==  nome: ");
		produto.desc();
		
		if (produto.getDesc().equals( "S") || produto.getDesc().equals( "s") ) { // CONDI��O PARA PARAR DE CADASTRAR PRODUTOS. 
			exe = false;
			
		}else {
			
			try {
			System.out.print("-== Valor: ");
			produto.valor();
			
			}catch(Exception erro){
				
				System.out.println("N�o aceitamos "+ produto.getValor()+" que n�o seja com (,) ou n�meros inteiros");
				System.out.println("Valor informado gerou erro e ficou " +erro.getMessage());
			}
			System.out.println("-=====================================================-");
			System.out.println("Cadastro criado com sucesso ! para siar informe (S)");
		
			cadastrar.CadastrarProdutos(id, produto.getDesc(), produto.getValor()); // FAZ A GRAVA��O DO CADASTRO
			
			proximoId(); // GERA O PROXIMO ID
		}
	    
		}
	}
	public boolean isExe() {
		return exe;
	}
}