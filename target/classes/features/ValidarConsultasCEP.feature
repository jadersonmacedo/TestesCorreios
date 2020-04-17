#language:pt
@Regressivo @Consulta_Cep
Funcionalidade: Pesquisar CEP

  Contexto: 
    Dado que o ator acesse o site dos correios
    E que o ator navegue ate a pagina Buscar CEP

  @ID0001
  Cenario: Realizar pesquisa de endereço por cep valido
    Quando o ator realizar uma consulta
    Entao o ator deve visualizar os dados referente a consulta

  @ID0002
  Cenario: Realizar pesquisa de endereço por cep invalido
   Quando o ator realizar uma consulta
    Entao o ator deve visualizar os dados referente a consulta

  @ID0003
  Cenario: Realizar pesquisa de endereço por cep nulo
    Quando o ator realizar uma consulta
    Entao o ator deve visualizar os dados referente a consulta
