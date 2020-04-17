#language:pt
@Regressivo @Consulta_Logadouro
Funcionalidade: Pesquisar logadouro

   Contexto: 
    Dado que o ator acesse o site dos correios
    E que o ator navegue ate a pagina Buscar CEP

  @ID0004
  Cenario: Realizar pesquisa de endereço por logadouro valido
    Quando o ator realizar uma consulta
    Entao o ator deve visualizar os dados referente a consulta

  @ID0005
  Cenario: Realizar pesquisa de endereço por logadouro invalido
   Quando o ator realizar uma consulta
    Entao o ator deve visualizar os dados referente a consulta

  @ID0006
  Cenario: Realizar pesquisa de endereço por logadouro nulo
    Quando o ator realizar uma consulta
    Entao o ator deve visualizar os dados referente a consulta
