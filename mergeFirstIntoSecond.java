public class mergeFirstIntoSecond {

    static int[] merger_first_into_second(int[] arr1, int[] arr2) {
        /*
         * Write your code here.
         */
        int firstArray = arr1.length-1;
        int secondArray = arr1.length-1;
        int totalLength = 2*arr1.length-1;

        while(firstArray>=0 && secondArray>=0){
            if(arr1[firstArray]>arr2[secondArray]){
                arr2[totalLength]=arr1[firstArray];
                totalLength--;
                firstArray--;
            }
            else{
                int temp=arr2[secondArray];
                arr2[totalLength]=temp;
                totalLength--;
                secondArray--;
            }
        }
        while(firstArray>=0){
            arr2[totalLength]=arr1[firstArray];
            firstArray--;
            totalLength--;
        }

        while(secondArray>=0){
            arr2[totalLength]=arr2[secondArray];
            secondArray--;
            totalLength--;
        }

        return arr2;

    }
}
