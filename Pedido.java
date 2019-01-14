import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class Pedido {
	public int id;
	public LocalDateTime data;
	public double total;
	public String entregador;
	public boolean fechado;
	public Cliente cliente;
	Map<Integer, Produto> produtos = new HashMap<>();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
}

//listarPedidos() retorna todos pedidos do restaurante
//listar Pedidos(telefone_cliente) - retorna todos pedidos de um cliente
//abrirPedido(telefone_cliente)– cria e retorna um novo pedido aberto para o cliente
//adicionarProdutoPedido(telefone_cliente, id_produto) – adiciona um produto no pedido aberto
//removerProdutoPedido(telefone_cliente,id_produto) – remove uma ocorrência do produto no pedido aberto 
//consultarPedido(telefone_cliente) – retorna o pedido aberto do cliente, caso exista, ou null, caso não exista
//cancelarPedido(telefone do cliente)–apaga o pedido aberto do cliente, do restaurante e dos produtos relacionados a este pedido
//fecharPedido(telefone do cliente, nome_entregador) – fecha o pedido aberto do cliente
//enviar Pedido(telefone do cliente, senha_email) – envia email com pdf anexo contendo os dados do pedido que acabou de ser fechado