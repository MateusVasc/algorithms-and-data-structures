# Busca Linear (Linear Search)

## Introdução
A **busca linear** (ou *linear search*) é um dos algoritmos de busca mais simples e diretos. Ele percorre uma estrutura de dados sequencialmente, verificando cada elemento até encontrar o item desejado ou atingir o final da lista.

Apesar de não ser a abordagem mais eficiente para grandes conjuntos de dados, sua simplicidade e aplicabilidade em listas não ordenadas tornam a busca linear uma solução útil em muitos casos.

---

## Como Funciona?
O algoritmo segue os seguintes passos:

1. Começa no primeiro elemento da lista.
2. Compara o elemento atual com o valor alvo.
3. Se for igual, retorna a posição do elemento.
4. Se não for, passa para o próximo elemento.
5. Repete até encontrar o elemento ou percorrer toda a lista.
6. Se o elemento não for encontrado, retorna um valor indicando falha (exemplo: `-1` ou `null`).

---

## Complexidade de Tempo

A análise do tempo de execução do algoritmo depende do caso específico:

- Melhor caso (O(1)): Quando o elemento procurado está na primeira posição da lista.
- Pior caso (O(n)): Quando o elemento está na última posição ou não está presente.
- Caso médio (O(n)): Em média, o algoritmo precisa percorrer metade dos elementos antes de encontrar o alvo.

A busca linear não é eficiente para grandes volumes de dados, pois seu tempo de execução cresce proporcionalmente ao tamanho da entrada.