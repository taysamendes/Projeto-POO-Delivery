import java.time.LocalDateTime;
import java.util.ArrayList;

public class Pedido {
	public int id;
	public LocalDateTime data;
	public double total;
	public String entregador;
	public boolean fechado;
	public Cliente cliente;
	private ArrayList<Produto> produtos = new ArrayList<>();  

	/*GETTERS AND SETTERS*/
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LocalDateTime getData() {
		return data;
	}
	public void setData(LocalDateTime data) {
		this.data = data;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public String getEntregador() {
		return entregador;
	}
	public void setEntregador(String entregador) {
		this.entregador = entregador;
	}
	public boolean isFechado() {
		return fechado;
	}
	public void setFechado(boolean fechado) {
		this.fechado = fechado;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
}
