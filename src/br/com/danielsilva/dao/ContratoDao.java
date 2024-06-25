package br.com.danielsilva.dao;

public class ContratoDao implements IContratoDao {

//
    public void salvar() {
        throw new UnsupportedOperationException("Erro ao salvar com o banco");

    }

    public void excluir() {
        throw new UnsupportedOperationException("Erro ao excluir no banco");

    }

    @Override
    public void atualizar() {
        throw  new UnsupportedOperationException("Erro ao alterar no banco");
    }

    @Override
    public void buscar() {
        throw new UnsupportedOperationException("Erro ao buscar no banco");

    }
}
