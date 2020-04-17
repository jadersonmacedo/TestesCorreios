package br.com.automation.steps;

import br.com.automation.function.WebsiteFunction;
import io.cucumber.java.es.Dado;

public class WebsiteSteps {
    WebsiteFunction website = new WebsiteFunction();

    @Dado("que o ator acesse o site dos correios")
    public void que_o_ator_acesse_o_site_dos_correios() {
	 website.navigateToPage();
    }

    @Dado("que o ator navegue ate a pagina Buscar CEP")
    public void que_o_ator_navegue_ate_a_pagina_Buscar_CEP() {
	website.navigateToMenu();
    }

}
