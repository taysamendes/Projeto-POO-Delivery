package modelo;

import java.util.ArrayList;
import java.util.HashMap;

public class Cliente {
	private String telefone;
	private String nome_cliente;
	private String email;
	private String endereco;
	
	private ArrayList<Pedido> pedidos = new ArrayList<Pedido>();
	
	
	public Cliente(String telefone, String nome,String email,String endereco) {
		this.telefone = telefone;
		this.nome_cliente = nome;
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
		return nome_cliente;
	}


	public void setNome(String nome) {
		this.nome_cliente = nome;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
	 /*################################################## MINHAS FUNÇÕES	########################################################################################################*/
	public Pedido obterPedidoAberto(String telefone) {
		Cliente cli;
		
	}

    /*##########################################################################################################################################################################*/
     
     

}
