package Teste;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import io.swagger.model.Cliente;

public class ClienteApiTest {
	@Test
	public void cadastraNovoTest(){
		
		//Cenario
		Cliente novoCliente = new  Cliente();
		novoCliente.setId(1);
		
		//Execução
		novoCliente.getId();
		
		
		//Verificação
		Assertions.assertThat(novoCliente.getId());
		
	}

}
