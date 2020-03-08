public class DutchFlag {

    public static char[] dutch_flag_sort(char[] balls) {

        //     int red=0;
        //     int greenOrBlue=balls.length-1;

        //     while(balls[red]=='R')
        //       red++;

        //     while(red<greenOrBlue){

        //           if(balls[greenOrBlue]=='R'){
        //             char temp=balls[red];
        //             balls[red]=balls[greenOrBlue];
        //             balls[greenOrBlue]=temp;
        //             red++;
        //           }
        //             greenOrBlue--;
        //     }

        //     // red=0;

        //     int green=red;
        //     int blue=balls.length-1;

        //     while(green<blue){

        //          while(balls[green]=='G')
        //               green++;

        //          while(green<blue){

        //              if(balls[blue]=='G'){

        //             char temp=balls[green];
        //             balls[green]=balls[blue];
        //             balls[blue]=temp;
        //             green++;
        //         }
        //         blue--;
        //     }
        // }


        int start=0,end=balls.length-1,a=0;

        while(start<=end){

            if(balls[start]=='R'){
                swap(balls,start,a);
                a++;start++;
            }
            else if(balls[start]=='B'){
                swap(balls,end,start);
                end--;
            }
            else{
                start++;
            }
        }
    return balls;

    }

    public static void swap(char[] arr, int src, int des){
        char temp= arr[src];
        arr[src]=arr[des];
        arr[des]=temp;

    }
}
