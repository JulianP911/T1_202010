package controller;

import java.util.Scanner;

import model.logic.Modelo;
import view.View;

public class Controller 
{

	/**
	 * Instancia del Modelo
	 */
	private Modelo modelo;

	/**
	 * Instancia de la Vista
	 */
	private View view;

	/**
	 * Crear la vista y el modelo del proyecto
	 */
	public Controller ()
	{
		view = new View();
		modelo = new Modelo();
	}

	/**
	 * Metodo run
	 */
	public void run() 
	{
		Scanner lector = new Scanner(System.in);
		boolean fin = false;

		
		while( !fin )
		{
			view.printMenu();
     		String opcion = lector.next();
			
			switch(opcion)
			{
			   case "Opcion1":
				   int tamanio = modelo.darTamano();
				   view.printMessage(modelo.darDatos(0) + " \n");                          // Imprime la informacion basica del primer comparendo
				   view.printMessage(modelo.darDatos(tamanio-1) + " \n");                  // Imprime la informacion basica del ultimo comparendo
				   view.printMessage("El tamanio de la listas es: " + tamanio + " \n");    // Imprime el tamanio de la lista enlazad
		           break;
				   
			   case "Opcion2": 
				   view.printMessage("Ingrese el Objectid para ver la informacion");
				   int entrada = lector.nextInt();
				   view.printMessage(modelo.darDatosPorObjectid(entrada));                  // Imprime la informacion teneindo en cuenta el objectid
				   break;
				   
			   case "Cerrar":
				   view.printMessage("--------- \n Hasta pronto !! \n---------"); 
				   lector.close();
				   fin = true;
				   break;

		       default: 
				   view.printMessage("--------- \n Opcion Invalida !! \n---------");
				   break;
		    }
		}
	}	
}
