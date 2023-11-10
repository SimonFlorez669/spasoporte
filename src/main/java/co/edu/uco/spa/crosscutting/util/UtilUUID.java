package co.edu.uco.spa.crosscutting.util;

import java.util.Random;
import java.util.UUID;

import co.edu.uco.spa.crosscutting.excepcion.concrete.DataSpaExeption;
import co.edu.uco.spa.crosscutting.excepcion.messages.CatalogoMensajes;
import co.edu.uco.spa.crosscutting.excepcion.messages.enumerator.CodigoMensaje;

public class UtilUUID {
	


	public static final UUID DEFAULT_UUID = null;
	private UtilUUID () {
		super();
	}
	public static UUID generarUUIDDefecto() {
        return new UUID(0L, 0L);
    }
	public static UUID convertirStringaUUID(String uuidString) throws Exception {
        try {
            return UUID.fromString(uuidString);
        } catch (IllegalArgumentException excepcion) {
        	var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000040);
			var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000058);
			throw DataSpaExeption.crear(excepcion,mensajeUsuario,mensajeTecnico);
        }
    }
	public static UUID generarUUIDAleatorio() {
        Random random = new Random();
        long mas = random.nextLong();
        long menos = random.nextLong();
        return new UUID(mas, menos);
    }
	
	
    }
	


