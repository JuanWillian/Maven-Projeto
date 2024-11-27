package br.com.aurora.drogaria.dao;

import br.com.aurora.drogaria.model.Produto;

public class ProdutoDao extends GenericDao<Produto>{

	public ProdutoDao(Class<Produto> classe) {
		super(classe);
	}
   
}
