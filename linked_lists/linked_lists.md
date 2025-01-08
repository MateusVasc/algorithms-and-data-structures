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

## ⚙️ **Funções Implementadas**

Abaixo estão as principais operações implementadas para este projeto:

### **Singly Linked List**
- **Criação da lista**.  
- **Inserção**: início, meio, fim.  
- **Remoção**: início, meio, fim.  
- **Busca por valor**.  
- **Exibição de todos os elementos**.  

### **Doubly Linked List**
- **Criação da lista**.  
- **Inserção**: início, meio, fim.  
- **Remoção**: início, meio, fim.  
- **Busca por valor** (bidirecional).  
- **Exibição de todos os elementos** (em ordem e reversa).  

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
