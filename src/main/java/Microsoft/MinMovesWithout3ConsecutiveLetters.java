package Microsoft;

public class MinMovesWithout3ConsecutiveLetters {

    //aaa
    //aaaa
    //aaaaa
    //aaaaaa
    //aacccaaabbbcccccccc

    public int solution(String s){

        int count=0;

        for(int i=0;i<s.length()-1;){
            int j=i;
            while(j<s.length()-1 && s.charAt(j+1)==s.charAt(j) ){
                j++;
            }
            count+=(j-i+1)/3;

            i=j;
            i++;
        }
        return count;
    }

}
