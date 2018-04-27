package br.emprestimo.testeUnitario;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import br.emprestimo.modelo.Usuario;

public class UC07CadastrarUsuario {
	public static Usuario usuario;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		usuario = new Usuario();
		usuario.setRa("121221");
		usuario.setNome("Jose da Silva");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test(expected=RuntimeException.class)
	public void CT01UC07CadastrarUsuario_com_ra_invalido_branco() {
		usuario.setRa("");
	}
	@Test(expected=RuntimeException.class)
	public void CT02UC07CadastrarUsuario_com_ra_invalido_nulo() {
		usuario.setRa(null);
	}
	@Test
	public void CT03UC07CadastrarUsuario_obtem_ra_valido() {
		usuario.setRa("121221");
		assertEquals("121221",usuario.getRa());
	}
	@Test(expected=RuntimeException.class)
	public void CT04UC07CadastrarUsuario_com_nome_invalido_branco() {
		usuario.setNome("");
	}
	@Test(expected=RuntimeException.class)
	public void CT05UC07CadastrarUsuario_com_nome_invalido_nulo() {
		usuario.setNome(null);
	}
	@Test
	public void CT06UC07CadastrarUsuario_obtem_nome_valido() {
		usuario.setNome("Jose da Silva");
		assertEquals("Jose da Silva",usuario.getNome());
	}
	@Test
	public void CT07UC07CadastrarUsuario_valida_estado() {
		Usuario resultadoEsperado = new Usuario();
		resultadoEsperado.setRa("121221");
		resultadoEsperado.setNome("Jose da Silva");
		assertTrue(resultadoEsperado.equals(usuario));
	}

}
