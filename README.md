# ordenacao-insertion-sort
Algoritmo de ordenação Insertion Sort implementado na linguagem Java. Esse algortimo é responsável por ordenar um array com 10 posições. (por padrão).

O algoritmo Insertion Sort possui complexidade de tempo O(n²), uma das piores performances possíveis na escala "Big O Notation". Apesar do péssimo desempenho, o código é simples e de fácil entendimento, sendo considerado um bom material para estudar o funcionamento de loops e algoritmos em geral.

O funcionamento é bem simples. Utilizamos duas "réguas", A e B, para comparar os índices. A régua A permanece parada a cada iteração do laço (movendo-se somente na atualização do loop), enquanto a régua B percorre todo o conjunto para a esquerda (uma vez que o índice "base" para a régua A é o segundo índice), procurando o valor anterior ao do índice atual. A cada iteração, movemos o menor elemento para seu devido lugar no conjunto, integrando-o à "parte organizada" do array.

Para acessar o código e os comentários explicativos, consulte o diretório: src/InsertionSort/main.java.
