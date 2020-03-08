package IKGraphs;

import java.util.*;

public class StringTransformationUsingGivenWords {

    /*
       There are two ways
       1) build HashMap by taking one string and comparing with all others with just one char change O(n^2*len(word))
       2) change one character for all 26 character and see if it's there in given list (len(word)*26)*len(word)*n

       compare n & 26*len(word) and take decision based on that
     */

    /*
       use BFS for both


     */

    /*
    public static String[] string_transformation(String[] words, String start, String stop) {

         List<String> wordsList = new ArrayList<>();

         wordsList.add(start);
         wordsList.add(stop);

         for(int i=0;i<words.length;i++){
             if(!words[i].equals(start) && !words[i].equals(stop)) {
                 wordsList.add(words[i]);
             }
         }

         if(words.length > 26*start.length()){
            return method2(wordsList,start,stop);
         }
         else{
             return method1(wordsList,start,stop);
         }



    }

    private static String[] method1(List<String> wordsList, String start, String stop) {

        HashMap<String,List<String>> hm = new HashMap<>();

        HashMap<String,Integer> wToPos = new HashMap<>();

        for(int i=0;i<wordsList.size();i++){
            wToPos.put(wordsList.get(i),i);
        }

        for(int i=0;i<wordsList.size();i++){
            for(int j=0;j<wordsList.size();j++){

                if(i==j) continue;

                if(neighbor(wordsList.get(i),wordsList.get(j))){
                    if(hm.get(wordsList.get(i))==null){
                        hm.put(wordsList.get(i),new ArrayList<>());
                        hm.get(wordsList.get(i)).add(wordsList.get(j));
                    }
                    else{
                        hm.get(wordsList.get(i)).add(wordsList.get(j));
                    }
                }
            }
        }

        boolean[] visited = new boolean[wordsList.size()];

        Queue<Node> bfs = new LinkedList<>();

        bfs.add(new Node(start,null));

        visited[wToPos.get(start)]=true;

        while(!bfs.isEmpty()){

            Node removedNode = bfs.poll();

            //Edge case don't forget
            if(hm.get(removedNode.word)==null){
                continue;
            }

            for(String s:hm.get(removedNode.word)){

                //Done , dont' forget
                if(s.matches(stop)){
                    return getPath(new Node(stop,removedNode));
                }

                if(!visited[wToPos.get(s)]) {
                    visited[wToPos.get(s)]=true;
                    bfs.add(new Node(s, removedNode));
                }

            }

        }

        String[] res = new String[1];
        res[0]="-1";
        return res;




    }

    private static String[] getPath(Node node) {

        List<String> al = new ArrayList<>();

        while(node!=null){
            al.add(node.word);
            node=node.parent;
        }

        Collections.reverse(al);

        String[] res = new String[al.size()];

        for(int i=0;i<al.size();i++){
            res[i]=al.get(i);
        }
       return res;
    }

    private static boolean neighbor(String s, String s1) {

        int ind = 0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=s1.charAt(i)) {
                ind++;
            }
            if(ind>1) return false;
        }
        return true;

    }

    private static String[] method2(List<String> wordsList, String start, String stop) {
        //TODO: need to implement
       return  method1(wordsList,start,stop);
    }


    public static class Node{

       public String word;
       public Node parent;

        Node(String word, Node parent) {
            this.word = word;
            this.parent = parent;
        }

        //why? don't know
        boolean equals(Node p){

            if(p.equals(this)){
                return true;
            }

            if(p.word.matches(this.word) && p.parent.equals(this.parent)){
                return true;
            }

            return false;

        }

    }
    */



/*   Starts from here


    static class Node{

        String word;
        Node parent;

        Node(String word,Node parent){
            this.word=word;
            this.parent=parent;
        }
    }

    static boolean[] visited;
    static Queue<Node> queue;
    static HashMap<String,List<Integer>> wordNeighbourList;
    static HashMap<String,Integer> wordToIndexList;
    static List<String> wordList;

    public static String[] string_transformation(String[] words, String start, String stop) {

        wordList = new ArrayList<String>();
        wordToIndexList = new HashMap<String,Integer>();
        queue = new LinkedList<Node>();

        wordList.add(start);
        wordList.add(stop);

        for(int i=0;i<words.length;i++){
            wordList.add(words[i]);
            //wordToIndexList.put(words[i],i); // we also need to add start and stop to wordToIndexList , so that visited can also take that into consideration
        }

        for(int i=0;i<wordList.size();i++){
            wordToIndexList.put(wordList.get(i),i);
        }

        visited = new boolean[wordList.size()];

        if(26*start.length() < words.length){
            return method2WhenNumberOfWordsAreBigger(start,stop);
        }
        else{
            return method1WhenNumberOfWordsAreLesser(start,stop);
        }


    }

    static String[] method2WhenNumberOfWordsAreBigger(String start,String stop){

        wordNeighbourList =makeNeigbourListBygoingEachCharacter(wordList,wordToIndexList);

        return commonfunction(start,stop);

    }


    static String[] commonfunction(String start,String stop){

        visited[wordToIndexList.get(start)]=true;
        queue.offer(new Node(start,null));

        while(!queue.isEmpty()){

            Node pop = queue.poll();

//            We can't do this -- input wordList empty , zzzzzz source , zzzzzz destination -- if we have below it'll return zzzzzz , which is wrong
//            if(stop.equals(pop.word)){
//                return path(pop);  //Also correct but you need to wait until this got picked up from queue. If you did it when you see this as a neighbour , it will be
//                //quick operation
//            }


            if(wordNeighbourList.get(pop.word)==null) {
                continue;
            }

            for(Integer nI : wordNeighbourList.get(pop.word)){

                if(wordList.get(nI).equals(stop)) { //how to know where to stop
                    return path(new Node(wordList.get(nI), pop)); // what should I provide here
                }

                if(!visited[nI]){
                    visited[nI]=true;
                    queue.offer(new Node(wordList.get(nI),pop));
                }

            }
        }

        String[] res= new String[1];
        res[0]="-1";
        return res;
    }

    private static HashMap<String, List<Integer>> makeNeigbourListBygoingEachCharacter(List<String> wordList, HashMap<String, Integer> wordToIndexList) {

        wordNeighbourList = new HashMap<String, List<Integer>>();

        for (int i = 0; i < wordList.size(); i++) {
            char[] arr = wordList.get(i).toCharArray();
            for (int j = 0; j < wordList.get(i).length(); j++) {
                char origin=arr[j];
                for (char c = 'a'; c <= 'z'; c++) {
                    if(c==arr[j]) continue;
                    arr[j]=c;
                    if(wordToIndexList.get(String.valueOf(arr))!=null){
                        if(!wordNeighbourList.containsKey(wordList.get(i))){
                            wordNeighbourList.put(wordList.get(i),new ArrayList<Integer>());
                            wordNeighbourList.get(wordList.get(i)).add(wordToIndexList.get(String.valueOf(arr)));
                        }
                        else{
                            wordNeighbourList.get(wordList.get(i)).add(wordToIndexList.get(String.valueOf(arr)));
                        }
                    }
                }
                arr[j]=origin;
            }


        }
        return  wordNeighbourList;
    }


    static String[] method1WhenNumberOfWordsAreLesser(String start,String stop){


        wordNeighbourList = makeNeigbourList(wordList,wordToIndexList);

        return commonfunction(start,stop);


    }

    static HashMap<String,List<Integer>> makeNeigbourList(List<String>wordList,HashMap<String,Integer> wordToIndexList){

        wordNeighbourList = new HashMap<String,List<Integer>>();
        for(int i=0;i<wordList.size();i++){
            for(int j=0;j<wordList.size();j++){

                if(i==j) continue;

                if(isNeighbour(wordList.get(i),wordList.get(j))){
                    if(!wordNeighbourList.containsKey(wordList.get(i))){
                        wordNeighbourList.put(wordList.get(i),new ArrayList<Integer>());
                        wordNeighbourList.get(wordList.get(i)).add(wordToIndexList.get(wordList.get(j)));
                    }
                    else{
                        wordNeighbourList.get(wordList.get(i)).add(wordToIndexList.get(wordList.get(j)));
                    }
                }
            }
        }
        return wordNeighbourList;

    }

    static boolean isNeighbour(String src,String dest){
        int diff=0;
        for(int i=0;i<src.length();i++){

            if(src.charAt(i)!=dest.charAt(i)){
                diff++;
                if(diff>1){
                    return false;
                }
            }

        }
        return diff==1;
    }

    static String[] path(Node node){

        List<String> res = new ArrayList<String>();

        while(node!=null){
            res.add(node.word);
            node= node.parent;
        }
        Collections.reverse(res);
        return res.toArray(new String[res.size()]);
    }

    */

