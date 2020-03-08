package Microsoft;

public class MaximumPossibleValue {

    public int MaximumPossibleValue(int N){

        int flag = N >=0 ? 1:-1;

        StringBuilder sb = new StringBuilder(String.valueOf(Math.abs(N)));

        int i=0;
        if(N>=0) {
            for(i = 0; i < sb.length(); ) {
                if (sb.charAt(i)-'5'>0){
                    i++;
                }
                else{
                    break;
                }
            }
            sb.insert(i,5);
        }
        else{
            for(i=0;i<sb.length();){

                if(sb.charAt(i)-'5'<0){
                    i++;
                }
                else{
                    break;
                }
            }
            sb.insert(i,5);
        }

        int res = Integer.parseInt(sb.toString());
        if(flag<0){
            return res*flag;
        }
        else{
            return res;
        }


    }

}
