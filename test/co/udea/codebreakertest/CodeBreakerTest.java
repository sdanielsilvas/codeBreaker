package co.udea.codebreakertest;
import co.udea.codebreaker.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class CodeBreakerTest {

	Codebreaker c = new Codebreaker("2891");
	
	@Test
	public void probar_todos_correctos_posicion() {
		String resultado = c.analizar("2891");
		assertEquals("XXXX",resultado);	
	} 
	
	@Test
	public void probar_uno_correcto_posicion() {
		String resultado = c.analizar("2000");
		assertEquals("X",resultado);	
	} 

	@Test
	public void probar_dos_correcto_posicion() {
		String resultado = c.analizar("0890");
		assertEquals("XX",resultado);	
	} 
	
	@Test
	public void probar_tres_correcto_posicion() {
		String resultado = c.analizar("0891");
		assertEquals("XXX",resultado);	
	} 
	
	@Test
	public void probar_uno_existe_fuera_posicion() {
		String resultado = c.analizar("1000");
		assertEquals("_",resultado);	
	} 
	@Test
	public void probar_dos_existe_fuera_posicion() {
		String resultado = c.analizar("1080");
		assertEquals("__",resultado);	
	} 
	
	@Test
	public void probar_tres_existe_fuera_posicion() {
		String resultado = c.analizar("1280");
		assertEquals("___",resultado);	
	} 
	
	@Test
	public void probar_uno_posicion_uno_fuera_posicion() {
		String resultado = c.analizar("1800");
		assertEquals("X_",resultado);	
	} 
	
	@Test
	public void probar_dos_posicion_uno_fuera_posicion() {
		String resultado = c.analizar("2810");
		assertEquals("XX_",resultado);	
	} 
	@Test
	public void probar_uno_posicion_dos_fuera_posicion(){
		String resultado = c.analizar("2180");
		assertEquals("X__",resultado);
	}
	@Test
	public void todos_fuera_posicion(){
		String resultado = c.analizar("1982");
		assertEquals("____",resultado);
	}
	@Test
	public void no_le_pega_ni_a_uno(){
		String resultado = c.analizar("0000");
		assertEquals("",resultado);
	}
	
	@Test
	public void string_no_valido(){
		String resultado = c.analizar("00000");
		assertEquals("error",resultado);
	}
	@Test
	public void string_no_valido_letra(){
		String resultado = c.analizar("a000");
		assertEquals("error",resultado);
	}
}
