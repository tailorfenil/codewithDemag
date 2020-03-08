public class QuickSort {

    public int[] quickSort(int[] arr, int low, int high){

        if (low<high) {

            int p=partition(arr,low,high);

            quickSort(arr,low,p-1);
            quickSort(arr,p+1,high);

        }
        return arr;
    }

    public int partition(int[] arr,int low,int high){

        int pivot = arr[high];

        int i=low,j=low;

        for(j=low;j<high;j++){

            if(arr[j]<pivot){
                int temp= arr[i];
                arr[i]=arr[j];
                arr[j]=temp;

                i++;
            }
        }
        int temp=arr[i];
        arr[i]=pivot;
        arr[high]=temp;

        return i;
    }
}
