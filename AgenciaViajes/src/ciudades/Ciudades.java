package ciudades;

import java.util.*;

import hoteles.Hoteles;
import principal.Viajes;

public class Ciudades {
	/**
	 * Agencia de Viajes - Clase Ciudades
	 * 
	 * @author Robert G
	 * 
	 */
	Collection<Hoteles> hot;
	Collection<Viajes> via;
	private String CodCiudad;
	private String NombreCiudad;
	private String Pa�s;

	public Ciudades(Collection<Hoteles> hot, Collection<Viajes> via, String codCiudad, String nombreCiudad,
			String pa�s) {
		super();
		this.hot = hot;
		this.via = via;
		CodCiudad = codCiudad;
		NombreCiudad = nombreCiudad;
		Pa�s = pa�s;
	}

	public Ciudades() {
		super();
	}

	public Collection<Hoteles> getHot() {
		return hot;
	}

	public void setHot(Collection<Hoteles> hot) {
		this.hot = hot;
	}

	public Collection<Viajes> getVia() {
		return via;
	}

	public void setVia(Collection<Viajes> via) {
		this.via = via;
	}

	public String getCodCiudad() {
		return CodCiudad;
	}

	public void setCodCiudad(String codCiudad) {
		CodCiudad = codCiudad;
	}

	public String getNombreCiudad() {
		return NombreCiudad;
	}

	public void setNombreCiudad(String nombreCiudad) {
		NombreCiudad = nombreCiudad;
	}

	public String getPa�s() {
		return Pa�s;
	}

	public void setPa�s(String pa�s) {
		Pa�s = pa�s;
	}
}