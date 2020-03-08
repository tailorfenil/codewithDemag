package LCString.Trie;

import java.util.ArrayList;

public class LongestCommonPrefix {


    public static String longestCommonPrefix(ArrayList<String> al) {

        Trie trie = new Trie();

        for (int i = 0; i < al.size(); i++) {
            trie.insert(al.get(i));
        }

         return walkTrie(trie);
    }

    public static String walkTrie(Trie trie) {

        TrieNode trieNode = trie.getTrieNode();

        StringBuffer sb = new StringBuffer();

        while (trie.countChildren(trieNode) == 1 && (trieNode.isEnd() == false)) {

            for (int i = 0; i < 26; i++) {
                if (trieNode.links[i] != null) {
                    sb.append((char)('a' + (char)i));
                    trieNode = trieNode.links[i];
                    break;
                }
            }
        }
        return sb.toString();
    }
}
