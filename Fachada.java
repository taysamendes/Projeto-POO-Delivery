//package fachada;
 
import java.util.ArrayList;

//import modelo.Cliente;
//import modelo.Pedido;
//import modelo.Produto;
//import repositorio.Restaurante;
 
/**********************************
 * IFPB - Curso Superior de Tec. em Sist. para Internet
 * POO - Programação Orientada a Objetos
 * Prof. Fausto Ayres
 *
 */
 
public class Fachada {
    private static Restaurante restaurante = new Restaurante();
    private ArrayList<Produto> produtos = new ArrayList<Produto>();
    private ArrayList<Cliente> clientes = new ArrayList<Cliente>();

    
    
    private static int idproduto=0;
    private static int idpedido=0;  //autoincremento
    
 
 
    public static Produto cadastrarProduto(String descricao, double preco) throws  Exception{
    	idproduto++;
        Produto p = restaurante.localizarProduto(descricao);
        
        if (p!=null)
            throw new Exception("cadastrar produto: produto ja cadastrado:" + descricao);
         
        //criar produto e adicionar na restaurante
        p = new Produto(idproduto,descricao,preco);
        restaurante.adicionar(p);
        return p;
    }
 
    public static Pedido abrirPedido(String telefone)throws Exception{
        idpedido++;

        Cliente c = restaurante.localizarCliente(telefone);
        if(c==null)
        	throw new Exception("Cliente nao cadastrado.");
        
        if(c.obterPedidoAberto()!=null)
        	throw new Exception("Cliente com pedido aberto.\n");
        
        Pedido p = new Pedido(idpedido);
        c.addPedido(p);
        restaurante.adicionar(p);
        p.setFechado(false);
        return p;
    }
 
    public static void adicionarProdutoPedido(String telefone, String descricao) throws Exception {   

    	Cliente cli = restaurante.localizarCliente(telefone);
        if(cli == null) 
            throw new Exception("inclusao na pedido - cliente nao cadastrado");

        Pedido pedido = cli.obterPedidoAberto();
        if(pedido == null) 
            throw new Exception("inclusao na pedido - nao existe pedido aberto do cliente:");
 
        Produto produto = restaurante.localizarProduto(descricao);
        if(produto == null)
            throw new Exception("inclusao na pedido - produto nao cadastrado.");
 
         
        pedido.adicionar(produto);  //relacionar produto e prateleira
    //  produto.adicionar(pedido);
    }
 
    public static void removerProdutoPedido(String nome) throws Exception{
         
         
    }
     
    public static ArrayList<Produto> listarProdutos() {
        return restaurante.getProdutos();
    }
    
    public static ArrayList<Produto> listarProdutos(String nome){
    	ArrayList<Produto> ProdutosNomes = new ArrayList<>();
    	ArrayList<Produto> p = Fachada.listarProdutos();
    	
    	if(nome.isEmpty())
    		return restaurante.getProdutos();
    	
    	for(Produto produtos: p) {
    		if(produtos.getDescricao().startsWith(nome)) 
    			ProdutosNomes.add(produtos);    		
    	}
		return ProdutosNomes;
    } 
    
     
    public static ArrayList<Pedido> listarPedidos() {
        return restaurante.getPedidos();
    }
    
    public static ArrayList<Cliente> listarClientes(){
    	return restaurante.getClientes();
    }
 
    /*################################################## MINHAS FUNCOES	########################################################################################################*/
    public static Cliente cadastrarCliente(String telefone, String nome, String email, String endereco)throws Exception {
    	Cliente c  = restaurante.localizarCliente(nome);
    	if(c!=null)
            throw new Exception("O cliente ja cadastrado:" + nome);
    	c = new Cliente(telefone,nome,email,endereco);
    	restaurante.adicionar(c);
    	return c;
    }
    
    public static ArrayList<Pedido> listarPedidos(String telefone){
    	Cliente cli = restaurante.localizarCliente(telefone);
    	return cli.getPedidos();     	
    }
    
    public static  Pedido consultarPedido(String telefone) throws Exception{
    	Cliente cli = restaurante.localizarCliente(telefone);
    	if(cli==null)
    		throw new Exception("Cliente nao cadastrado.");
    	
    	if(cli.obterPedidoAberto()==null)
    		throw new Exception("Pedido fechado do cliente: "+ telefone);
    	
    	return cli.obterPedidoAberto();  	
    }
    
    public static void fecharPedido(String telefone, String entregador) throws Exception{
    	Cliente cli = restaurante.localizarCliente(telefone);
    	Pedido p = cli.obterPedidoAberto();
    	
    	if(cli==null)
    		throw new Exception("Cliente nao cadastrado.");
    	if(p == null) {
    		throw new Exception("O pedido j� foi fechado.");
    	}    	
    		p.setFechado(true);  	
    }
    

    /*##########################################################################################################################################################################*/
     
     
     
 
}//class