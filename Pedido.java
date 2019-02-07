//package modelo;
import java.time.LocalDateTime;
/**********************************
 * IFPB - Curso Superior de Tec. em Sist. para Internet
 * Programação Orientada a Objetos
 * Prof. Fausto Maranhão Ayres
 **********************************/
import java.util.ArrayList;
import java.util.HashMap;


public class Pedido {
    private int id=0;
    private LocalDateTime data = LocalDateTime.now();
    private double total = 0;
    private String entregador;
    private boolean fechado;
    private Cliente cliente;

     
    private ArrayList<Produto>produtos = new ArrayList<Produto>();

     
    public Pedido(int id) {
        super();
        this.id = id;
//        fechado= false;
    }
    
    public void adicionar(Produto p){
        produtos.add(p);
    }
    public void remover(Produto p){
        produtos.remove(p);
    }
 
//    public Produto localizar(String nome){
//        for(Produto p : produtos){
//            if(p.getNome().equals(nome))
//                return p;
//        }
//        return null;
//    }
     
 
    public int getTotalProdutos(){
        return produtos.size();
    }
 
    public int getId() {

    	return id;
	  
    }

    public void setId(int id) {
        this.id = id;
    }     
 
    public boolean isFechado() {
		return fechado;
	}
    
    
	public void setFechado(boolean fechado) {
		this.fechado = fechado;
	}

	@Override
    public String toString() {
        String texto = "Pedido [id=" + id  ;
        texto += ", produtos:";
        if (produtos.isEmpty())
            texto += " vazia";
        else   
            for(Produto p: produtos) 
                texto += " " + p.getDescricao() ;
 
        return texto + "]";
    }
// 
 
}