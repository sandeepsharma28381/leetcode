class Solution {
    public String mergeAlternately(String word1, String word2) {
        String str = "";

        int i = 0;
        while(i < word1.length() && i < word2.length()){
            str += ""+word1.charAt(i)+word2.charAt(i);
            i++;
        }
        while(i < word1.length()){
            str += word1.charAt(i);
            i++;
        }
        while(i < word2.length()){
            str += word2.charAt(i);
            i++;
        }
        return str;
    }
}