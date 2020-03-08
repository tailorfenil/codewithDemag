package LCString.Trie;

public class TrieUsingHashMap {

    TrieNodeUsingHashMap trieNode;

    public TrieUsingHashMap(){
        trieNode= new TrieNodeUsingHashMap();
    }

    public TrieNodeUsingHashMap getTrieNode(){
        return trieNode;
    }

    public void insert(String word){
        TrieNodeUsingHashMap root= trieNode;
        for(int i=0;i<word.length();i++){

            if(root.containsKey(word.charAt(i))){
                root= root.get(word.charAt(i));
            }
            else{
                root.incrementChildren();
                root.put(word.charAt(i),new TrieNodeUsingHashMap());
                root=root.get(word.charAt(i));
            }
        }
        root.setEnd();

    }

    public TrieNodeUsingHashMap searchPrefix(String prefix){
        TrieNodeUsingHashMap root= trieNode;

        for(int i=0;i<prefix.length();i++){
            if(root.containsKey(prefix.charAt(i))){
                root=root.get(prefix.charAt(i));
            }
            else{
                return null; // which means trie doesn't have that prefix character and thus we should return null
            }
        }
        return root; // it will return the node where prefix ends
    }

    public boolean isWord(String word){
        TrieNodeUsingHashMap node= searchPrefix(word);
        return node!=null && node.isEnd();

    }

    public int countChildren(TrieNodeUsingHashMap trieNode){
//        int cnt=0;
//        for(int i=0;i<26;i++){
//            if(trieNode.links[i]!=null){
//                cnt++;
//            }
//        }
        return trieNode.countChildern();
    }
}
