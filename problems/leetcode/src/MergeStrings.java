public class MergeStrings {

    static int word1pos = 0;
    static int word2pos = 0;
    public static String mergeAlternately(String word1, String word2) {
        StringBuffer sb = new StringBuffer();

        while (word1pos < word1.length() || word2pos < word2.length()){
            if (word1pos < word1.length()){
                sb.append(word1.charAt(word1pos));
            }

            if (word2pos < word2.length()){
                sb.append(word2.charAt(word2pos));
            }
            word1pos++;
            word2pos++;
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(mergeAlternately("ab", "pqrs"));
    }
}
