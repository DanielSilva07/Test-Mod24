package br.com.danielsilva.Test;

import br.com.danielsilva.dao.ContratoDao;
import br.com.danielsilva.dao.ContratoDaoMock;
import br.com.danielsilva.dao.IContratoDao;
import br.com.danielsilva.service.ContratoService;
import br.com.danielsilva.service.IContratoService;
import org.junit.Assert;
import org.junit.Test;

public class ContratoServiceTestTest {

    @Test
    public void salvarTest() {
        ContratoDaoMock mock = new ContratoDaoMock();
        IContratoService service = new ContratoService(mock);
        String retorno = service.salvar();
        Assert.assertEquals("Salvando...", retorno);

    }
    @Test
    public void excluirTest() {
        IContratoDao mock1 = new ContratoDaoMock();
        IContratoService service1 = new ContratoService(mock1);
        String retorno1= service1.excluir();
        Assert.assertEquals("Excluindo...", retorno1);

    }

    @Test
    public void atualizarTeste(){
        IContratoDao mock2 = new ContratoDaoMock();
        IContratoService service = new ContratoService(mock2);
        String retorno2 = service.atualizar();
        Assert.assertEquals("Alterando...", retorno2);
    }
    @Test
    public void buscarTeste(){
        IContratoDao mock3 = new ContratoDaoMock();
        IContratoService service = new ContratoService(mock3);
        String retorno3 = service.buscar();
        Assert.assertEquals("Buscando..." , retorno3);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarNoBancoTest() {

        IContratoDao dao = new ContratoDao();
        IContratoService service1 = new ContratoService(dao);
        String retorno = service1.salvar();
        Assert.assertEquals("Salvando...", retorno);

    }
}