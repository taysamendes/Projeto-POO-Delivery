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
			System.out.println("\n\t\t\t-------- CLIENTES CADASTRADOS --------");
			Cliente joao = Fachada.cadastrarCliente("98745-0643", "Joao", "joao@gmail.com",
					"Rua dos Tronos");
			System.out.println("\t\t\t\t\t"+joao.getNome());
			Cliente maria = Fachada.cadastrarCliente("98820-0222", "Maria", "maria@gmail.com",
					"Rua da Justiça, 12");          
			System.out.println("\t\t\t\t\t"+maria.getNome());
			Cliente amanda = Fachada.cadastrarCliente("998413306", "Amanda", "amanda@gmail.com", "Rua da agua,176");
			System.out.println("\t\t\t\t\t"+amanda.getNome());
			Cliente mayara = Fachada.cadastrarCliente("99841-1212", "Mayara", "mayara@gmail.com", "Rua das gaivotas,71");
			
			System.out.println("\n\t\t\t-------- PRODUTOS CADASTRADOS --------");
			Produto pizza = Fachada.cadastrarProduto("Pizza", 30);
			Produto sushi = Fachada.cadastrarProduto("Sushi", 40);
			Produto Salada = Fachada.cadastrarProduto("Salada", 40);
			Produto Suco = Fachada.cadastrarProduto("Suco", 40);
			Produto Salame = Fachada.cadastrarProduto("Salame", 40);
			Produto cocaCola = Fachada.cadastrarProduto("Coca-cola", 10);
			Produto guarana = Fachada.cadastrarProduto("Guarana", 5);  

			System.out.println("\t\t\t\t\t"+pizza.getDescricao());
			System.out.println("\t\t\t\t\t"+sushi.getDescricao());
			System.out.println("\t\t\t\t\t"+cocaCola.getDescricao());
			System.out.println("\t\t\t\t\t"+guarana.getDescricao());     

			System.out.println("\nAbrir pedidos");          
			Pedido pedido1 = Fachada.abrirPedido("98745-0643");
			System.out.println("abrir pedido ="+pedido1.getId());
			Pedido pedido2 = Fachada.abrirPedido("98820-0222");
			System.out.println("abrir pedido ="+pedido2.getId());
			
			


			System.out.println("\n adicao dos produtos ao Pedido");         
			Fachada.adicionarProdutoPedido("98745-0643", "Sushi");
			Fachada.adicionarProdutoPedido("98745-0643", "Sushi");

			Fachada.adicionarProdutoPedido("98820-0222", "Guarana");   
			

			System.out.println("TESTAR FUNCAO");
			System.out.println(Fachada.listarPedidos("98745-0643"));
			System.out.println(Fachada.listarPedidos("98820-0222"));
			System.out.println(Fachada.listarPedidos("98820-0222"));

			



			System.out.println("\nconsultar pedido ="+ Fachada.consultarPedido("98745-0643"));
			System.out.println("\nconsultar pedido ="+ Fachada.consultarPedido("98820-0222"));
			//             

			Fachada.adicionarProdutoPedido("98745-0643", "Pizza");

			Fachada.adicionarProdutoPedido("98820-0222", "Coca-cola");    



			System.out.println("consultar pedido ="+ Fachada.consultarPedido("98745-0643"));
			System.out.println("consultar pedido ="+ Fachada.consultarPedido("98820-0222"));
			     

			 //          Fachada.fecharPedido("98820-0222", "entregadorX");
			//            //Fachada.enviarPedido("98745-0643", "senha");
			//            //Fachada.enviarPedido("98820-0222", "senha");
			// 			            
            System.out.println("\n Fechando pedidos");              
            Fachada.fecharPedido("98745-0643", "João de Deus");

            
			            System.out.println("ABRINDO NOVO PEDIDO:");
			            Pedido pedido3 = Fachada.abrirPedido("99841-1212");
			            System.out.println("Abrir pedido No: ="+pedido3.getId());
						Fachada.adicionarProdutoPedido("99841-1212", "Sushi");
						Fachada.adicionarProdutoPedido("99841-1212", "Coca-cola");
						System.out.println("consultar pedido ="+ Fachada.consultarPedido("99841-1212"));
						
			            System.out.println("consultar pedido ="+ Fachada.consultarPedido("98745-0643"));




			// 
			//            System.out.println("\nCancelar pedido:");
			//            Fachada.cancelarPedido("98745-0643");
			//            System.out.println("consultar pedido ="+ Fachada.consultarPedido("98745-0643"));
			//         
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