package pedido;

import java.util.Scanner;

public class Pedido {
	
    public Pedido(){
    	
        Scanner scan = new Scanner(System.in);
        Item item = new Item();
        
        item.cadastraItem(123,"X-Burger",20.90);
        
        System.out.println("1 - FAZER PEDIDO");
        System.out.println("2 - #####");
        System.out.println("3 - #######");
        
        System.out.print("\nDigite a opção desejada: ");
        int opcao = scan.nextInt();
        
        if(opcao == 1){
            System.out.println("Escolha a opção desejada: ");
            
            for (int i = 0; i < 10; i++) {
                item.toString();
            }
        }else if(opcao == 2){
            
        }else{
        
        }
    }
}
