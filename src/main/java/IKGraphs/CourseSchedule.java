package IKGraphs;


import java.util.*;

//Stack here is for return value , we need to give the full order.

public class CourseSchedule {


    public static List<Integer> course_schedule(int n, List<List<Integer>> prerequisites) {

        HashMap<Integer, List<Integer>> hm = createGraph(prerequisites, n);


        for (Map.Entry<Integer, List<Integer>> entry : hm.entrySet()) {
            System.out.print("Key = " + entry.getKey() +
                             ", Value =  ");

            for (Integer ch : entry.getValue()) {
                System.out.print(ch + " ");
            }

            System.out.println();
        }

        return topologicalSort(0, hm, n);

    }


    public static HashMap<Integer, List<Integer>> createGraph(List<List<Integer>> prerequisites, int n) {

        HashMap<Integer, List<Integer>> hm = new HashMap<>();

        for (int i = 0; i < prerequisites.size(); i++) {
            if (!hm.containsKey(prerequisites.get(i).get(1))) {
                hm.put(prerequisites.get(i).get(1), new ArrayList<>());
                hm.get(prerequisites.get(i).get(1)).add(prerequisites.get(i).get(0));
            } else {
                hm.get(prerequisites.get(i).get(1)).add(prerequisites.get(i).get(0));
            }
        }

        for (int i = 0; i < n; i++) {
            if (!hm.containsKey(i)) {
                hm.put(i, new ArrayList<>());
            }
        }
        return hm;
    }


    static List<Integer> topologicalSort(Integer vertex, HashMap<Integer, List<Integer>> hm, int n) {

        Set<Integer> visited = new HashSet<>();

        Stack<Integer> stack = new Stack<>();

        List<Integer> startTime = new ArrayList<>(n);

        List<Integer> endTime = new ArrayList<>(n);

        for(int i=0;i<n;i++){
            startTime.add(-1);
            endTime.add(-1);
        }

        int startEndTime = 0;

        for (int i = 0; i < n; i++) {
            if (!visited.contains(i)) {
                visited.add(i);
                startEndTime++;
                startTime.set(i,startEndTime);
                if(topologicalSortHelper(i, hm, visited, stack,startTime,endTime,startEndTime).peek()==-1){
                    return Arrays.asList(-1);
                }
            }
            else{
                if(endTime.get(i)==-1){
                    return Arrays.asList(-1);
                }
            }
        }
        startEndTime++;
        endTime.set(vertex,startEndTime);
        List<Integer> ret = new ArrayList<Integer>();
        while (!stack.isEmpty()) {
            ret.add(stack.pop());
        }

        return ret;

    }

    static Stack<Integer> topologicalSortHelper(Integer vertex, HashMap<Integer, List<Integer>> hm, Set<Integer> visited,
                                                Stack<Integer> stack,List<Integer> startTime, List<Integer> endTime,Integer startEndTime) {

        for (Integer neighbour : hm.get(vertex)) {
            if (!visited.contains(neighbour)) {
                visited.add(neighbour);
                startEndTime++;
                startTime.set(neighbour,startEndTime);
                if(topologicalSortHelper(neighbour, hm, visited, stack, startTime, endTime, startEndTime).peek()==-1){
                    stack.clear();
                    stack.push(-1);
                    return stack;
                }
            } else {
                //cycle check??
                if (endTime.get(neighbour) == -1) {
                    stack.clear();
                    stack.push(-1);
                    return stack;
                }
            }
        }
            startEndTime++;
            endTime.set(vertex,startEndTime);
            stack.push(vertex);
            return stack;
    }


}
