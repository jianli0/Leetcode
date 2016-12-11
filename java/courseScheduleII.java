import java.util.*;
public class courseScheduleII{
    public static void main(String[] args){
        int[][] test1 = new int[][]{
            {1, 0},
            {2, 0},
            {3, 1},
            {3, 2}
        };
        int[][] test2 = new int[][]{
            {0, 1},
            {3, 1},
            {1, 3},
            {3, 2}
        };
        int[] test = findOrder(4, test2);
        System.out.println(Arrays.toString(test));
    }

    public static int[] findOrder(int numCourses, int[][] prerequisites){
        int[] res = new int[numCourses];
        if(prerequisites.length == 0){
            for(int i = 0 ; i < numCourses; i++){
                res[i] = i;
            }
            return res;
        }
        // change prerequisites to an adjacent list
        List<List<Integer>> adj = new ArrayList<>(numCourses);
        for(int i = 0; i < numCourses; i++){
            adj.add(i, new ArrayList<>());
        }
        for(int i = 0; i < prerequisites.length; i++){
            adj.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }

        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for(List<Integer> l: adj){
            for(Integer i : l){
                if(!hm.containsKey(i)){
                    hm.put(i, 1);
                }else{
                    hm.put(i, hm.get(i) + 1);
                }
            }
        }

        Queue<Integer> q = new LinkedList<Integer>();
        for(int i = 0; i < numCourses; i++){
            if(!hm.containsKey(i)){
                q.offer(i);
            }
        }

        int index = 0;
        while(!q.isEmpty()){
            int num = q.poll();
            res[index] = num;
            for(Integer j : adj.get(num)){
                if(hm.get(j) == 1){
                    hm.remove(j);
                    q.offer(j);
                }else{
                    hm.put(j, hm.get(j) - 1);
                }
            }
            index++;
        }
        if(index == numCourses){
            return res;
        }else{
            return new int[0];
        }
    }
}

