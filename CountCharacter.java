import java.util.HashMap;
import java.util.Map;

public class CountCharacter {

   /* Method_1
    public boolean check(String word, Map<Character, Integer> givenCharsHashMap) {

        HashMap<Character, Integer> wordHashMap = new HashMap<>();

        for (Character ch : word.toCharArray()) {

            if ((!givenCharsHashMap.containsKey(ch))) {
                return false;
            } else if (wordHashMap.containsKey(ch)) {
                wordHashMap.put(ch, wordHashMap.get(ch) + 1);
                if (wordHashMap.get(ch) > givenCharsHashMap.get(ch))
                    return false;
            } else {
                wordHashMap.put(ch, 1);
            }

        }

        return true;

    }

    public int countCharacters(String[] words, String chars) {


        int count = 0;
        Map<Character, Integer> hm = new HashMap<>();

        for (Character ch : chars.toCharArray()) {
            if (hm.containsKey(ch)) {
                hm.put(ch, hm.get(ch) + 1);
            } else {
                hm.put(ch, 1);
            }
        }

        for (String word : words) {
            if (check(word, hm)) {
                count += word.length();
            }
        }

        return count;
    }
    */

    public boolean check(String word,int[] givenIntRepresentOfCharsArray){

        for(Character ch:word.toCharArray()){
            if(givenIntRepresentOfCharsArray[ch-97]>0)
                givenIntRepresentOfCharsArray[ch-97]--;
            else
                return false;
        }
        return true;


    }

    public int countCharacters(String[] words, String chars) {

        int givenIntRepresentOfCharsArray[] = new int[26];

        int count = 0;

        chars = chars.toLowerCase();

        for (Character ch : chars.toCharArray()) {
            givenIntRepresentOfCharsArray[ch - 97]++;
        }

        for (String word : words) {
            if (check(word, givenIntRepresentOfCharsArray)) {

                count += word.length();
            }
        }

        return count;
    }

}
