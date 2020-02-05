package test.data_structures;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import model.data_structures.*;

public class ListaEnlazadaTest 
{	
	/**
	 * Lista enlazada sencilla de tipo integer
	 */
	private ListaEnlazada<Integer> listaEnlazada;
	
	/**
	 * Lista enlazada sencilla de tipo String
	 */
	private ListaEnlazada<String> listaEnlazada1;
	
	public ListaEnlazadaTest() 
	{
		listaEnlazada = new ListaEnlazada<Integer>();
		listaEnlazada1 = new ListaEnlazada<String>();
	}

	/**
	 * Escenario 1: Crea una lista enlazada de tipo integer
	 */
	@Before
	public void setupEscenario1( )
	{
		listaEnlazada.agregarNodoFinal(1);
		listaEnlazada.agregarNodoFinal(2);
		listaEnlazada.agregarNodoFinal(3);
		listaEnlazada.agregarNodoFinal(4);
	}

	/**
	 * Escenario 2: Crea una lista enlazada de tipo string
	 */
	@Before
	public void setupEscenario2( )
	{
		listaEnlazada1.agregarNodoPrincipio("Hola");
		listaEnlazada1.agregarNodoFinal("como");
		listaEnlazada1.agregarNodoFinal("estas");
		listaEnlazada1.agregarNodoFinal("hoy");
		listaEnlazada1.agregarNodoFinal("?");
	}
	
	/**
	 * Prueba 1: Verifica el constructor de la lista enlazada no sea null
	 */
	@Test
	public void testListaEnlazada() 
	{	
		setupEscenario1();
		setupEscenario2();
		
		assertNotNull("La lista deberia no ser null", listaEnlazada != null && listaEnlazada1 != null);
	}

	/**
	 * Prueba 2: Agrega un nodo al principio de la lista se verifica revisando su tamaño
	 */
	@Test
	public void testAgregarNodoPrincipio() 
	{
		setupEscenario1();
		listaEnlazada.agregarNodoPrincipio(5);
		assertEquals("El elemento no se agrego adecuadamente a la lista", 4, listaEnlazada.darTamnaioLista());
		
		setupEscenario2();
		listaEnlazada1.agregarNodoPrincipio("Bien");
		assertEquals("El elemento no se agrego adecuadamente a la lista", 5, listaEnlazada.darTamnaioLista());
	}

	/**
	 * Prueba 3: Agrega un nodo al final de la lista se verifica revisando su tamaño
	 */
	@Test
	public void testAgregarNodoFinal() 
	{
		setupEscenario1();
		listaEnlazada.agregarNodoFinal(5);
		listaEnlazada.agregarNodoFinal(6);
		assertEquals("El elemento no se agrego adecuadamente a la lista", 6, listaEnlazada.darTamnaioLista());
		
		setupEscenario2();
		listaEnlazada1.agregarNodoFinal("Bien Bien");
		listaEnlazada1.agregarNodoFinal("y tu?");
		assertEquals("El elemento no se agrego adecuadamente a la lista", 7, listaEnlazada.darTamnaioLista());
	}

	/**
	 * Prueba 4: Elimina un nodo al principio de la lista se verifica revisando su tamaño que haya disminuido
	 */
	@Test
	public void testEliminarNodoPrincipio() 
	{
		setupEscenario1();
		listaEnlazada.eliminarNodoPrincipio();
		assertEquals("El elemento no se agrego adecuadamente a la lista", 2, listaEnlazada.darTamnaioLista());
		
		setupEscenario2();
		listaEnlazada1.eliminarNodoPrincipio();
		assertEquals("El elemento no se agrego adecuadamente a la lista", 3, listaEnlazada1.darTamnaioLista());
	}

	/**
	 * Prueba 5: Elimina un nodo que ingresa como parametro el objeto a elminar, se revisa que su tamaño haya disminuidp
	 */
	@Test
	public void testEleminarNodo() 
	{
		setupEscenario1();
		listaEnlazada.eleminarNodo(3);
		assertEquals("El elemento no se agrego adecuadamente a la lista", 2, listaEnlazada.darTamnaioLista());
		
		setupEscenario2();
		listaEnlazada1.eleminarNodo("Hola");
		assertEquals("El elemento no se agrego adecuadamente a la lista", 3, listaEnlazada1.darTamnaioLista());
	}

	/**
	 * Prueba 6: Verifica que el tamaño de la lista sea correcto, en caso contrario manda un error
	 */
	@Test
	public void testDarTamnaioLista() 
	{
		assertEquals("El tamaño de la lista no es correcto", 4, listaEnlazada.darTamnaioLista());
		assertEquals("El tamaño de la lista no es correcto", 5, listaEnlazada1.darTamnaioLista());
	}

	/**
	 * Prueba 7: Verifica que el objeto buscado sea diferente de null y en el otro caso que el objeto buscado sea null
	 */
	@Test
	public void testVerObjeto() 
	{
		setupEscenario1();
		assertNotNull("El objeto no deberia se nulo", listaEnlazada.verObjeto(0) != null);
		assertNotNull("El objeto no deberia se nulo", listaEnlazada.verObjeto(1) != null);
		assertNotNull("El objeto deberia se nulo", listaEnlazada.verObjeto(10) != null);
		
		setupEscenario2();
		assertNotNull("El objeto no deberia se nulo", listaEnlazada1.verObjeto(0) != null);
		assertNotNull("El objeto no deberia se nulo", listaEnlazada1.verObjeto(1) != null);
		assertNotNull("El objeto deberia se nulo", listaEnlazada1.verObjeto(10) != null);
	}
}
