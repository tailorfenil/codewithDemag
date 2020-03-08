package LCString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReorderLogFiles {

    //LC Solution
//    public static String[] reorderLogFiles(String[] logs) {
//        Arrays.sort(logs, (log1, log2) -> {
//            String[] split1 = log1.split(" ", 2);
//            String[] split2 = log2.split(" ", 2);
//            boolean isDigit1 = Character.isDigit(split1[1].charAt(0));
//            boolean isDigit2 = Character.isDigit(split2[1].charAt(0));
//            if (!isDigit1 && !isDigit2) {
//                int cmp = split1[1].compareTo(split2[1]);
//                if (cmp != 0) return cmp;
//                return split1[0].compareTo(split2[0]);
//            }
//            return isDigit1 ? (isDigit2 ? 0 : 1) : -1;
//        });
//        return logs;
//    }

    public static String[] reorderLogFiles(String[] logs) {


        List<String> letter = new ArrayList<>();
        List<String> digits = new ArrayList<>();

        for(String val:logs){

            String[] split = val.split(" ");

            if(split[1].charAt(0)>='a' && split[1].charAt(0)<='z'){
                letter.add(val);
            }
            else{
                digits.add(val);
            }

        }

        Collections.sort(letter,(o1,o2)->{

            String[] splito1 = o1.split(" ");
            String[] splito2= o2.split(" ");

            for(int i=1;i<Math.min(splito1.length,splito2.length);i++){

                if(!(splito1[i].equals(splito2[i]))){
                  return splito1[i].compareTo(splito2[i]);
                }
            }
            return splito1[0].compareTo(splito2[0]);

        });

        for(int i=0;i<logs.length;i++){
            while(i<letter.size()){
                logs[i]=letter.get(i);
                i++;
            }
            logs[i]=digits.get(i-letter.size());

        }

        return logs;

    }
}
