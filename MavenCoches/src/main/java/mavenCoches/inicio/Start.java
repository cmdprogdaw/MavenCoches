package mavenCoches.inicio;

import mavenCoches.modelo.coche.CreateCoche;
import mavenCoches.modelo.concesionario.CreateConcesionario;
import mavenCoches.modelo.reparacion.CreateReparacion;
import mavenCoches.modelo.trabajador.CreateTrabajador;
import mavenCoches.negocio.CocheBean;
import mavenCoches.negocio.ConcesionarioBean;
import mavenCoches.negocio.ReparacionBean;
import mavenCoches.negocio.TrabajadorBean;
import mavenCoches.util.ConnectionEntityManager;

public class Start {

	public static void main(String[] args) {
		
		ConcesionarioBean concesionario1 = new ConcesionarioBean();
		concesionario1.setNombre("Hola");
		concesionario1.setCif("12345678");
		concesionario1.setLocalidad("Mieres");
		concesionario1.setProvincia("Asturias");
		concesionario1.setTelefono(673234222);

		CocheBean ford = new CocheBean();
		ford.setBastidor("No se");
		ford.setModelo("ford");
		ford.setPlazas(4);
		ford.setCaballos(200);
		ford.setEjes(2);
		
		TrabajadorBean pepe = new TrabajadorBean();
		pepe.setNombre("Pepe");
		pepe.setApellidos("Garcia");
		pepe.setDni("71743265A");
		pepe.setDireccion("Calle Arriba");
		pepe.setLocalidad("Mieres");
		pepe.setProvincia("Asturias");
		pepe.setTelefono(654323456);
		pepe.setSueldo_base(500);
		
		ReparacionBean reparacion1 = new ReparacionBean();
		reparacion1.setMatricula("12432 HD");
		reparacion1.setMarca("ford");
		reparacion1.setModelo("cmax");
		reparacion1.setColor("rojo");
		reparacion1.setBastidor("No se");
		reparacion1.setDescripcion("Pinchazo de ruedas");
		reparacion1.setPresupuesto(200);
		
		
		concesionario1.addCoches(ford);
		concesionario1.addTrabajador(pepe);
		concesionario1.addReparacion(reparacion1);
		
		
		
		CreateConcesionario createConcesionario = new CreateConcesionario();
		createConcesionario.create(concesionario1);
		
		CreateCoche createCoche = new CreateCoche();
		createCoche.create(ford);
		
		CreateTrabajador createTrabajador = new CreateTrabajador();
		createTrabajador.create(pepe);
		
		CreateReparacion createReparacion = new CreateReparacion();
		createReparacion.create(reparacion1);
		
		
		
		ConnectionEntityManager.getEntityManager().close();
	}

}
