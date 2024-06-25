package br.com.danielsilva.service;

import br.com.danielsilva.dao.ClienteDao;
import br.com.danielsilva.dao.ClienteDaoMock;
import br.com.danielsilva.dao.IClienteDao;

public class ClienteService {

    private IClienteDao clienteDao;

    public ClienteService(IClienteDao clienteDao){
     //    clienteDao = new ClienteDao();
        //  clienteDao = new ClienteDaoMock();
        this.clienteDao = clienteDao;
         salvar();
    }

    public String salvar(){
        clienteDao.salvar();
        return  "sucesso";
    }


}