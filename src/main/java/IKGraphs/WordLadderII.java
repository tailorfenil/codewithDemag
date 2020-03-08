package IKGraphs;

import java.util.*;


//Todo: need to find the minimum length from result
public class WordLadderII {

    HashMap<String, List<String>> wordMapping = new HashMap<>();

    HashMap<String,Integer> wordIndex = new HashMap<>();

    List<String> wordList1 = new ArrayList<>();

    Queue<Node> queue = new LinkedList<>();

    boolean visited[];

    List<List<String>> res= new ArrayList<>();

    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {


        if(!wordList.contains(endWord)){
            return new ArrayList<>();
        }


        for(String s:wordList){
            wordList1.add(s);
        }

        wordList1.add(beginWord);
        wordList1.add(endWord);

        for(int i=0;i<wordList1.size();i++){
            wordIndex.put(wordList1.get(i),i);
            wordMapping.put(wordList1.get(i),new ArrayList<>());
        }


        generateMappingMethodOne(wordList1);

        visited = new boolean[wordList1.size()];

        Node entryNode = new Node(beginWord,0,null);
        queue.offer(entryNode);
        //visited[wordIndex.get(beginWord)]=true;

        while(!queue.isEmpty()){

            Node pollNode = queue.poll();

            if(!visited[wordIndex.get(pollNode.str)]){

                visited[wordIndex.get(pollNode.str)]=true;

                for(String s:wordMapping.get(pollNode.str)){

                    if(s.equals(endWord)){
                        resultList(pollNode,endWord,beginWord);
                    }

                    queue.offer(new Node(s,pollNode.steps+1,pollNode));

                }
            }

        }

        if(res.size()>0){
            return res;
        }
        else{
            return new ArrayList<>();
        }


    }


    public void resultList(Node pollNode,String endWord,String beginWord){

        List<String> resListAdd = new ArrayList<>();
        resListAdd.add(endWord);

        while(pollNode.parent!=null){
            resListAdd.add(pollNode.str);
            pollNode = pollNode.parent;
        }
        resListAdd.add(beginWord);
        Collections.reverse(resListAdd);
        res.add(resListAdd);

    }



    public void generateMappingMethodOne(List<String> wordList){

        for(int i=0;i<wordList.size();i++){
            char[] chArr = wordList.get(i).toCharArray();
            for(int j=0;j<chArr.length;j++){
                char storeChar = chArr[j];
                for(int ch=0;ch<26;ch++){
                    chArr[j]= (char)(ch+97);
                    if(wordList.contains(String.valueOf(chArr)) && !(String.valueOf(chArr).equals(wordList.get(i)))){
                        // wordMapping.put(wordList.get(i),wordMapping.getOrDefault(wordList.get(i),new                                                                                ArrayList<>()).add(chArr.toString()));

                        wordMapping.get(wordList.get(i)).add(String.valueOf(chArr));
                    }
                }
                chArr[j]= storeChar;
            }
        }
    }

    class Node{

        String str;
        int steps;
        Node parent;

        Node(String str,int steps,Node parent){
            this.str=str;
            this.steps=steps;
            this.parent=parent;
        }

    }

}
