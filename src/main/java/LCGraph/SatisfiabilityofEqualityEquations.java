package LCGraph;

public class SatisfiabilityofEqualityEquations {

    public boolean equationsPossible(String[] equations) {


       int[] parent = initialization();

       for(String str:equations){

           char[] ch = str.toCharArray();

           if(ch[1]=='!') continue;

           union(ch[0]-'a',ch[3]-'a',parent);

       }

       for(String str:equations){

           char[] ch = str.toCharArray();

           if(ch[1]=='!'){
//               if(parent[0]==parent[3]){ // It can't be true. It should be find parent Node and if they are same that means equality is not true
               if(find(ch[0]-'a',parent)== find(ch[3]-'a',parent)) {
                   return false;
               }
           }

       }

       return true;
    }


    public int[] initialization(){

        int[] parent =new int[26];

        for(int i=0;i<26;i++){
            parent[i]=i;
        }
        return parent;
    }

    public void union(int x,int y,int[] parent){

        int findX= find(x,parent);
        int findY = find(y,parent);

        parent[findX]=findY;

    }

    public int find(int x, int[] parent){

        if(parent[x]!=x){
            //x=parent[x];
            parent[x]=find(parent[x],parent);
            return parent[x];
        }
        return x;
    }



}
