class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        String ans = "";

        for(String word: arr){
            String rev = "";

            for(int i = word.length()-1; i >= 0; i--){
                rev += word.charAt(i);
            }
            ans += rev+" ";
        }
        return ans.trim();
    }
}