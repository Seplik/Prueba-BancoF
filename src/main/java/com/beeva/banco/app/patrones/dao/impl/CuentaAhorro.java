package com.beeva.banco.app.patrones.dao.impl;

import com.beeva.banco.app.patrones.dao.inter.CuentaDAO;
import com.beeva.banco.app.patrones.dao.model.Cliente;

public class CuentaAhorro implements CuentaDAO {

	public boolean retiro(Cliente c, double cantidad) {
		boolean bandera = false; 
		double cuenta = c.getCuenta().getBalance();
		if(c.getCuenta().getBalance()<5000){
			bandera = false; 
		}else{
		 c.getCuenta().setBalance(cuenta-cantidad);
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
	

}
