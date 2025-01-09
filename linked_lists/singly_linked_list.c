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

singly_linked_list* insert_at_beginning(singly_linked_list* head_node, void* new_data)
{
    singly_linked_list* new_head = (singly_linked_list*)malloc(sizeof(singly_linked_list));

    if (new_head == NULL)
    {
        printf("Erro ao alocar meomória para o nó");
        exit(EXIT_FAILURE);
    }

    new_head->data = new_data;
    new_head->next = head_node;
    
    return new_head;
}

int main()
{
    return 0;
}