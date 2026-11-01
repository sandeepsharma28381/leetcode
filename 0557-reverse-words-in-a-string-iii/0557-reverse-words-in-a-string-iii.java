class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder rev = new StringBuilder();

        for(String word: words){
            StringBuilder revWord = new StringBuilder(word);
            revWord.reverse();
            rev.append(revWord).append(" ");

        }
        return rev.toString().trim();
    }
}