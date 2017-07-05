package com.beeva.banco.app.patrones.dao.model;

public class Banco {
	private Cliente clientes[]  = new Cliente[10];
	private int nClientes = 0;
	
	public Cliente getClientes(int i) {
		return clientes[i];
	}
	public void setClientes(Cliente[] clientes) {
		this.clientes = clientes;
	}
	public int getnClientes() {
		return nClientes;
	}
	public void setnClientes(int nClientes) {
		this.nClientes = nClientes;
	}
	public boolean agregarCliente(Cliente c){
		boolean  bandera = false;
		if(clientes[nClientes] != null){
		 bandera = false;
		 nClientes++; 
		}else{
			
			bandera = true;
		}
		clientes[nClientes] = c; 
		return bandera; 
	}
	

}
