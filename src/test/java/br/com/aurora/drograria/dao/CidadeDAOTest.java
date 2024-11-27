package br.com.aurora.drograria.dao;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.aurora.drogaria.dao.CidadeDao;
import br.com.aurora.drogaria.dao.EstadoDao;
import br.com.aurora.drogaria.model.Cidade;
import br.com.aurora.drogaria.model.Estado;

public class CidadeDAOTest {
	@Test
	@Ignore
	public void salvar() {
		EstadoDao estadoDao = new EstadoDao(null);
		Estado estado = estadoDao.buscar(2L);
		Cidade cidade = new Cidade();
		cidade.setNome("");
		cidade.setEstado(estado);
		CidadeDao cidadeDao = new CidadeDao(null);
		cidadeDao.salvar(cidade);
	}

	@Test
	public void listar() {
		CidadeDao cidadeDao = new CidadeDao(null);
		List<Cidade> lista = cidadeDao.listar();
		for (Cidade cidade : lista) {
			System.out.println("Codigo da cidade: " + cidade.getCodigo());
			System.out.println(cidade.getNome() + "-" + cidade.getEstado().getNome());
			System.out.println("");
		}
	}

	@Test
	@Ignore
	public void excluir() {
		long codigo = 11L;
		CidadeDao cidadeDao = new CidadeDao(null);
		Cidade cidade = cidadeDao.buscar(codigo);
		if (cidade == null) {
			System.out.println("A cidade não foi encontrada");
		} else {
			System.out.println("Antes da remoção:");
			listar();
			cidadeDao.excluir(cidade);
			System.out.println("A cidade foi excluida");
			System.out.println("Apos remoção:");
			listar();
		}
	}

	@Test
	@Ignore
	public void editar() {
		long codigo = 8L;
		CidadeDao cidadeDao = new CidadeDao(null);
		Cidade cidade = cidadeDao.buscar(codigo);
		if (cidade == null) {
			System.out.println("A cidade não foi encontrada");
		} else {
			System.out.println("Antes da remoção:");
			listar();
			cidade.setEstado(null);
			cidade.setNome(null);
			System.out.println("Apos a remoção: ");
			listar();
			 
		}
	}
}
