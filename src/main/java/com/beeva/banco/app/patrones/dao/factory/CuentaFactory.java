package com.beeva.banco.app.patrones.dao.factory;

import com.beeva.banco.app.patrones.dao.impl.CuentaAhorro;
import com.beeva.banco.app.patrones.dao.impl.CuentaCheque;
import com.beeva.banco.app.patrones.dao.inter.CuentaDAO;
import com.beeva.banco.app.patrones.dao.model.Cuenta;

public class CuentaFactory {
 public CuentaDAO getImplements(Cuenta c){
	 if(c.getTipo()=="Ahorro"){
		  CuentaDAO cuentaAhorro = new CuentaAhorro();
		  return cuentaAhorro;
	  }else {
		  CuentaDAO cuentaCheques = new CuentaCheque();
		  return cuentaCheques;
	  }
		
	 }

}
