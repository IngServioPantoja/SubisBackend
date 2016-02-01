package co.com.tauLabs.service.impl;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import co.com.tauLabs.dao.IEntidadDao;
import co.com.tauLabs.service.IEntidadService;

/**
 * Session Bean implementation class EntidadService
 */
@Stateless
@LocalBean
@TransactionManagement(TransactionManagementType.BEAN)
@Path("/entidad")
public class EntidadService implements IEntidadService {

	@Inject private IEntidadDao entidadDao;
    
	public EntidadService() {
        // TODO Auto-generated constructor stub
    }
    
    
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("{cedula}/{prioridad}") //hace referencia a /personas/{id}
	@Override
	public String encontrarHistoricoPorCedula(@PathParam("cedula") String cedula,@PathParam("prioridad") String prioridad){
		if(prioridad.equals("alta")){
			return "Listo el servici orest";
		}else{
			return "Espere un momento";
		}
	}
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("listado")
	@Override
	public String listar(){
		return "milist";
	}

}
