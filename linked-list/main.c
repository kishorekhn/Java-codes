#include<stdio.h>
#include<malloc.h>
#define rdisplay for(tptr = end; tptr; printf("%d ", tptr->data), tptr = tptr->prev);
#define display for(tptr = start; tptr; printf("%d ", tptr->data), tptr = tptr->next);
#define newline printf("\n");

typedef struct Node
{
    int data;
    struct Node* next;
    struct Node* prev;
} NODE;

typedef struct Node* NODEPTR;

NODEPTR start, newnode, tptr, end;

void create(int data)
{
    newnode = (NODEPTR)(malloc(sizeof(NODE)));
    newnode->data = data;
    newnode->next = NULL;
    newnode->prev = NULL;
}

void insert(int data)
{
    create(data);
    if (start == NULL)
    {
        start = end= newnode;
    }
    else
    {
        for (tptr = start; tptr && tptr->data < data; tptr = tptr->next);
        if (tptr == start)
        {
            newnode->next = tptr;
            tptr->prev = newnode;
            start = newnode;
        }
        else if (tptr == NULL)
        {
            end->next = newnode;
            newnode->prev = end;
            end = newnode;
        }
        else
        {
            newnode->prev = tptr->prev;
            newnode->next = tptr;
            tptr->prev->next = newnode;
            tptr->prev = newnode;
        }
    }
}
void search(int data)
{
    for(tptr=start; tptr && tptr->data !=data; tptr = tptr->next);
    printf("\n%s ",(tptr)?"Found": "Not Found");
}
void delete(int data)
{
    for(tptr=start; tptr && tptr->data !=data; tptr = tptr->next);
    if(tptr == NULL)
        return;
    else
    {
        if(tptr == start)
        {
            start -> next -> prev  = start -> prev;
            start = start -> next;
        }
        else if(tptr == end)
        {
            end -> prev -> next = end -> next;
            end = end -> prev;
        }
        else
        {
            tptr -> prev -> next = tptr -> next;
            tptr -> next ->prev = tptr ->prev;
        }
        free(tptr);
    }
}
int main()
{
    insert(5);
    insert(10);
    insert(2);
    insert(100);
    display;
    search(100);
    search(1000);newline;
    display; newline; 
    rdisplay; newline;
    delete(5);
    delete(100);
    delete(2);
    display
}

