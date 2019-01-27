package modelo;

import java.util.ArrayList;
import java.util.HashMap;

public class Cliente {
	private String telefone;
	private String nome;
	private String email;
	private String endereco;
	
	private ArrayList<Pedido> pedidos = new ArrayList<Pedido>();
	
	
	public Cliente(String telefone, String nome,String email,String endereco) {
		this.telefone = telefone;
		this.nome = nome;
		this.email = email;
		this.endereco = endereco;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	@Override
	public String toString() {
		return "Cliente [telefone=" + telefone + ", nome=" + nome + "]";
	}
	
	
	
	 /*################################################## MINHAS FUNÇÕES	########################################################################################################*/
//	public Pedido obterPedidoAberto(String telefone) {
//		Cliente cli;
//		
//	}

    /*##########################################################################################################################################################################*/
     
     

}