    static class Node{

        String word;
        Node parent;

        Node(String word,Node parent){
            this.word=word;
            this.parent=parent;
        }

    }

    static List<String> wordList = new ArrayList<String>();
    static HashMap<String,List<String>> hmWordMapping = new HashMap<>();


    static public String[] string_transformation(String[] words, String start, String stop) {

        for(String word:words){
            wordList.add(word);
        }
        wordList.add(start);
        wordList.add(stop);

        if(words.length<26*start.length()){
            generateMapping1(hmWordMapping,wordList);
        }

        else{
            generateMapping2(hmWordMapping,wordList);
        }

        Queue<Node> queue= new LinkedList<Node>();
        HashSet<String> visited=new HashSet<>();

        queue.offer(new Node(start,null));

        while(!queue.isEmpty()){

            Node pulledNode = queue.poll();

//            if(pulledNode.word==stop){
//                return returnNodeList(pulledNode);
//            }

            if(!visited.contains(pulledNode.word)){

                visited.add(pulledNode.word);

                for(String i:hmWordMapping.getOrDefault(pulledNode.word,new ArrayList<>())){

                    if(i.equals(stop)){
                        return returnNodeList(new Node(i,pulledNode)); //As soon as we reach the endNode, we stoped it
                    }

                    queue.offer(new Node(i,pulledNode));
                }

            }
        }

        return new String[]{"-1"};

    }


