package IKGraphs;

import java.util.*;

public class createGraph {

    public static String find_order(String[] words) {

        HashMap<Character, List<Character>> hm =createGraph(words);

        for (Map.Entry<Character,List<Character>> entry : hm.entrySet()) {
            System.out.print("Key = " + entry.getKey() +
                             ", Value =  ");

            for(Character ch:entry.getValue()){
                System.out.print(ch+" ");
            }

            System.out.println();
        }

       return topologicalSort(hm);

    }

    public static HashMap<Character,List<Character>> createGraph(String[] words){

        HashMap<Character,List<Character>> hm = new HashMap<>();

        for(int i=0;i<words.length;i++){
            for(int j=0;j<words[i].length();j++){
                if(!hm.containsKey(words[i].charAt(j)));
                 hm.put(words[i].charAt(j), new ArrayList<>());
            }
        }

        //createEdges(words,hm);

        return hm;

    }

    public static HashMap<Character,List<Character>> createEdges(String[] words,HashMap<Character,List<Character>> hm){

        for(int i=0;i<words.length-1;i++){
            int minLength = Math.min(words[i].length(),words[i+1].length());
            for(int j=0;j<minLength;j++) {
                if (words[i].charAt(j) != words[i + 1].charAt(j)) {
                    createEdge(words[i].charAt(j), words[i + 1].charAt(j), hm);
                    break;
                }
            }
        }

        return hm;
    }

    public static HashMap<Character,List<Character>> createEdge(Character word1,Character word2,HashMap<Character,List<Character>> hm){
        hm.get(word1).add(word2);
        return hm;
    }

    public static String topologicalSort(HashMap<Character,List<Character>> hm){

        Set<Character> visited = new HashSet<>();
        Stack<Character> stack = new Stack<>();

        for(Character vertex:hm.keySet()){
            if(!visited.contains(vertex)){
                visited.add(vertex);
                topologicalSortHelper(hm,vertex,visited,stack);
            }
        }

        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.toString();
    }


    public static Stack<Character> topologicalSortHelper(HashMap<Character,List<Character>> hm,Character vertex,Set<Character> visited,
                                      Stack<Character> stack){

        for(Character neighbour : hm.get(vertex)) {
            if(!visited.contains(neighbour)) {
                visited.add(neighbour);
                topologicalSortHelper(hm, neighbour, visited,stack);
            }
        }
        stack.push(vertex);
        return  stack;
    }
}
