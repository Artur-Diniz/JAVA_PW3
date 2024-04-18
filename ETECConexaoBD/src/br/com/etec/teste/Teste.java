package br.com.etec.teste;

import br.com.etec.model.Pessoa;
import br.com.etecconexaobd.Conexao;

import java.sql.Connection;

import br.com.etec.dao.PessoaDAO;

public class Teste {

	public static void main(String[] args) {
				
		Connection con = Conexao.abrirConexao();
		
		Pessoa pessoa = new Pessoa();
		PessoaDAO pessoadao = new PessoaDAO(con);
		
		pessoa.setNome("Caio Moedas");
		pessoa.setEndereco("Rua dos fiéis");
		
		
		System.out.println(pessoadao.inserir(pessoa));
		
		Conexao.fecharConexao(con);
		
	}

}
