Sistema de Aprovação de Empréstimo

Projeto desenvolvido para aplicar o padrão de projeto Chain of Responsibility utilizando Java Puro.

 Objetivo

Simular a análise de um pedido de empréstimo por meio de uma cadeia de validações, onde cada etapa verifica uma regra específica antes de aprovar ou reprovar a solicitação.

 Padrão Utilizado

Chain of Responsibility

A validação ocorre na seguinte ordem:

ValidadorValor → ValidadorRenda → ValidadorScore

Cada classe é responsável por uma única verificação:

✔ Valor do empréstimo

✔ Renda mensal

✔ Score de crédito

Se alguma validação falhar, o processo é interrompido.
Se todas forem aprovadas, o empréstimo é concedido.
