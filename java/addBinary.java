public class addBinary{
    public static void main(String[] args){
        String a = "1";
        String b = "111";
        System.out.println(addBinary(a,b));

        // String a1 = "11";
        // String b1 = "1";
        // System.out.println(addBinary(a1,b1));
    }
    public static String addBinary(String a, String b) {
        if (a.length() < b.length()){
            String tmp = a;
            a = b;
            b = tmp;
        }

        int pa = a.length() - 1;
        int pb = b.length() - 1;

        String res = "";
        int carrier = 0;
        int sum;

        while(pb >= 0){
            // System.out.format("pb is %d\n",pb);
            sum = (int)(a.charAt(pa) - '0') + (int)(b.charAt(pb) - '0') + carrier;
            res = String.valueOf(sum % 2) + res;
            carrier = sum / 2;
            pb--;
            pa--;
        }

        while(pa >= 0){
            sum = (int)(a.charAt(pa) - '0') + carrier;
            res = String.valueOf(sum % 2) + res;
            carrier = sum / 2;
            pa--;
        }

        if(carrier == 1){
           res = "1" + res;
        }

        return res;

    }
}
