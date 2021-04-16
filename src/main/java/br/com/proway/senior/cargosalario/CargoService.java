package br.com.proway.senior.cargosalario;

import java.util.ArrayList;

public class CargoService {

	/**
	 * Adiciona um cargo à lista de cargos.
	 * 
	 * 
	 * @param listaCargo
	 * @param nomeCargo
	 * @param idCargo
	 */
	public ArrayList<Cargo> cadastrarCargo(Cargo cargo,ArrayList<Cargo> listaCargo) {//TODO verificar
		 listaCargo.add(cargo);
		 return listaCargo;
	}
	

	/**
	 * Remove um cargo da lista de cargos.
	 * @param idCargo
	 * @param listaCargo
	 */
	public void removerCargo(int idCargo, ArrayList<Cargo> listaCargo) {//TODO verificar
		if(listaCargo.contains(idCargo)) {
			listaCargo.remove(idCargo);
		}

	}
}