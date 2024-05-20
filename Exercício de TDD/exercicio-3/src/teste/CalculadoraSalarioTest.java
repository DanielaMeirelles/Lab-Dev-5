package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import main.Cargo;
import main.Funcionario;

public class CalculadoraSalarioTest {

	@Test
	public void testSalarioDesenvolvedorAcima3000() {
		Funcionario desenvolvedor = new Funcionario("João", "joao@example.com", 4000, Cargo.DESENVOLVEDOR);
		assertEquals(3200, desenvolvedor.calcularSalarioLiquido(), 0.001);
	}
	
	@Test
    public void testSalarioDesenvolvedorAbaixo3000() {
        Funcionario desenvolvedor = new Funcionario("Maria", "maria@example.com", 2000, Cargo.DESENVOLVEDOR);
        assertEquals(1800, desenvolvedor.calcularSalarioLiquido(), 0.001);
    }

    @Test
    public void testSalarioDBAAcima2000() {
        Funcionario dba = new Funcionario("Carlos", "carlos@example.com", 2500, Cargo.DBA);
        assertEquals(1875, dba.calcularSalarioLiquido(), 0.001);
    }

    @Test
    public void testSalarioDBAAbaixo2000() {
        Funcionario dba = new Funcionario("Ana", "ana@example.com", 1500, Cargo.DBA);
        assertEquals(1275, dba.calcularSalarioLiquido(), 0.001);
    }

    @Test
    public void testSalarioTestadorAcima2000() {
        Funcionario testador = new Funcionario("Pedro", "pedro@example.com", 2200, Cargo.TESTADOR);
        assertEquals(1650, testador.calcularSalarioLiquido(), 0.001);
    }

    @Test
    public void testSalarioTestadorAbaixo2000() {
        Funcionario testador = new Funcionario("Lucia", "lucia@example.com", 1800, Cargo.TESTADOR);
        assertEquals(1530, testador.calcularSalarioLiquido(), 0.001);
    }

    @Test
    public void testSalarioGerenteAcima5000() {
        Funcionario gerente = new Funcionario("Ricardo", "ricardo@example.com", 6000, Cargo.GERENTE);
        assertEquals(4200, gerente.calcularSalarioLiquido(), 0.001);
    }

    @Test
    public void testSalarioGerenteAbaixo5000() {
        Funcionario gerente = new Funcionario("Roberta", "roberta@example.com", 4000, Cargo.GERENTE);
        assertEquals(3200, gerente.calcularSalarioLiquido(), 0.001);
    }

}
