package LCString.Trie;

import java.util.HashMap;

public class TrieNodeUsingHashMap {


    HashMap<Character,TrieNodeUsingHashMap> links;

    boolean isEnd;

    int child=0;

    public TrieNodeUsingHashMap(){
        links= new HashMap<Character,TrieNodeUsingHashMap>();
    }

    public boolean containsKey(char ch){
        return links.get(ch)!=null;
    }

    public TrieNodeUsingHashMap get(char ch){
        return links.get(ch);
    }

    public void put(char ch,TrieNodeUsingHashMap trieNodeUsingHashMap){
       links.put(ch,trieNodeUsingHashMap);
    }

    public void setEnd(){
        isEnd=true;
    }

    public boolean isEnd(){
        return isEnd;
    }


    public HashMap<Character,TrieNodeUsingHashMap> getLinks(){
        return links;
    }

    public int countChildern(){
        return child;
    }

    public void incrementChildren(){
        child++;
    }



}
