import java.util.HashMap;
import java.util.Map;

public class Produto {
	public int id;
	public String nome;
	public double preco;
	private HashMap<Integer, Pedido> produtos = new HashMap<>();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	

}

//cadastrarProduto(dados...)  – cria e retorna um novo produto no restaurante