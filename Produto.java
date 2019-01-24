package modelo;
/**********************************
 * IFPB - Curso Superior de Tec. em Sist. para Internet
 * Programação Orientada a Objetos
 * Prof. Fausto Maranhão Ayres
 **********************************/
 
public class Produto {
        private String descricao;
        private double preco;
 
         
        public Produto(String descricao,  double preco) {
            super();
            this.descricao = descricao;
            this.preco = preco;
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