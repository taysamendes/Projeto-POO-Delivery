//package repositorio;
/**********************************
 * IFPB - Curso Superior de Tec. em Sist. para Internet
 * Programação Orientada a Objetos
 * Prof. Fausto Maranhão Ayres
 **********************************/
import java.util.ArrayList;
import java.util.HashMap;


public class Restaurante {
	private ArrayList<Produto> produtos = new ArrayList<Produto>();
	private ArrayList<Pedido> pedidos = new ArrayList<Pedido>();
	private ArrayList<Cliente> clientes = new ArrayList<Cliente>();



	public void adicionar(Produto p){
		produtos.add(p);
	}
	public void remover(Produto p){
		produtos.remove(p);
	}

	public Produto localizarProduto(String nome){
		for(Produto p : produtos){
			if(p.getDescricao().equals(nome))
				return p;
		}
		return null;
	}


	public void adicionar(Pedido p){
		pedidos.add(p);
	}
	public void remover(Pedido p){
		pedidos.remove(p);
	}
	
	public void adicionar(Cliente c) {
		clientes.add(c);
	}

	public Pedido localizarPedido(int id){
		for(Pedido p : pedidos){
			if(p.getId()==id)
				return p;
		}
		return null;
	}

	public ArrayList<Produto> getProdutos() {
		return produtos;
	}

	public ArrayList<Pedido> getPedidos() {
		return pedidos;
	}
	
	public ArrayList<Cliente> getClientes(){
		return clientes;
	}

	public int getTotalProdutos(){
		return produtos.size();
	}
	public int getTotalPedidos(){
		return pedidos.size();
	}
	
/*################################################## MINHAS FUNÇÕES	########################################################################################################*/
	public Cliente localizarCliente(String telefone){
		 for(Cliente c: clientes){
			 if(c.getTelefone().equals(telefone))
			 return c;
		 }
		 return null;
	}


/*##########################################################################################################################################################################*/
}