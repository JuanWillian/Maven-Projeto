package br.com.aurora.drograria.dao;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.aurora.drogaria.dao.EstadoDao;
import br.com.aurora.drogaria.model.Estado;

public class EstadoDAOTest {
	@Ignore
	@Test
	public void salvar() {
		Estado estado = new Estado();
		estado.setNome("Rio Grande Do Sul");
		estado.setSigla("RS");
		EstadoDao estadoDAO = new EstadoDao(null);
		estadoDAO.salvar(estado);
	}

	@Test
	@Ignore
	public void listar() {
		EstadoDao estadoDao = new EstadoDao(null);
		List<Estado> resultado = estadoDao.listar();
		for (Estado estado : resultado) {
			System.out.println(estado.getNome() + "-" + estado.getSigla());
		}
	}

	@Test
	@Ignore
	public void buscar() {
		Long codigo = 5L;
		EstadoDao estadoDao = new EstadoDao(null);
		Estado estado = estadoDao.buscar(codigo);
		if (estado == null) {
			System.out.println("O registro não foi encontrado!");
		} else {
			System.out.println("Registro encontrado");
			System.out.println(estado.getNome() + "-" + estado.getSigla());
		}
	}

	@Test
	@Ignore
	public void excluir() {
		Long codigo = 9L;
		EstadoDao estadoDao = new EstadoDao(null);
		Estado estado = estadoDao.buscar(codigo);
		if (estado == null) {
			System.out.println("Nenhum registro encontrado");
		} else {
			estadoDao.excluir(estado);
			System.out.println("Registro excluido");
			System.out.println(estado.getNome() + "-" + estado.getSigla());
		}
	}

	@Test
	public void editar() {
		Long codigo = 11L;
		EstadoDao estadoDao = new EstadoDao(null);
		Estado estado = estadoDao.buscar(codigo);
		if (estado == null) {
			System.out.println("Nenhum registro encontrado");
			System.out.println("Favor digite um codigo valido");
		} else {
			estado.setNome("Distrito Federal");
			estado.setSigla("DF");
			estadoDao.editar(estado);
			
		}
	}
}
