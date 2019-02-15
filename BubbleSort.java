public class BubbleSort implements SortingAlgorithm {
    @Override
    public void sort(int[] a) {
        int length = a.length;
        for (int i = 0; i < length-1; i++)
            for (int j = 0; j < length-i-1; j++)
                if (a[j] > a[j+1])
                {
                    // swap arr[j+1] and arr[i]
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
    }
}
