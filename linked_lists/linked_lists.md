# Linked Lists

Este documento apresenta a teoria por trás das **listas encadeadas** (Linked Lists), suas características, vantagens, desvantagens e uma implementação prática desenvolvida em **C**.

---

## 🧠 **O que é uma Linked List?**

Uma **Linked List** é uma estrutura de dados linear composta por uma sequência de nós, onde cada nó armazena:  
1. Um **valor** (dados).  
2. Um **ponteiro** que aponta para o próximo nó na lista (ou `NULL` no caso do último nó).

### Tipos de Linked Lists

1. **Singly Linked List** (Lista Encadeada Simples):  
   Cada nó aponta apenas para o próximo nó.

2. **Doubly Linked List** (Lista Duplamente Encadeada):  
   Cada nó aponta para o próximo e o nó anterior.

3. **Circular Linked List**:  
   O último nó aponta de volta para o primeiro, formando um ciclo.

---

## ✅ **Características**

- **Armazenamento dinâmico**: A memória é alocada conforme necessário, diferentemente de arrays.  
- **Crescimento flexível**: Não é necessário definir um tamanho fixo.  
- **Operações rápidas em inserções e remoções**: Em comparação a arrays, as operações de inserção e remoção em linked lists têm menor custo, desde que o ponteiro esteja corretamente posicionado.  

---

## 📉 **Desvantagens**

- **Acesso sequencial**: Não é possível acessar diretamente um elemento pelo índice (como em arrays).  
- **Overhead de memória**: Cada nó precisa armazenar um ponteiro adicional.  
- **Complexidade extra**: O gerenciamento de ponteiros exige atenção extra para evitar erros como loops ou acessos inválidos.  

---

## 📊 **Complexidade de Tempo**

| Operação             | Singly Linked List | Doubly Linked List | Explicação                              |
|----------------------|--------------------|--------------------|------------------------------------------|
| Busca                | O(n)              | O(n)              | É necessário percorrer os nós sequencialmente. |
| Inserção (início)    | O(1)              | O(1)              | Apenas altera os ponteiros.             |
| Inserção (meio/fim)  | O(n)              | O(n)              | Precisa localizar a posição correta.    |
| Remoção (início)     | O(1)              | O(1)              | Apenas altera os ponteiros.             |
| Remoção (meio/fim)   | O(n)              | O(n)              | Precisa localizar o nó a ser removido.  |

---

## 📌 Desafio: Implementando uma Singly Linked List

### Descrição

Seu desafio é implementar uma **singly linked list (lista encadeada simples)** em **C**. Diferente de um array, uma lista encadeada é composta por **nós**, onde cada nó contém um **valor** e um **ponteiro** para o próximo nó na sequência. O objetivo é praticar a manipulação de ponteiros, alocação dinâmica de memória e operações com listas encadeadas.

Sua implementação deve suportar as seguintes operações:

1. Criar uma lista encadeada vazia  
2. Inserir um elemento no final (push back)  
3. Inserir um elemento no início (push front)  
4. Remover o último elemento (pop back)  
5. Remover o primeiro elemento (pop front)  
6. Buscar um elemento na lista  
7. Imprimir a lista  
8. Liberar toda a memória alocada 

### Requisitos

Crie uma estrutura `LinkedList` com:

- Um ponteiro para o primeiro nó (`head`)  
- Um contador para rastrear o número de elementos (`size`)  

Cada `Node` deve conter:

- Um valor inteiro (`data`)  
- Um ponteiro para o próximo nó (`next`) 

### Funções a Implementar

| Função | Descrição |
| ----------- | ----------- |
| `LinkedList* create_list()` | Cria uma lista encadeada vazia |
| `void push_back(LinkedList* list, int val)` | Adiciona um elemento ao final da lista |
| `void push_front(LinkedList* list, int val)` | Adiciona um elemento ao início da lista |
| `void pop_back(LinkedList* list)` | Remove o último elemento da lista |
| `void pop_front(LinkedList* list)` | Remove o primeiro elemento da lista |
| `int find(LinkedList* list, int val)` | Retorna `1` se o valor existir na lista, caso contrário, `0` |
| `void print_list(LinkedList* list)` | Imprime todos os elementos da lista |
| `void free_list(LinkedList* list)` | Libera toda a memória alocada |

## Exemplo de Uso

```
LinkedList* list = create_list();  

push_back(list, 10);  
push_back(list, 20);  
push_back(list, 30);  
print_list(list); // Saída esperada: 10 -> 20 -> 30 -> NULL  

push_front(list, 5);  
print_list(list); // Saída esperada: 5 -> 10 -> 20 -> 30 -> NULL  

pop_back(list);  
print_list(list); // Saída esperada: 5 -> 10 -> 20 -> NULL  

pop_front(list);  
print_list(list); // Saída esperada: 10 -> 20 -> NULL  

printf("Find 10: %d\n", find(list, 10)); // Saída esperada: 1  
printf("Find 50: %d\n", find(list, 50)); // Saída esperada: 0  

free_list(list);
```

## Saída esperada

```
10 -> 20 -> 30 -> NULL  
5 -> 10 -> 20 -> 30 -> NULL  
5 -> 10 -> 20 -> NULL  
10 -> 20 -> NULL  
Find 10: 1  
Find 50: 0  
```

## 🔥 Desafios Extras (Opcional)

1. Implementar uma Doubly Linked List (`Lista duplamente encadeada`) com ponteiros `next` and `prev`.
2. Implementar uma função `reverse()` que inverte uma lista encadeada.
3. Implemente uma função `sort()` que mantém os elementos ordenados.

---

## 🚀 **Implementação**

A implementação prática pode ser encontrada nos arquivos do diretório. Cada tipo de Linked List possui um arquivo separado:  
- `singly_linked_list.c` / `.c`  
- `doubly_linked_list.c` / `.c`  
- `circular_linked_list.c` / `.c`  

### **Como rodar**
1. Compile o código:  
   ```bash
   gcc singly_linked_list.c -o singly && ./singly
