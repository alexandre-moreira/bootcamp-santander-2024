# Operacoes basicas com List

## 1. Lista de tarefas
    Crie uma classe chamada "ListaTarefas" que possui uma lista de tarefas como atributo. Cada tarefa é representada por uma classe chamada "Tarefa" que possui um atributo de descricao. Implemente os seguintes metodos:

    * adicionarTarefa(String descricao): Adiciona uma nova tarefa a lista com a descricao fornecida.
    * removerTarefa(String descricao): Remove uma tarefa da lista com base na sua descricao.
    * obterNumeroTotalTarefas(): Retorna o numero total de tarefas na lista.
    * obterDescricoesTarefas(): Retorna uma lista, contendo a descricao de todas as tarefas a lista.
    
## 2. Carrinho de compras
    Crie uma classe chamada "CarrinhoDeCompras", que representa um carrinho de compras online. O carrinho deve ser implementado como uma lista de itens.
    Cada item é representado pr uma classe chamada "item" que possui atributos como nome, preco e quantidade, Implemente ps seguintes métodos:

    * adicionarItem(String nome, double preco, int quantidade): Adiciona um item ao carrinho com nome, preco e quantidade especificados.
    * removerItem(String nome): Remove um item do carrinho com base o seu nome.
    * calcularValorTotal(): Calcula e retorna o valor do carrinho, levando em consideracao o preco e a quantidade de cada um.
    * exibirItems(): Exibe todos os itens presentes no carinho. mostrando seus nomes. precos e quatidades.