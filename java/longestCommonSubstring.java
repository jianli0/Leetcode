public class longestCommonSubstring{
    /**
     * @param A, B: Two string.
     * @return: the length of the longest common substring.
     */
    public static void main(String[] args){
        String s1 = "ABCD";
        String s2 = "CBCE";
        System.out.println(longestCommonSubstring(s1,s2));
    }

    public static int longestCommonSubstring(String A, String B) {
        int lenA = A.length();
        int lenB = B.length();
        int maxLen = 0;

        for (int i = 0; i < lenA ; i++){
            for (int j = 0; j < lenB ; j++){
                int length = 0;
                while ((i + length) < lenA && (j + length) < lenB &&
                      A.charAt(i + length) == B.charAt(j + length)){
                    length++;
                      }
                if (length > maxLen){
                    maxLen = length;
                }
            }
        }
        return maxLen;
    }
}
