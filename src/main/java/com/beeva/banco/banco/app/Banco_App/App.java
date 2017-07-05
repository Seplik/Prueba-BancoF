package com.beeva.banco.banco.app.Banco_App;

import java.util.Date;

import com.beeva.banco.app.patrones.dao.factory.CuentaFactory;
import com.beeva.banco.app.patrones.dao.inter.CuentaDAO;
import com.beeva.banco.app.patrones.dao.model.Banco;
import com.beeva.banco.app.patrones.dao.model.Cliente;
import com.beeva.banco.app.patrones.dao.model.Cuenta;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	Cliente c = new Cliente();
    	Cuenta cuenta = new Cuenta();
    	Banco bank = new Banco();
    	cuenta.setTipo("Cheques");
    	cuenta.setBalance(3000);
    	c.setNombre("Jose");
    	c.setApellido("Hernandez");
    	c.setCuenta(cuenta);
    	bank.agregarCliente(c);
    	System.out.println(bank.getClientes(0).getCuenta().getTipo());
    	System.out.println(bank.getClientes(0).getCuenta().getBalance());
    	
    	CuentaFactory  cf = new CuentaFactory();
    	CuentaDAO cuentadao = cf.getImplements(bank.getClientes(0).getCuenta());
    	if(cuentadao.deposito(c, 900)== true){
    		System.out.println("Echo");
    	}else{
    		System.out.println("Mamaste");
    	}
    	System.out.println(bank.getClientes(0).getCuenta().getBalance());
    	/**
    	Calendar c = Calendar.getInstance();
        
    	System.out.println(c.get(Calendar.DAY_OF_WEEK));
    	**/
    	
    }
    
    public String getDia(){
    	String dia = null;
    	Date fe = new Date();    	
    	String[]dias = {"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado", "Domingo"};
    	
    	return dia;
    }
}
