package produtos;
/*
 * @Version 09.01.2022
 * @Aouthor Daniel Marinho
 * 
 * */
import java.util.Scanner;

public class Produtos{
	
	int id;
	float valor;
	String desc; 
		
	public String desc() {
		Scanner scan = new Scanner(System.in);
		desc = scan.nextLine();
		
		return desc;
	}

	public float valor() {
		Scanner scan = new Scanner(System.in);
		valor = scan.nextFloat();
		
		return valor;
		}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getDesc() {
		return desc;
	}
	
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	public float getValor() {
		return valor;
	}
	
	public void setValor(float valor) {
		this.valor = valor;
	}
	

}
