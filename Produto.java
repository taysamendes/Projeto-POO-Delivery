import java.util.ArrayList;

//package modelo;
/**********************************
 * IFPB - Curso Superior de Tec. em Sist. para Internet
 * Programação Orientada a Objetos
 * Prof. Fausto Maranhão Ayres
 **********************************/
 
public class Produto {
		private int id;
        private String descricao;
        private double preco;
    	private ArrayList<Pedido> pedidos = new ArrayList<Pedido>();

 
         
        public Produto(int id,String descricao,  double preco) {
            super();
            this.id = id;
            this.descricao = descricao;
            this.preco = preco;
        }
        
        
        
        public int getId() {
			return id;
		}



		public void setId(int id) {
			this.id = id;
		}



		public String getDescricao() {
            return descricao;
        }
                
        public void setDescricao(String descricao) {
            this.descricao = descricao;
        }
        public double getPreco() {
            return preco;
        }
        public void setPreco(double preco) {
            this.preco = preco;
        }       
         
        //---------------------------------------
        @Override
        public String toString() {
            return "Produto [" + (descricao != null ? "nome=" + descricao + ", " : "")
                    + "preco=" + preco + ", "
                    + "]";
        }
         
     
}