package IKWebSorting;

import java.util.List;

public class NearestNeighbour {

    public static List<List<Integer>> nearest_neighbours(int p_x, int p_y, int k, List<List<Integer>> n_points) {
        // Write your code here

        int i= quickSelectHelper(n_points,0,n_points.size()-1,k-1,p_x,p_y);

        return n_points.subList(0,k);

    }

    public static int quickSelectHelper(List<List<Integer>> n_points, int low, int high,int k,int x, int y){

        if(low>=high)
            return low;

        int index= partition(n_points,low,high,x,y);

        if(k==index)
            return index;

        else if(k<index)
            return quickSelectHelper(n_points,low,index-1,k,x,y);

        else
            return quickSelectHelper(n_points,index+1,high,k,x,y);
    }

    public static int partition(List<List<Integer>> n_points, int low, int high,int x,int y){

        List<Integer> pivot = n_points.get(low);
        int orange= low;

        for(int green=low+1;green<=high;green++){
            if(compare(n_points.get(green),pivot,x,y)<0){
                orange++;
                swap(green,orange,n_points);
            }
        }
        swap(low,orange,n_points);

        return orange;

    }

    public static int compare(List<Integer> point1,List<Integer> point2,int x, int y){

        return ((point1.get(0)-x)*(point1.get(0)-x)+ (point1.get(1)-y)*(point1.get(1)-y)) - ((point2.get(0)-x)*(point2.get(0)-x) + (point2.get(1)-y)*(point2.get(1)-y));

    }

    public static void swap(int point1,int point2, List<List<Integer>> points){
        List<Integer> temp= points.get(point1);
        points.set(point1,points.get(point2));
        points.set(point2,temp);
    }
}

