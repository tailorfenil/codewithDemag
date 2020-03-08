import java.util.HashSet;
import java.util.Set;

public class NumUniqueEmails {

    public int numUniqueEmails(String[] emails) {

        Set<String> hs = new HashSet<>();
        String[] stringArr;
        for(String s:emails){
            stringArr = s.split("@");
            String local= stringArr[0];
            String domain = stringArr[1];
            addToHashMap(local,domain,hs);
        }
        return hs.size();
    }

    public void addToHashMap(String local,String domain, Set<String> hs){

        int indexforplus = local.indexOf("+");

        if(indexforplus>0)
            local=local.substring(0,indexforplus);
        else if(indexforplus==0)
            local="";

        local= local.replaceAll("\\.","");
        hs.add(local+"@"+domain);
    }
}
