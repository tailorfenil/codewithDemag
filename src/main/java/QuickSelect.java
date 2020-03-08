public class QuickSelect {

    public int quickSelect(int[] a,int k){

       return quickSelectHelper(a,0,a.length-1,a.length-k);

    }

    public int quickSelectHelper(int[] a,int low,int high, int k){

        if(low>=high)
            return a[low];


                int pivot=low;
                int orange= low;
                for(int green=low+1;green<=high;green++){

                    if(a[green]<a[pivot]){
                        orange++;
                        int temp= a[orange];
                        a[orange]=a[green];
                        a[green]=temp;
                    }
                }
                int temp=a[orange];
                a[orange]=a[pivot];
                a[low]=temp;

                if(orange==k)
                     return a[orange];

                else if(k<orange)
                   return quickSelectHelper(a,low,orange-1,k);

                else
                   return quickSelectHelper(a,orange+1, high,k);

    }
}