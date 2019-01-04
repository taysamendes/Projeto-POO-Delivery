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
	
}
