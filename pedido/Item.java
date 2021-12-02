package pedido;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Item {

    private int codigo;
    private String nome;
    private double preco;

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

    @Override
    public String toString() {
        try {
            FileReader arquivo = new FileReader("src\\pedido\\item.txt");
            Scanner scan = new Scanner(arquivo);
            
            while(scan.hasNext()){
                this.codigo = Integer.parseInt(scan.next());
                this.nome = scan.next();
                this.preco = Double.parseDouble(scan.next());
            }
        } catch (Exception e) {
            System.out.println("Erro ao ler arquivo. "+ e.getMessage());
        }

        return "  " + this.codigo + "\t|" + this.nome + "\t|R$ " + this.preco + "\t|\n";
    }
}
