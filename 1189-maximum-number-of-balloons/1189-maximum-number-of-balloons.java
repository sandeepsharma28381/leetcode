class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] arr = new int[26];

        for(char ch: text.toCharArray()){
            arr[ch - 'a']++;
        }
        return Math.min(arr['b' - 'a'], Math.min(arr['a' - 'a'], Math.min(arr['l' - 'a']/2, Math.min(arr['o' - 'a']/2, arr['n' - 'a']))));
    }
}