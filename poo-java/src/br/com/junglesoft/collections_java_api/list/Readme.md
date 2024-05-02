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
# Pesquisa em list

## 1. Catálogo de Livros
    Crie uma classe chamada "CatalogoLivros", que possui uma lista de objetos do tipo "Livro""
    como atributo. Cada livro possui atributos como titulo, autor e ano de publicacao.
    Implemente os seguintes métodos:

    * adicionarLivro(String titulo, String autor, int anoPublicacao): Adiciona um livro ao catálogo.

    * pesquisarPorAutor(String autor): Pesquisa livros por autor e retorna uma lista com os livros encontrados.

    * pesquisarPorIntervaloAnos(int anoInicial, int anoFinal): Pesquisa livros publicados em um determinado intervalo de anos e retorna uma lista com os livros encontrados.

    * pesquisarPorTitulo(String): Pesquisa livros por titulo e retorna o primeiro livro encontrado.