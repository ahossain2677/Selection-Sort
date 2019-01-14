public class SelectionSort
{
    static int sort(int arr[], int ind)
    {
        int minInd = ind;

        for (int i = ind; i <arr.length; i++)
        {
            if (arr[i] < arr[minInd])
            {
                swap(arr,i,minInd);
                {
                minInd = i;
                }

            }

        }
        return minInd;
    }
    // Swap method to switch vales arr[i] an arr[j]
    public static void swap(int[] arr, int i , int j)
    {
        int x = arr[i];
        arr[i] = arr[j];
        arr[j] = x;

    }
    public static void int minInd(int [] arr, int minInd )
    {
        int min = arr[minInd];
        for (int i = minInd; i<arr.length;i++)
        {
            if (arr[i] < minInd){
                minInd = arr[i];
            }
            return minInd;
        
}
}
