package Microsoft;

public class MaxInsertWithout3ConsecutiveAs {

    public  static int maxA(String s){

        int i=0,j=0,cnt=0;

        while(i<s.length() && j<s.length()){

            if(s.charAt(j)=='a'){

                j++;

                if(j-i==3){
                    return -1;
                }

            }
            else {

                if (j != 0 && s.charAt(j - 1) == 'a') {
                    cnt += 2 - (j - i);
                }
                else{
                    cnt+=2;
                }

                i = j;
                i++;
                j++;

            }

        }
        if(s.charAt(s.length()-1)!='a'){
            cnt+=2;
        }
        if(s.charAt(s.length()-1)=='a'){
            cnt+= 2 - (j - i);
        }
        return cnt;


    }
}
