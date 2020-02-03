package model.logic;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.google.gson.Gson;

import Infracciones.Example;
import model.data_structures.*;

/**
 * Definicion del modelo del mundo
 *
 */
public class Modelo 
{
	/**
	 * Atributos del modelo del mundo
	 */
	private IListaEnlazada<Object> datos;

	/**
	 * Constructor del modelo del mundo
	 */
	public Modelo()
	{
		Gson gson = new Gson();
		BufferedReader br = null;

		try
		{
			br = new BufferedReader(new FileReader("./data/comparendos_dei_2018_small.geojson"));
			Example result = gson.fromJson(br, Example.class);

			for(int  i = 0; i < result.getFeatures().size(); i ++)
			{
				datos.agregarNodoFinal(result.getFeatures().get(i));
			}
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		} 
		finally
		{
			if(br != null)
			{
				try 
				{
					br.close();
				} 
				catch (IOException e) 
				{
					e.printStackTrace();
				}
			}
		}
	}

	/**
	 * Servicio de consulta de numero de elementos presentes en el modelo 
	 * @return numero de elementos presentes en el modelo
	 */
	public int darTamano()
	{
		return datos.darTamnaioLista();
	}
	
	public String datosObjeto(int pPosicion)
	{
		Object objeto = datos.verObjeto(pPosicion);
		return null;	
	}
}
