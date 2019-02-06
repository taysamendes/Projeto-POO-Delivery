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
            Cliente joao = Fachada.cadastrarCliente("98745-0643", "joao", "joao@gmail.com",
                    "Rua dos Tronos");
            System.out.println("cadastrou cliente="+joao.getNome());
            Cliente maria = Fachada.cadastrarCliente("98820-0222", "maria", "maria@gmail.com",
                    "Rua da JustiÃ§a, 12");          
            System.out.println("cadastrou cliente="+maria.getNome());
            Cliente amanda = Fachada.cadastrarCliente("998413306", "Amanda", "amanda@gmail.com", "Rua da agua,176");
            System.out.println("Cadastrou cliente= "+amanda.getNome());
            Produto pizza = Fachada.cadastrarProduto("Pizza", 30);
            System.out.println("cadastrou produto="+pizza.getDescricao());
            Produto sushi = Fachada.cadastrarProduto("Sushi", 40);


            Produto Salada = Fachada.cadastrarProduto("Salada", 40);
            Produto Suco = Fachada.cadastrarProduto("Suco", 40);
            Produto Salame = Fachada.cadastrarProduto("Salame", 40);

            
            System.out.println("cadastrou produto="+sushi.getDescricao());
            Produto cocaCola = Fachada.cadastrarProduto("Coca-cola", 10);
            System.out.println("cadastrou produto="+cocaCola.getDescricao());
            Produto guarana = Fachada.cadastrarProduto("Guarana", 5);   
            System.out.println("cadastrou produto="+guarana.getDescricao());     
             
            System.out.println("\nAbrir pedidos");          
            Pedido pedido1 = Fachada.abrirPedido("98745-0643");
            System.out.println("abrir pedido ="+pedido1.getId());
            Pedido pedido2 = Fachada.abrirPedido("98820-0222");
            System.out.println("abrir pedido ="+pedido2.getId());
            
            System.out.println("TESTAR FUNCAO");
            System.out.println(Fachada.listarPedidos("98745-0643"));
//             
//            System.out.println("\nconsultar pedido ="+ Fachada.consultarPedido("98745-0643"));
//            System.out.println("\nconsultar pedido ="+ Fachada.consultarPedido("98820-0222"));
//             
            System.out.println("\n adicao dos produtos ao Pedido");         
            Fachada.adicionarProdutoPedido("98745-0643", "Coca");
//            Fachada.adicionarProdutoPedido("98745-0643", 1);
//            Fachada.adicionarProdutoPedido("98745-0643", 3);            
//            Fachada.adicionarProdutoPedido("98820-0222", 2);    
//            Fachada.adicionarProdutoPedido("98820-0222", 4);    
//            Fachada.removerProdutoPedido("98820-0222", 4);  
// 
//            System.out.println("consultar pedido ="+ Fachada.consultarPedido("98745-0643"));
//            System.out.println("consultar pedido ="+ Fachada.consultarPedido("98820-0222"));
//     
//            System.out.println("\n Fechando pedidos");              
//            Fachada.fecharPedido("98745-0643", "entregadorX");
//            Fachada.fecharPedido("98820-0222", "entregadorX");
//            //Fachada.enviarPedido("98745-0643", "senha");
//            //Fachada.enviarPedido("98820-0222", "senha");
// 
//            System.out.println("consultar pedido ="+ Fachada.consultarPedido("98745-0643"));
//            System.out.println("consultar pedido ="+ Fachada.consultarPedido("98820-0222"));
//             
//            System.out.println("\nAbrir novo pedido");          
//            Pedido pedido3 = Fachada.abrirPedido("98745-0643");
//            System.out.println("abrir pedido ="+pedido3.getId());
//            System.out.println("consultar pedido ="+ Fachada.consultarPedido("98745-0643"));
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
//                    "Rua da JustiÃ§a, 12");          
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