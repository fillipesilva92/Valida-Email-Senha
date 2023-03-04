package metodos;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Metodos {
	
	
	public void validarEmail(String emailCapturado) {
		String emailEsperado = "francisco.ferreira@qa.com.br";
		assertEquals(emailCapturado, emailEsperado);
	}
	
	public void validarSenha(String senhaCapturada) {
		String senhaEsperada = "qualidade";
		assertEquals(senhaCapturada, senhaEsperada);
	}
}
