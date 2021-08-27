
@Login
Feature: Testando a funcionalidade de login
  Scenario Outline: Realizar login no site
    Given que usuário está na tela de login
    When efetuada com <nome> e <senha>
    Then dever ser visualizada a página logada

    Examples:
    |  nome  | senha |
    |  Jhon  | 12345 |
    | Henry  | 12345 |
#    | Jhon |       |
#    |      | 12345 |
#    |      |       |