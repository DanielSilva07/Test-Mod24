package br.com.danielsilva.service;

import br.com.danielsilva.dao.ContratoDao;
import br.com.danielsilva.dao.IContratoDao;

public class ContratoService implements IContratoService {

    private IContratoDao contratoDao;

    public ContratoService(IContratoDao mockService){
        ContratoDao contratoDao = new ContratoDao();
        this.contratoDao = contratoDao;
        this.contratoDao= mockService;
        excluir();
        salvar();
        atualizar();
        buscar();
    }

    public String salvar() {
        contratoDao.salvar();
        return "Salvando...";
    }


    public String excluir() {
        contratoDao.excluir();
        return "Excluindo...";
    }

    @Override
    public String atualizar() {
        contratoDao.atualizar();
        return "Alterando...";
    }

    @Override
    public String buscar() {
       contratoDao.buscar();
        return "Buscando...";
    }
}
