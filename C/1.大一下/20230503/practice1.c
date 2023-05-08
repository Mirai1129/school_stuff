#include <stdlib.h>
#include <stdio.h>

#define SIZE 4
void Show(int arr[]);
void Add(int arr[]);
int main(void)
{
    int List1[SIZE] = {14, 25, 30, 56};
    Show(List1);
    Add(List1);
    Show(List1);
    system("PAUSE");
    return 0;
}

void Show(int arr[])
{
    int i;
    for (i = 0; i < SIZE; i++)
    {
        printf("%d ", arr[i]);
    }
    printf("\n");
}

void Add(int arr[])
{
    int i;
    for (i = 0; i < SIZE; i++)
    {
        arr[i] += 10;
    }
}