package com.beeva.banco.app.patrones.dao.inter;

import com.beeva.banco.app.patrones.dao.model.Cliente;

public interface CuentaDAO {
	public boolean retiro(Cliente c, double cantidad);
	public boolean deposito(Cliente c, double cantidad);

}
