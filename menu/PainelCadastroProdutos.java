package menu;
/*
 * @Version 09.01.2022
 * @Aouthor Daniel Marinho
 * 
 * */
import gravarDados.GravarProdutos;
import lerDados.LerProdutos;
import produtos.Produtos;

public class PainelCadastroProdutos {
	
	boolean exe = true;
	GravarProdutos cadastrar = new GravarProdutos();
	Produtos produto = new Produtos(); 
	LerProdutos lista = new LerProdutos();
	
	
	int id = lista.lerId() +1; // RECEBE O ULTIMO ID E SOMA COM +1
	Menu menu = new Menu();
	
	public int proximoId() { // METODO QUE FAZ A SOMA DO ID APOS UM CADASTRO 
		
		return id++;
	}
	
	//============================================ CADASTRO DE PRODUTO ========================================================	
	
	public void cadastrarProduto(){
		
		System.out.print(lista.getListProdutos());
		
		while (exe) {
		
		System.out.println("-=============== "+menu.nomeMenu[3]+ " ===================-"); 	
		System.out.println("-==    ID: " +id);
		System.out.print("-==  nome: ");
		produto.desc();
		
		if (produto.getDesc().equals( "S") || produto.getDesc().equals( "s") ) { // CONDIÇÃO PARA PARAR DE CADASTRAR PRODUTOS. 
			exe = false;
			
		}else {
			
			try {
			System.out.print("-== Valor: ");
			produto.valor();
			
			}catch(Exception erro){
				
				System.out.println("Não aceitamos "+ produto.getValor()+" que não seja com (,) ou números inteiros");
				System.out.println("Valor informado gerou erro e ficou " +erro.getMessage());
			}
			System.out.println("-=====================================================-");
			System.out.println("Cadastro criado com sucesso ! para siar informe (S)");
		
			cadastrar.CadastrarProdutos(id, produto.getDesc(), produto.getValor()); // FAZ A GRAVAÇÃO DO CADASTRO
			
			proximoId(); // GERA O PROXIMO ID
		}
	    
		}
	}
	
	//===========================================================================================================
	
	public boolean isExe() {
		return exe;
	}
}