package Microsoft;

public class StringwithNo3IdenticalConsecutiveLetters {


    public String solution(String s){

        StringBuilder sb = new StringBuilder();

        for(int i=0;i<s.length();){
            sb.append(s.charAt(i));
            int j=i;
            int count=0;

            while(j+1<s.length() && s.charAt(j)==s.charAt(j+1)){

                count++;

                if(count<2){
                    sb.append(s.charAt(j+1));
                }
                j++;
            }

            i=j+1;

        }

        return sb.toString();

    }

}

/*

def nocons(s: str) -> str:
    news = s[0:2]
    for i in range(2, len(s)):
        if s[i] == s[i-1] and s[i] == s[i-2]:
            # Do not append if the previous chars are the same
            continue
        else:
            news += s[i]
    return news
 */
