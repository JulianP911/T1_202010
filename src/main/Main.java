package main;
//import controller.Controller;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.google.gson.Gson;

import model.logic.Comparendo;

public class Main {
	
	public static void main(String[] args) 
	{
//		Controller controler = new Controller();
//		controler.run();
		Gson gson = new Gson();
		BufferedReader br = null;

		try
		{
			br = new BufferedReader(new FileReader("./data/comparendos_dei_2018_small.geojson"));
			Comparendo result = gson.fromJson(br, Comparendo.class);
			
			System.out.println(result.getClase_vehi());
			
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
}
