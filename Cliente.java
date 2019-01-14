import java.util.HashMap;
import java.util.Map;

public class Cliente {
	public String telefone;
	public String nome;
	public String email;
	public String endereco;
	private HashMap<Integer, Pedido> pedidos = new HashMap<>();
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
		
	}
}


//listarClientes() – retorna todos os clientes do restaurante
//cadastrarCliente(dados...) –cria e retorna um novo cliente no restaurante
