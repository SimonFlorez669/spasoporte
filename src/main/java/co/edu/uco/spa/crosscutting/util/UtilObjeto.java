package co.edu.uco.spa.crosscutting.util;


public class UtilObjeto {
	
	
	public static final String VACIO="";

	private UtilObjeto() {
		super();
	}

	public static final <O> boolean esNulo(final O objeto) {
		return objeto == null;
	}
	public static final <O> boolean esNulooVacio(final O objeto) {
		return objeto == null && objeto == VACIO;
	}
	

	public static final <O> O obtenerValorDefecto(final O objeto, final O valorDefecto) {
		return esNulo(objeto) ? valorDefecto : objeto;
		// es signo ? significa que la sentencia es verdadera y los : hace que si no se
		// cumple entonces devuelva la otra sentencia
	}



}
