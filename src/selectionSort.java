public class SelectionSort {
    static void sort(int arr[], int ind) {
        int minInd = ind;
                for (int i = ind; i <arr.length; i++)
                {
                    if (arr[i] < arr[minInd])
                    {
                        swap(arr[],i,minInd);{
                        minInd = i;
                    }

                    return minInd;
                }

            }


        }}