    public static void generateMapping1(HashMap<String,List<String>> hm, List<String> wordList){

        for(int i=0;i<wordList.size();i++){
            for(int j=0;j<wordList.size();j++){
                if(i!=j){
                    if(diff(wordList.get(i),wordList.get(j))==1) {
                        if (!hm.containsKey(wordList.get(i))){
                            hm.put(wordList.get(i),new ArrayList<>());
                            hm.get(wordList.get(i)).add(wordList.get(j));
                        }
                        else {
                            hm.get(wordList.get(i)).add(wordList.get(j));
                        }
                    }
                }
            }
        }
    }


    //Todo: Look at the loop structure -- Int-->convert String to charArray--> Int-->till charArr lenth -->Char--> a to z
    public static void generateMapping2(HashMap<String,List<String>> hm, List<String> wordList){

        for(int i=0;i<wordList.size();i++){  //Int loop
            char[] arr = wordList.get(i).toCharArray(); //Imp to convert here first
            for(int j=0;j<arr.length;j++){ // Int loop with char arr length
                char temp=arr[j];
                for(char k='a';k<='z';k++){ // char array to ease comparision
                    if(arr[j]!=k){
                        //char temp=arr[j]; Not here RED FLAG as values is changing here and we need to get back to original string after k loop
                        arr[j]=k;
                        if(wordList.contains(String.valueOf(arr))){ //No arr.toString()
                            if(!hm.containsKey(wordList.get(i))){
                                hm.put(wordList.get(i),new ArrayList<>());
                                hm.get(wordList.get(i)).add(arr.toString());
                            }
                            else {
                                hm.get(wordList.get(i)).add(String.valueOf(arr)); // No arr.toString()
                            }
                        }
                    }
                }
                arr[j]=temp;
            }
        }
    }


    public static int diff(String s, String t){

        int i=0;
        int count=0;

        while(i<s.length() && i<t.length()){

            if(s.charAt(i)!=t.charAt(i)){
                count++;
            }
            i++;
        }
        if(i==s.length() && i==t.length()){
            return count;
        }
        else{
            return -1;
        }

    }

    public static String[] returnNodeList(Node node){

        List<String> res = new ArrayList<String>();

        while(node.parent!=null){
            res.add(node.word);
            node=node.parent;
        }
        res.add(node.word);

        Collections.reverse(res);

        return res.toArray(new String[res.size()]);


    }



}
