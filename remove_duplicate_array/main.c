#include <stdio.h>

int main() {
    int array[] = {1, 15, 15,15, 4, 5};
    int size = sizeof(array) / sizeof(array[0]);
    int temp[size];
    int i, j, k = 0;
    
  
    for (i = 0; i < size; i++) 
    {
        
        for (j = 0; j < k; j++)
        {
            if (array[i] == temp[j])
                break;
        }
        
        if (j == k) {
            temp[k++] = array[i];
        }
    }
    
    
    
    // Print unique elements
    for (i = 0; i < k; i++) {
        printf("%d ", temp[i]);
    }
    
    return 0;
}
