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
				   view.printMessage(tamanio + " ");
		       
			   case "Opcion 2": 
				   
				   
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
