public class interSection{
    public static void main(String[] args){

    }
    public static findIntersect(List<Integer> l1, List<Integer> l2){
        if (l1 == null or l2 == null){
            return null;
        }

        Collections.sort(l1);
        Collections.sort(l2);
        List<Integer> result = new LinkedList<Integer>();
        int i = 0;
        int j = 0;

        while (i < l1.size() && j < l2.size()){
            if(l1.get(i) == l2.get(j)){
                result.add(l1.get(i));
                i++;
                j++;
            }else{
                if(l1.get(i) < l2.get(j)){
                    i++;
                }else{
                    j++;
                }
            }
        }
        return result;
    }
}

