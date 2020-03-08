package Microsoft;

public class LongestSemiAlternatingSubString {


    public int solution(String s){

        if(s == null || s.length() == 0)
            return 0;
        if(s.length() < 3)
            return s.length();
        int cnt = 1, l = 0, lastSeen = 0;
        int res = 0;
        for(int r = 1;r < s.length();r++) {
            char c = s.charAt(r);
            if(s.charAt(r-1) == c) {
                cnt++;
            }else {
                cnt = 1;
                lastSeen = r;
            }
            if(cnt > 2 && l < lastSeen)
                l = lastSeen;
            while(cnt > 2) {
                l++;
                cnt--;
            }
            res = Math.max(res, r - l + 1);
        }
        return res;



    }


    public String solutionString(String s){

        int cnt=1,l=0,newElementseen=0,res=0,resl=0,resr=0;


        for(int i=1;i<s.length();i++){

            if(s.charAt(i-1)==s.charAt(i)){
                cnt++;
            }
            else{
                cnt=1;
                newElementseen=i;
            }

            if(cnt>2 && newElementseen>l){
                l=newElementseen;

                while(cnt>2){
                  cnt--;
                  l++;
                }

            }

            if(i-l+1>res){
                res=i-l+1;
                resl=l;
                resr=i+1;
            }


        }

        return s.substring(resl,resr);




    }
}
