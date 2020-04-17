package br.com.automation.steps;

import br.com.automation.function.SearchCepFunction;
import io.cucumber.java.es.Dado;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Entao;

public class SearchSteps {

    SearchCepFunction search = new SearchCepFunction();

    
    @Quando("o ator realizar uma consulta")
    public void o_ator_realizar_uma_consulta() {
	search.searchCep();
    }

    @Entao("o ator deve visualizar os dados referente a consulta")
    public void o_ator_deve_visualizar_os_dados_referente_a_consulta() {
	search.resultFound();
    }
    

    @Dado("que o ator informe um logadouro valido")
    public void que_o_ator_informe_um_logadouro_valido() {
    }

    @Entao("o ator deve visualizar os dados referente ao logadouro informado")
    public void o_ator_deve_visualizar_os_dados_referente_ao_logadouro_informado() {
    }

    @Dado("que o ator informe um logadouro invalido")
    public void que_o_ator_informe_um_logadouro_invalido() {
    }

    @Entao("o ator nao deve visualizar os dados referente ao logadouro informado")
    public void o_ator_nao_deve_visualizar_os_dados_referente_ao_logadouro_informado() {
    }

    @Dado("que o ator informe um logadouro nulo")
    public void que_o_ator_informe_um_logadouro_nulo() {
    }

}
