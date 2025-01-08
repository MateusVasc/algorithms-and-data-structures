#include <stdlib.h>

typedef struct Singly_linked_list
{
    void* data;
    singly_linked_list* next;
} singly_linked_list; 

singly_linked_list* new_singly_linked_list(void* data)
{
    singly_linked_list* node = (singly_linked_list*)malloc(sizeof(singly_linked_list));

    if (node == NULL)
    {
        printf("Erro ao alocar memória para o nó\n");
        exit(EXIT_FAILURE);
    }
    
    node->data = data;
    node->next = NULL;

    return node;
}

int main()
{
    return 0;
}