package br.com.aurora.main;

import org.hibernate.Session;

import br.com.aurora.drogaria.util.HibernateUtil;

public class HibernateUtilTest {
	public static void main(String[] args) {
	
	Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
	sessao.close();
	HibernateUtil.getFabricaDeSessoes().close();
	}
}
