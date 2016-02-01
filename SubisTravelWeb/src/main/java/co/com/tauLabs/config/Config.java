package co.com.tauLabs.config;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import co.com.tauLabs.controller.AutenticacionController;

@ApplicationPath("/")
public class Config extends Application {
	public Set<Class<?>> getClasses() {
		Set<Class<?>> s = new HashSet<Class<?>>();
		s.add(AutenticacionController.class);
		return s;
	}
}