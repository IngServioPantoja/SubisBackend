package co.com.tauLabs.service;

import javax.ejb.Local;

@Local
public interface IEntidadService {

	String encontrarHistoricoPorCedula(String cedula, String prioridad);

	String listar();

}
