import java.util.ArrayList;

public class Produto {
	public int id;
	public String nome;
	public double preco;
	private ArrayList<Pedido> pedidos = new ArrayList<>();
	
	/*	GETTERS AND SETTERS  */

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
}
