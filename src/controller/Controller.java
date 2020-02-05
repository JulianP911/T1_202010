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
			   case "Opcion 1":
				   int tamanio = modelo.darTamano();
				   view.printMessage(modelo.darDatos(0));           // Imprime la informacion basica del primer comparendo
				   view.printMessage(modelo.darDatos(tamanio-1));   // Imprime la informacion basica del ultimo comparendo
				   view.printMessage(tamanio + " ");                // Imprime el tamanio de la lista enlazad
		        
			   case "Opcion 2": 
				   view.printMessage("Ingrese el Objectid para ver la informacion");
				   int entrada = lector.nextInt();
				   view.printMessage(modelo.darDatosPorObjectid(entrada));
				   
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
