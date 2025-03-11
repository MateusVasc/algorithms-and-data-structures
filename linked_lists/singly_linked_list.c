#include <stdlib.h>

typedef struct Node
{
    int data;
    struct Node* next;
} Node;

typedef struct SinglyLinkedList
{
    Node* head;
    size_t size;
} SinglyLinkedList;

int main()
{
    return 0;
}