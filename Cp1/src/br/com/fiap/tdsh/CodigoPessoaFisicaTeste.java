package br.com.fiap.tdsh;

import static org.junit.Assert.*;

import org.junit.Test;

public class CodigoPessoaFisicaTeste {

	@Test
	public void testCpfCerto() {
		boolean resultadoEsperado = true;
		boolean resultadoReal;
		String cpf = "54030087809";
		CodigoPessoaFisica codigo = new CodigoPessoaFisica();
		resultadoReal = codigo.validaCPF(cpf);
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	@Test
	public void testCpfErrado() {
		boolean resultadoEsperado = false;
		boolean resultadoReal;
		String cpf = "11144477705";
		CodigoPessoaFisica codigo = new CodigoPessoaFisica();
		resultadoReal = codigo.validaCPF(cpf);
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	@Test
	public void testRemocaoCaracEspeciais() {
		String resultadoEsperado = "54030087809";
		String resultadoReal;
		String cpf = "540.300.878-09";
		CodigoPessoaFisica codigo = new CodigoPessoaFisica();
		resultadoReal = codigo.removeCaracteresEspeciais(cpf);
		assertEquals(resultadoEsperado, resultadoReal);
	}

}
