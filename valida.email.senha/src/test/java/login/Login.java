package login;

import org.junit.Test;

import metodos.Metodos;

public class Login {

	Metodos metodos = new Metodos();

	@Test
	public void email() {
		metodos.validarEmail("francisco.ferreira@qa.com.br");
	}

	@Test
	public void senha() {
		metodos.validarSenha("qualidade");
	}

}
