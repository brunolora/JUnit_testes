import static org.junit.Assert.*;

import org.junit.Test;

public class MensageiroTeste {

	@Test
	public void testeMensagemPadrao() {
		String msgEsperada = "Bem vindo, todos voc�s";
		Mensageiro mensagemPadrao = new Mensageiro();
		String msgReal = mensagemPadrao.geraMensagem();
		assertEquals(msgEsperada, msgReal);
	}

}
