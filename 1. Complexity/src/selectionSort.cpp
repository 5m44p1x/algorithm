#include <iostream>

using namespace std;

void printArray(int arr[], int size)
{
    for(int i = 0; i < size; i++)
    {
        cout << arr[i] << ", ";
    }
    cout << endl;
}

void selectionSort(int arr[], int n)
{
    int i, j, min_index;

    for(i = 0; i < n - 1; i++)
    {
        min_index = i;

        for(j = i + 1; j < n; j++)
        {
            if(arr[j] < arr[min_index])
            {
                min_index = j;
            }
        }

        if(min_index != i)
        {
            swap(arr[min_index], arr[i]);
        }
    }
}

int main()
{
    int arr[] = {65, 25, 12, 22, 11};
    int n = sizeof(arr) / sizeof(arr[0]);

    selectionSort(arr, n);
    printArray(arr, n);

    return 0;
}