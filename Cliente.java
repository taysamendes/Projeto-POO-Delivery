import java.util.ArrayList;
import java.util.HashMap;

public class Cliente {
	private String telefone;
	private String nome;
	private String email;
	private String endereco;
	
	


	private ArrayList<Pedido> pedidos = new ArrayList<Pedido>();
	
	
	public Cliente(String telefone, String nome,String email,String endereco) {
		this.telefone = telefone;
		this.nome = nome;
		this.email = email;
		this.endereco = endereco;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public ArrayList<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(ArrayList<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	public void addPedido(Pedido p) {
		pedidos.add(p);
	}
	
	public void removerPedido(Pedido p) {
		pedidos.remove(p);
	}

	@Override
	public String toString() {
		return "Cliente [telefone=" + telefone + ", nome=" + nome + "]";
	}
	
	
	
	 /*################################################## MINHAS FUNÇÕES	########################################################################################################*/
	public Pedido obterPedidoAberto() {
		if(pedidos.isEmpty())
			return null;
		Pedido pedido = pedidos.get(pedidos.size()-1);
		if (pedido.isFechado())
			return null;
		return pedido;
		
	}

    /*##########################################################################################################################################################################*/
     
     

}