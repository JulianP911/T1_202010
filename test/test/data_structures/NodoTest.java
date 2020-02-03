package test.data_structures;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.data_structures.Nodo;

public class NodoTest <E>
{
	/**
	 * Nodo de tipo entero para hacer test
	 */
	private Nodo<Integer> nodo;
	
	/**
	 * Escenario 1: Crea un nodo de tipo generico.
	 */
	@Before
	public void setupEscenario1( )
	{
		nodo = new Nodo<Integer>(null);
	}
	
	/**
	 * Escenario 2: Crea un nodo pasandole al tipo generico un Integer.
	 */
	@Before
	public void setupEscenario2( )
	{
		nodo =  new Nodo<Integer>(9);
	}

	/**
	 * Prueba 1: Verifica que el constructor de nodo si sea null al inicio y verifica que el objeto coincida
	 */
	@Test
	public void testNodo() 
	{
		setupEscenario1();
		assertEquals("El nodo siguiente deberia ser null", nodo == null);
		
		setupEscenario2();
		assertEquals("El objeto no es correcto con lo esperado", 9, nodo.darObjeto().intValue());
	}

	/**
	 * Prueba 2: Revisa en los dos escenarios el nodo siguiente sea null porque no han sido vinculados
	 */
	@Test
	public void testObtenerNodoSiguiente() 
	{
		setupEscenario1();
		assertNull("El nodo siguiente deberia ser null", nodo.obtenerNodoSiguiente());
		
		setupEscenario2();
		assertNull("El nodo siguiente no deberia ser null", nodo.obtenerNodoSiguiente());
	}

	/**
	 * Prueba 3: Se hacen dos casos en el primero se verifica que al establecer el nodo siguiente sea null y en el otro caso si se vincula a otro nodo que tiene un elemento
	 */
	@Test
	public void testEstablecerNodoSiguiente() 
	{
		setupEscenario1();
		nodo.establecerNodoSiguiente(null);
		assertNull("El nodo siguiente deberia ser null", nodo.obtenerNodoSiguiente());
		
		setupEscenario2();
		Nodo<Integer> nuevo = new Nodo<Integer>(2);
		nodo.establecerNodoSiguiente(nuevo);
		assertNotNull("El nodo siguiente no deberia ser null", nodo.obtenerNodoSiguiente());
	}

	/**
	 * Prueba 4: Verifica que el objeto no tenga un elemento y en el otro caso si tengo un elemento
	 */
	@Test
	public void testDarObjeto() 
	{
		setupEscenario1();
		assertNull("El nodo siguiente deberia ser null", nodo.darObjeto());
		
		setupEscenario2();
		assertNotNull("El nodo siguiente no deberia ser null", nodo.darObjeto());	
	}
}
