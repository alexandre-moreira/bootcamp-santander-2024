# Fixando os conhecimentos

Exercicios:
    1.Operacoes Basicas com Map.
    2. Pesquisa em Map
    3. Ordenacao nas Map

# Operacoes Básicas com Map

## 1. Agenda de Contatos
    Crie uma classe chamada "AgendaContatos", que utilize um Map para armazenar os contatos. Cada contato possui um nome como chave e um numero de telefone como valor. Implemente os seguintes metodos:

    * adicionarContato(String nome, Integer telefone): Adiciona um contato a agenda, associando o nome do contato ao numero de telefone correspondente.

    * removerContato(String nome): Remove o contato da agenda, dado o nome do contato.

    * exibirContatos(): Exibe todos os contatos da agenda, mostrando o nome e o numero de telefone de cada contato.

    * pesquisarPorNome(String nome): Pesquisa um contato pelo nome e retorna o numero de telefone correspondente.

  # Pesquisa em Map

  ## 1. Estoque de Produtos com Preco.

    Crie uma classe chamada "EstoqueProdutos" que utilize um Map para armazenar os produtos, suas quantidades em estoque seus respectivos precos. Cada produto possui um codigo como chave e um objeto Produto como valor, contendo nome, quantidade e preco. Implemente os seguintes metodos:

    * adicionarProduto(long cod, String nome, int quantidade, double preco): Adiciona um produto ao estoque, juntamente com a quantidade disponivel e o preco.

    * exibirProdutos(): Exibe todos os produtos, suas quantidades em estoque e preco.

    * calcularValorTotalEstoque: Calcula e retorna o valor do estoque, considerando a quantidade e o preco de cada produto.

    * obterProdutoMaisCaro(): Retorna o produto mais caro do estoque, ou seja, aquele com maior preco.
      
    * obterProdutoMaisBarato(): Retorna o produto mais barato do estoque, ou seja, aquele com menor preco.

    * obterProdutoMaiorQuantidadeValorTotalNoEstoque(); Retorna o produto que está em maior quantidade no estoque, considerando o valor total de cada produto(quantidade * preco).

## 2. Contagem de palavras
    Crie uma classe chamada "ContagemPalavras" que utilize um Map para armazenar as palavras e a quantidade de vezes que cada palavra aparece em um texto. Implemente os seguintes metodos:

    * adicionarPalavras(String palavra, Integer contagem): Adiciona uma palavra a contagem.
    * removerPalavras(String palavra): Remover uma palavra da contagem, se estiver presente.
    * exiberContagemPalavras(); Exibe todas as palavras e suas respectivas contagens.
    * encontrarPalavrasMaisFrequentes(): Encontra a palavra mais frequente no texto e retorna a sua palavra e sua contagem.

# Ordenacao nos Maps.

## 1. Agenda de Eventos
    Crie uma classe chamada "AgendaEventos" que utilize um Map para armazenar as datas e seus respectivos Eventos. Cada evento é representado por um objeto da classe "Evento", que possui atributos como nome do evento  e o nome da atracao. Implemente os seguintes metodos:

    * adicionarEvento(LocalDate data, String nome, String atracao): Adiciona um evento a agenda.
    * exibirAgenda(): Exibe a agenda de eventos em ordem crescente de data.
    * obterProximoEvento(): Retorna o proximo evento que ocorrerá.
