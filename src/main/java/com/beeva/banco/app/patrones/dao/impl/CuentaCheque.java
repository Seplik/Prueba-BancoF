package com.beeva.banco.app.patrones.dao.impl;

import com.beeva.banco.app.patrones.dao.inter.CuentaDAO;
import com.beeva.banco.app.patrones.dao.model.Cliente;

public class CuentaCheque implements CuentaDAO {

	public boolean retiro(Cliente c, double cantidad) {
		boolean bandera = false; 
		double cuenta = c.getCuenta().getBalance();
		if(cantidad != 0){
			bandera = true;
			 c.getCuenta().setBalance(cuenta-cantidad);
		}else if(cantidad ==0 ){
		
		 bandera = true; 
		}
		return bandera;
	}

	public boolean deposito(Cliente c, double cantidad) {
		boolean bandera = false;
		double balance = c.getCuenta().getBalance();
		if(cantidad != 0){
			bandera = true; 
			 balance +=cantidad; 
			
		}
		c.getCuenta().setBalance(balance);
		return bandera;
	}
	public boolean validaDia(String dia){
		boolean bandera = false; 
		if(dia=="sabado"|| dia=="domingo"){
		 bandera = false;	
		}else {
			bandera = true;
		}
		return bandera;
	}


}
