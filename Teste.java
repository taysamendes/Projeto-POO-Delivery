import java.time.LocalDate;
import java.util.ArrayList;



public class Teste {

	public static void main (String[] args) {
		parte1();
		parte2();
		// erros();
	}

	public static void parte1 () {      

		try {
			System.out.println("\n-------- CLIENTES CADASTRADOS --------");
			Cliente joao = Fachada.cadastrarCliente("98745-0643", "Joao", "joao@gmail.com",
					"Rua dos Tronos");
			System.out.println(joao.getNome());
			Cliente maria = Fachada.cadastrarCliente("98820-0222", "Maria", "maria@gmail.com",
					"Rua da Justiça, 12");          
			System.out.println(maria.getNome());
			Cliente amanda = Fachada.cadastrarCliente("998413306", "Amanda", "amanda@gmail.com", "Rua da agua,176");
			System.out.println(amanda.getNome());
			Cliente mayara = Fachada.cadastrarCliente("99841-1212", "Mayara", "mayara@gmail.com", "Rua das gaivotas,71");

			System.out.println("\n-------- PRODUTOS CADASTRADOS --------");
			Produto pizza = Fachada.cadastrarProduto("Pizza", 30);
			Produto sushi = Fachada.cadastrarProduto("Sushi", 40);
			Produto Salada = Fachada.cadastrarProduto("Salada", 40);
			Produto Suco = Fachada.cadastrarProduto("Suco", 40);
			Produto Salame = Fachada.cadastrarProduto("Salame", 40);
			Produto cocaCola = Fachada.cadastrarProduto("Coca-cola", 10);
			Produto guarana = Fachada.cadastrarProduto("Guarana", 5);  

			System.out.println(pizza.getDescricao());
			System.out.println(sushi.getDescricao());
			System.out.println(cocaCola.getDescricao());
			System.out.println(guarana.getDescricao());     

			System.out.println("\n-------- ABRINDO PEDIDOS --------");          
			Pedido pedido1 = Fachada.abrirPedido("98745-0643");
			System.out.println("abrir pedido = "+pedido1.getId());
			Pedido pedido2 = Fachada.abrirPedido("98820-0222");
			System.out.println("abrir pedido = "+pedido2.getId());

			// -------- ADICAO DOS PRODUTOS AO PEDIDO --------        
			Fachada.adicionarProdutoPedido("98745-0643", "Sushi");
			Fachada.adicionarProdutoPedido("98745-0643", "Sushi");
			Fachada.adicionarProdutoPedido("98820-0222", "Guarana");   

			System.out.println("\n-------- LISTANDO PEDIDOS --------");          
			System.out.println(Fachada.listarPedidos("98745-0643"));
			System.out.println(Fachada.listarPedidos("98820-0222"));

			System.out.println("\n-------- CONSULTANDO PEDIDOS --------");          
			System.out.println(Fachada.consultarPedido("98745-0643"));
			System.out.println(Fachada.consultarPedido("98820-0222"));

			// -------- ADICAO DE MAIS PRODUTOS NO PEDIDO --------        
			Fachada.adicionarProdutoPedido("98745-0643", "Pizza");
			Fachada.adicionarProdutoPedido("98820-0222", "Coca-cola"); 

			System.out.println("\n-------- CONSULTANDO PEDIDOS APOS ADICAO--------");  
			System.out.println(Fachada.consultarPedido("98745-0643"));
			System.out.println(Fachada.consultarPedido("98820-0222"));

			//-------- REMOCAO DE PRODUTO NO PEDIDO --------     
			Fachada.removerProdutoPedido("98820-0222","Coca-cola");
			Fachada.removerProdutoPedido("98745-0643","Sushi");	

			System.out.println("\n-------- CONSULTANDO PEDIDOS APOS REMOCAO--------");          
			System.out.println(Fachada.consultarPedido("98745-0643"));
			System.out.println(Fachada.consultarPedido("98820-0222"));
			

			System.out.println("\n-------- ABRINDO NOVO PEDIDO -------- ");
			Pedido pedido3 = Fachada.abrirPedido("99841-1212");
			System.out.println("Abrir pedido No: ="+pedido3.getId());
			Fachada.adicionarProdutoPedido("99841-1212", "Sushi");
			Fachada.adicionarProdutoPedido("99841-1212", "Coca-cola");
			System.out.println("consultar pedido ="+ Fachada.consultarPedido("99841-1212"));		


			//-------- CANCELAMENTO DE PEDIDO --------     
			
			System.out.println("\n-------- CANCELANDO PEDIDO --------");
			Fachada.cancelarPedido("99841-1212");
			System.out.println("consultar pedido ="+ Fachada.consultarPedido("99841-1212"));
			
			System.out.println("\n-------- FECHANDO PEDIDOS --------");              
			Fachada.fecharPedido("98745-0643", "João de Deus");
			System.out.println("consultar pedido ="+ Fachada.consultarPedido("98745-0643"));


			//			            Fachada.enviarPedido("98745-0643", "senha");
			//			            Fachada.enviarPedido("98820-0222", "senha");



			//             
			//            System.out.println("\nArrecadacao diaria");
			//            Fachada.calcularArrecadacao(LocalDate.now().getDayOfMonth());



		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public static void parte2 () {
		System.out.println("\n\n\t\t\t\t ############ CONSULTAS ############\n\n");
		System.out.println("Clientes cadastrados: ");
		ArrayList<Cliente> clientes = Fachada.listarClientes();
		if (!clientes.isEmpty())
			System.out.println(clientes);
		else
			System.out.println("Nao existem clientes cadastrados.");
		//         
		System.out.println("Produtos cadastrados: ");       
		ArrayList<Produto> produtos = Fachada.listarProdutos("");
		if (!produtos.isEmpty())
			System.out.println(produtos);
		else
			System.out.println("Nao existem produtos cadastrados.");            

		//        System.out.println("Filtragem de Produtos: ");      
		//        String filtro = "co";
		//        ArrayList<Produto> produtosFiltrados = Fachada.listarProdutos(filtro);
		//        if (!produtosFiltrados.isEmpty())
		//            System.out.println(produtosFiltrados);
		//        else
		//            System.out.println("Nao existe produto que contenha '" + filtro + "'em seu nome");
		// 
		System.out.println("Pedidos cadastrados: ");            
		ArrayList<Pedido> pedidos = Fachada.listarPedidos();
		if (!pedidos.isEmpty())
			System.out.println(pedidos);
		else
			System.out.println("Nao existem pedidos cadastrados.");
		// 
		// 
		//        System.out.println("Pedidos cadastrados de um cliente: ");          
		//        ArrayList<Pedido> pedidosPorCliente = Fachada.listarPedidos("98745-0643");
		//        if (!pedidosPorCliente.isEmpty())
		//            System.out.println(pedidosPorCliente);
		//        else
		//            System.out.println("Nao existem pedidos deste cliente.");

	}


	//    public static void erros() {
	//        System.out.println("\n-------ERROS--------");
	// 
	//        try {
	//            Fachada.cadastrarProduto("Guarana", 2);
	//            System.out.println("*************FALHA1: produto ja cadastrado"); 
	//        }catch (Exception e) {System.out.println("1--->"+e.getMessage());}
	//        try {
	//            Cliente c = Fachada.cadastrarCliente("98820-0222", "maria", "maria@gmail.com",
	//                    "Rua da JustiÃƒÂ§a, 12");          
	//            System.out.println("*************FALHA2: cliente ja cadastrado"); 
	//        }catch (Exception e) {System.out.println("2--->"+e.getMessage());}
	//        try {
	//            Pedido p = Fachada.abrirPedido("98820-0000");
	//            System.out.println("*************FALHA3: nao pode abrir pedido de cliente inexistente"); 
	//        }catch (Exception e) {System.out.println("3--->"+e.getMessage());}
	//        try {
	//            Pedido p = Fachada.abrirPedido("98820-0222");   //ok
	//            Fachada.adicionarProdutoPedido("98820-0222",99);    
	//            System.out.println("*************FALHA4: nao pode adicionar produto inexistente"); 
	//        }catch (Exception e) {System.out.println("4--->"+e.getMessage());}
	//        try {
	//            Fachada.adicionarProdutoPedido("98820-0222",2); //ok
	//            Pedido p = Fachada.abrirPedido("98820-0222");
	//            System.out.println("*************FALHA5: nao pode abrir pedido ja aberto"); 
	//        }catch (Exception e) {System.out.println("5--->"+e.getMessage());}
	//        try {
	//            Fachada.fecharPedido("98820-0222"); //ok
	//            Fachada.cancelarPedido("98820-0222");
	//            System.out.println("*************FALHA6: nao pode cancelar pedido fechado"); 
	//        }catch (Exception e) {System.out.println("6--->"+e.getMessage());}
}