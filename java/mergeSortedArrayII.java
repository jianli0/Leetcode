import java.util.ArrayList;

public class mergeTwoSortedArrayII{
    public static void main(String[] args){
        ArrayList<Integer> A = new ArrayList<Integer>();
        A.add(1);
        A.add(3);
        A.add(5);
        A.add(7);

        ArrayList<Integer> B = new ArrayList<Integer>();
        B.add(1);
        B.add(3);
        B.add(5);
        B.add(7);

        System.out.println(mergeSortedArray(A,B).toString());

    }
    public static ArrayList<Integer> mergeSortedArray(ArrayList<Integer> A, ArrayList<Integer> B){
        ArrayList<Integer> C = new ArrayList<Integer>();
        int lenA = A.size();
        int lenB = B.size();
        int i = 0;
        int j = 0;

        while(i < lenA && j < lenB){
            if (A.get(i) < B.get(j)){
                C.add(A.get(i++));
            }
            else{
                C.add(B.get(j++));
            }
        }
        while(i < lenA){
            C.add(A.get(i++));
        }

        while(j < lenB){
            C.add(B.get(j++));
        }
        return C;
    }
}
