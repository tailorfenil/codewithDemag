import java.util.Arrays;

public class KClosestPointsWithQuickSelect {

    public int[][] kClosest(int[][] points, int K) {

        if(K>=points.length) return points;

        if(points==null)
            return null;


       int i = kClosestHelper(points,0,points.length-1,K);
       return Arrays.copyOfRange(points,0,i);

    }

    public int kClosestHelper(int[][] points, int low,int high, int k){

        if(low>=high) return low;

        int i = partition(points,low,high);

        if (i == k)
            return  i;

        else if(k<i)
            return kClosestHelper(points,low,i-1,k);

        else
            return kClosestHelper(points,i+1,high,k);

    }

    public int partition(int[][] points,int low,int high){

        int[] pivot= points[low];

        int orange=low;

        for(int green=low+1;green<=high;green++){

            if(compare(points[green],pivot)<0){
                orange++;
                swap(points[orange],points[green]);
            }

        }
        swap(points[orange],pivot);

        return orange;

    }

    public int compare(int[] point1, int[] point2){

        return (point1[0]*point1[0] + point1[1]*point1[1]) - (point2[0]*point2[0] + point2[1]*point2[1]);

    }


    public void swap(int[] point1, int[] point2){

        int[] temp= new int[point1.length];

        temp[0]=point1[0];
        temp[1]=point1[1];

        point1[0]=point2[0];
        point1[1]=point2[1];

        point2[0]=temp[0];
        point2[1]=temp[1];


    }


}
