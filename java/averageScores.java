import java.util.*;

class Score{
    int id;
    int score;
    public Score(int id, int score){
        this.id = id;
        this.score = score;
    }
}

public class averageScores{
    public static void main(String[] args){
        averageScores a = new averageScores();

        Score s1 = new Score(1, 30);
        Score s2 = new Score(1, 70);
        Score s3 = new Score(1, 100);
        Score s4 = new Score(1, 85);
        Score s5 = new Score(1, 80);
        Score s6 = new Score(1, 90);
        Score s7 = new Score(2, 101);
        Score s8 = new Score(2, 100);
        Score s9 = new Score(2, 102);
        Score s10 = new Score(3, 100);
        Score s11 = new Score(3, 65);

        List<Score> test = new ArrayList<Score>();
        test.add(s1);
        test.add(s2);
        test.add(s3);
        test.add(s4);
        test.add(s5);
        test.add(s6);
        test.add(s7);
        test.add(s8);
        test.add(s9);
        test.add(s10);
        test.add(s11);

        Map<Integer, Integer> res = a.averageScore(test);
        for(Map.Entry<Integer, Integer> entry: res.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    public Map<Integer, Integer> averageScore(List<Score> scores){
        Map<Integer, Integer> res = new HashMap<Integer, Integer>();
        if(scores == null || scores.size() == 0){
            return res;
        }
        Map<Integer, PriorityQueue<Integer>> map = new HashMap<Integer, PriorityQueue<Integer>>();
        for(Score s : scores){
            PriorityQueue<Integer> pq;
            if(map.containsKey(s.id)){
                pq = map.get(s.id);
            }else{
                pq = new PriorityQueue<Integer>(6);
            }
            pq.add(s.score);
            if(pq.size() > 5){
                pq.poll();
            }
            map.put(s.id, pq);
        }

        for(Map.Entry<Integer, PriorityQueue<Integer>> entry : map.entrySet()){
            int id = entry.getKey();
            PriorityQueue<Integer> pq = entry.getValue();

            int count = 0;
            int sum = 0;
            while(!pq.isEmpty()){
                int sc = pq.poll();
                sum += sc;
                count++;
            }

            res.put(id, sum / count);
        }
        return res;
    }
}

