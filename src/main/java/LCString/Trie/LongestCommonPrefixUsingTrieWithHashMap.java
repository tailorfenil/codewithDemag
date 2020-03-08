package LCString.Trie;

import java.util.ArrayList;

public class LongestCommonPrefixUsingTrieWithHashMap {


    public static String longestCommonPrefix(ArrayList<String> al) {

        TrieUsingHashMap trie = new TrieUsingHashMap();

        for (int i = 0; i < al.size(); i++) {
            trie.insert(al.get(i));
        }

         return walkTrie(trie);
    }

    public static String walkTrie(TrieUsingHashMap trie) {

        TrieNodeUsingHashMap trieNode = trie.getTrieNode();

        StringBuffer sb = new StringBuffer();

        while (trie.countChildren(trieNode) == 1 && (trieNode.isEnd() == false)) {

            for (int i = 0; i < trieNode.getLinks().size(); i++) {
                    sb.append(trieNode.getLinks().entrySet().iterator().next().getKey().charValue());
                    trieNode = trieNode.links.get(trieNode.getLinks().entrySet().iterator().next().getKey());
                    break;
            }
        }
        return sb.toString();
    }
}
