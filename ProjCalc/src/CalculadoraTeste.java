import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTeste {

	@Test
	public void testSomar3com8() {
		int variavel1 = 3;
		int variavel2 = 8;
		int resultadoEsperado = 11;
		Calculadora calc = new Calculadora();
		int resultadoReal = calc.somar(variavel1, variavel2);
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	@Test
	public void testSomar5com5() {
		int variavel1 = 5;
		int variavel2 = 5;
		int resultadoEsperado = 10;
		Calculadora calc = new Calculadora();
		int resultadoReal = calc.somar(variavel1, variavel2);
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	@Test
	public void testMultiplicar2com5() {
		int variavel1 = 2;
		int variavel2 = 5;
		double resultadoEsperado = 10;
		Calculadora calc = new Calculadora();
		double resultadoReal = calc.multiplicar(variavel1, variavel2);
		assertEquals(resultadoEsperado, resultadoReal, 2);
	}
	
	@Test
	public void testSubtracao8com2() {
		int variavel1 = 2;
		int variavel2 = 8;
		int resultadoEsperado = 6;
		Calculadora calc = new Calculadora();
		int resultadoReal = calc.subtrair(variavel1, variavel2);
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	@Test
	public void testDividir10com2() {
		int variavel1 = 10;
		int variavel2 = 2;
		int resultadoEsperado = 5;
		Calculadora calc = new Calculadora();
		int resultadoReal = calc.dividir(variavel1, variavel2);
		assertEquals(resultadoEsperado, resultadoReal);
	}
}

