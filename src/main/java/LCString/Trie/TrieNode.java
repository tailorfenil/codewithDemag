package LCString.Trie;

public class TrieNode {


    TrieNode[] links;

    boolean isEnd;

    final int R=26;

    int child=0;

    public TrieNode(){
        //Can we use hashMap here ; links=new HashMap<Character,TrieNode>();
        links= new TrieNode[R];
    }

    public boolean containsKey(char ch){
        return links[ch-'a']!=null;
    }

    public TrieNode get(char ch){
        return links[ch-'a'];
    }

    public void put(char ch,TrieNode trieNode){
         links[ch-'a']=trieNode;
    }

    public void setEnd(){
        isEnd=true;
    }

    public boolean isEnd(){
        return isEnd;
    }

    public TrieNode get(int index){
        return links[index];
    }

    public int countChildern(){
        return child;
    }

    public void incrementChildren(){
        child++;
    }



}
